class staticdemo
{
static int count;
staticdemo(){count++;}
static void dispcount(){System.out.println(count);}
}
	
class staticmain
{
	static int x=10;
	
	static void disp()
	{ System.out.println(x);}
	/*void disp1()
	{System.out.println(x+" "+y);}*/
	static
	{ System.out.println("hello welcome");}
	public static void main(String ss[])
	{staticdemo s1=new staticdemo();
		System.out.println(x);
		disp();
		staticdemo s2=new staticdemo();
	staticdemo.dispcount();
	}
	static 
	{System.out.println("BYE");}
	
	
}	
	
	
