class nestedtry
{
	
	public static void main(String ss[])
	{
		try
		{
		   System.out.println("Inside main");
		   int c=10/ss.length;
		   try
		   {   int c1=10/ss.length;
			   int a[]={1,2};
			   a[2]=10;
		   }
		   catch(ArrayIndexOutOfBoundsException ai)
		   {  System.out.println("Inside innertry-AIOB");}
		   
		}
		catch(ArithmeticException ae)
		{System.out.println("Inside outer try--AE caught in main");}
		
	}
}
	
			
		   
