(function ($global) { "use strict";
var $estr = function() { return js_Boot.__string_rec(this,''); },$hxEnums = $hxEnums || {},$_;
var Main = function() { };
Main.__name__ = true;
Main.main = function() {
	var playerA = { name : "Simon", move : Move.Paper};
	var playerB = { name : "Nicolas", move : Move.Rock};
	var result;
	var _g = playerB.move;
	switch(playerA.move._hx_index) {
	case 0:
		switch(_g._hx_index) {
		case 1:
			result = Result.Winner(playerB);
			break;
		case 2:
			result = Result.Winner(playerA);
			break;
		default:
			result = Result.Draw;
		}
		break;
	case 1:
		switch(_g._hx_index) {
		case 0:
			result = Result.Winner(playerA);
			break;
		case 2:
			result = Result.Winner(playerB);
			break;
		default:
			result = Result.Draw;
		}
		break;
	case 2:
		switch(_g._hx_index) {
		case 0:
			result = Result.Winner(playerB);
			break;
		case 1:
			result = Result.Winner(playerA);
			break;
		default:
			result = Result.Draw;
		}
		break;
	}
	console.log("src/Main.hx:24:","result: " + Std.string(result));
};
var Move = $hxEnums["Move"] = { __ename__:true,__constructs__:null
	,Rock: {_hx_name:"Rock",_hx_index:0,__enum__:"Move",toString:$estr}
	,Paper: {_hx_name:"Paper",_hx_index:1,__enum__:"Move",toString:$estr}
	,Scissors: {_hx_name:"Scissors",_hx_index:2,__enum__:"Move",toString:$estr}
};
Move.__constructs__ = [Move.Rock,Move.Paper,Move.Scissors];
var Result = $hxEnums["Result"] = { __ename__:true,__constructs__:null
	,Winner: ($_=function(player) { return {_hx_index:0,player:player,__enum__:"Result",toString:$estr}; },$_._hx_name="Winner",$_.__params__ = ["player"],$_)
	,Draw: {_hx_name:"Draw",_hx_index:1,__enum__:"Result",toString:$estr}
};
Result.__constructs__ = [Result.Winner,Result.Draw];
Math.__name__ = true;
var Std = function() { };
Std.__name__ = true;
Std.string = function(s) {
	return js_Boot.__string_rec(s,"");
};
var haxe_iterators_ArrayIterator = function(array) {
	this.current = 0;
	this.array = array;
};
haxe_iterators_ArrayIterator.__name__ = true;
haxe_iterators_ArrayIterator.prototype = {
	hasNext: function() {
		return this.current < this.array.length;
	}
	,next: function() {
		return this.array[this.current++];
	}
};
var js_Boot = function() { };
js_Boot.__name__ = true;
js_Boot.__string_rec = function(o,s) {
	if(o == null) {
		return "null";
	}
	if(s.length >= 5) {
		return "<...>";
	}
	var t = typeof(o);
	if(t == "function" && (o.__name__ || o.__ename__)) {
		t = "object";
	}
	switch(t) {
	case "function":
		return "<function>";
	case "object":
		if(o.__enum__) {
			var e = $hxEnums[o.__enum__];
			var con = e.__constructs__[o._hx_index];
			var n = con._hx_name;
			if(con.__params__) {
				s = s + "\t";
				return n + "(" + ((function($this) {
					var $r;
					var _g = [];
					{
						var _g1 = 0;
						var _g2 = con.__params__;
						while(true) {
							if(!(_g1 < _g2.length)) {
								break;
							}
							var p = _g2[_g1];
							_g1 = _g1 + 1;
							_g.push(js_Boot.__string_rec(o[p],s));
						}
					}
					$r = _g;
					return $r;
				}(this))).join(",") + ")";
			} else {
				return n;
			}
		}
		if(((o) instanceof Array)) {
			var str = "[";
			s += "\t";
			var _g = 0;
			var _g1 = o.length;
			while(_g < _g1) {
				var i = _g++;
				str += (i > 0 ? "," : "") + js_Boot.__string_rec(o[i],s);
			}
			str += "]";
			return str;
		}
		var tostr;
		try {
			tostr = o.toString;
		} catch( _g ) {
			return "???";
		}
		if(tostr != null && tostr != Object.toString && typeof(tostr) == "function") {
			var s2 = o.toString();
			if(s2 != "[object Object]") {
				return s2;
			}
		}
		var str = "{\n";
		s += "\t";
		var hasp = o.hasOwnProperty != null;
		var k = null;
		for( k in o ) {
		if(hasp && !o.hasOwnProperty(k)) {
			continue;
		}
		if(k == "prototype" || k == "__class__" || k == "__super__" || k == "__interfaces__" || k == "__properties__") {
			continue;
		}
		if(str.length != 2) {
			str += ", \n";
		}
		str += s + k + " : " + js_Boot.__string_rec(o[k],s);
		}
		s = s.substring(1);
		str += "\n" + s + "}";
		return str;
	case "string":
		return o;
	default:
		return String(o);
	}
};
String.__name__ = true;
Array.__name__ = true;
js_Boot.__toStr = ({ }).toString;
Main.main();
})({});
