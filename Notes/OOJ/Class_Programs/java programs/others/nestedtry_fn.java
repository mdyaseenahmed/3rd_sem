class nestedtry_fn
{
	static void f1(int x)
	{
		try
		   {   int c1=10/x;
			   int a[]={1,2};
			   a[2]=10;
		   }
		   catch(ArrayIndexOutOfBoundsException ai)
		   {  System.out.println("Inside innertry-AIOB");}	
		
	}
	
	public static void main(String ss[])
	{
		try
		{
		   System.out.println("Inside main");
		   int x=ss.length;
		   int c=10/x;
		   f1(x);
		   
		}
		catch(ArithmeticException ae)
		{System.out.println("Inside outer try--AE caught in main");}
		
	}
}
	
			
		   
