package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Result extends haxe.lang.ParamEnum
{
	public Result(int index, java.lang.Object[] params)
	{
		//line 240 "/usr/share/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Winner", "Draw"};
	
	public static haxe.root.Result Winner(java.lang.Object player)
	{
		//line 36 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		return new haxe.root.Result(0, new java.lang.Object[]{player});
	}
	
	
	public static final haxe.root.Result Draw = new haxe.root.Result(1, null);
	
	@Override public java.lang.String getTag()
	{
		//line 35 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		return haxe.root.Result.__hx_constructs[this.index];
	}
	
	
}


