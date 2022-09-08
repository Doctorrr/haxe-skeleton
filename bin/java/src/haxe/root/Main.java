package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		haxe.java.Init.init();
		haxe.root.Main.main();
	}
	
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 4 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	protected static void __hx_ctor__Main(haxe.root.Main __hx_this)
	{
	}
	
	
	public static void main()
	{
		//line 8 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		java.lang.Object playerA = new haxe.lang.DynamicObject(new java.lang.String[]{"move", "name"}, new java.lang.Object[]{haxe.root.Move.Paper, "Simon"}, new java.lang.String[]{}, new double[]{});
		//line 9 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		java.lang.Object playerB = new haxe.lang.DynamicObject(new java.lang.String[]{"move", "name"}, new java.lang.Object[]{haxe.root.Move.Rock, "Nicolas"}, new java.lang.String[]{}, new double[]{});
		//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		haxe.root.Result result = null;
		//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		haxe.root.Move _g = ((haxe.root.Move) (haxe.lang.Runtime.getField(playerB, "move", true)) );
		//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		switch (((haxe.root.Move) (haxe.lang.Runtime.getField(playerA, "move", true)) ))
		{
			case Rock:
			{
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				switch (_g)
				{
					case Paper:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerB);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					case Scissors:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerA);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					default:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Draw;
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
				}
				
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				break;
			}
			
			
			case Paper:
			{
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				switch (_g)
				{
					case Rock:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerA);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					case Scissors:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerB);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					default:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Draw;
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
				}
				
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				break;
			}
			
			
			case Scissors:
			{
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				switch (_g)
				{
					case Rock:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerB);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					case Paper:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Winner(playerA);
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
					
					default:
					{
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						result = haxe.root.Result.Draw;
						//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
						break;
					}
					
				}
				
				//line 12 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
				break;
			}
			
			
		}
		
		//line 24 "/home/doctorrr/apps/haxe-economy/src/Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, ( "result: " + haxe.root.Std.string(result) ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "src/Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
	}
	
	
}


