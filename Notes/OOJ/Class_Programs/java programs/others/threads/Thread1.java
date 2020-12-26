class Thread1
{
  public static void main(String ss[])
  {
    Thread t=Thread.currentThread();
	System.out.println("CT:"+t);
	
	t.setName("Current main Thread");
	System.out.println("CT:"+t);
	
	try
	{
		for(int n=5;n>0;n--)
		{
		  System.out.println(n);
		  Thread.sleep(1000);
		} 
	}
	catch(InterruptedException ie)
	{  System.out.println("The sleeping thread is woken up");}
  }	
}
	