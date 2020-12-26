class NewThread implements Runnable
{ Thread t;
   NewThread()
   {
     t=new Thread(this, "NThread");
	 System.out.println("CT:"+t);
	 t.start();
   }
   
  public void run()
   {
	   try
	   {
		   for(int n=5;n>0;n--)
		   {
			 System.out.println("Child:"+n);
			 Thread.sleep(500);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Child Thread Interrupted");
	   }
	   System.out.println("Child Thread quitting");
   }
}

class Thread2
{
	public static void main(String ss[])
	{
		new NewThread();
		System.out.println("Back in main");
		
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Main Thread quitting");
	}
}