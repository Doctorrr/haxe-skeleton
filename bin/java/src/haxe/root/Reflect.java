package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Reflect extends haxe.lang.HxObject
{
	public Reflect(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Reflect()
	{
		//line 28 "/usr/share/haxe/std/java/_std/Reflect.hx"
		haxe.root.Reflect.__hx_ctor__Reflect(this);
	}
	
	
	protected static void __hx_ctor__Reflect(haxe.root.Reflect __hx_this)
	{
	}
	
	
	public static java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		//line 38 "/usr/share/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 39 "/usr/share/haxe/std/java/_std/Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, false);
		}
		
		//line 41 "/usr/share/haxe/std/java/_std/Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 46 "/usr/share/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 47 "/usr/share/haxe/std/java/_std/Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, false);
		}
		else
		{
			//line 49 "/usr/share/haxe/std/java/_std/Reflect.hx"
			haxe.lang.Runtime.slowSetField(o, field, value);
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 83 "/usr/share/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 84 "/usr/share/haxe/std/java/_std/Reflect.hx"
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			//line 85 "/usr/share/haxe/std/java/_std/Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_getFields(ret);
			//line 86 "/usr/share/haxe/std/java/_std/Reflect.hx"
			return ret;
		}
		else
		{
			//line 87 "/usr/share/haxe/std/java/_std/Reflect.hx"
			if (( o instanceof java.lang.Class )) 
			{
				//line 88 "/usr/share/haxe/std/java/_std/Reflect.hx"
				return haxe.root.Type.getClassFields(((java.lang.Class) (o) ));
			}
			else
			{
				//line 90 "/usr/share/haxe/std/java/_std/Reflect.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			}
			
		}
		
	}
	
	
}


