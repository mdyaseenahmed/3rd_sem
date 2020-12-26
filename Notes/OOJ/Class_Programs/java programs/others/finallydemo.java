class finallydemo
{
	static void f1()
	{
		try
		{
			System.out.println("Inside f1()");
			throw new NullPointerException();
		}
		finally
		{
			System.out.println("Inside f1()- finally");
		}
	}

	static void f2()
	{	
		try
		{
			System.out.println("Inside f2()");
			int c=10/0;
			
			return;
		}
			
			finally
		{
			System.out.println("Inside f2()- finally");
		}
	}
	
	static void f3()
	{
	      try
		  {
		  	System.out.println("Inside f3()");
		  }
		  finally
		  {
			System.out.println("Inside f3()- finally");
		  }
	}
	
	public static void main(String xx[])
	{
		try
		{
			f1();
			
		}
		catch(Exception e)
		{ System.out.println("Caught an exception in outer");}
		f2();
		f3();
	}
}