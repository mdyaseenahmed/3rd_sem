class throwsdemo
{
   static void thr() throws IllegalAccessException
   {
		throw new IllegalAccessException();
   }
   
   public static void main(String ss[])
   {
      try
		{
	     thr();
	    }
	    catch(IllegalAccessException ie)
	    {
		  System.out.println("Caught IllegalAccessException");
	    }	
   }
}



