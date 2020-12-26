class CSE implements Runnable
{
    Thread t;
    CSE()
    {
        t = new Thread(this,"CSE Thread");
        t.start();
    }
    
    public void run()
    {
        try
        {
            for(int i = 0;i < 5;i++)
            {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

public class BMSThreadDemo
{
	public static void main(String[] args) 
	{
		CSE n1 = new CSE();
		try
		{
		    for(int j = 0;j<5;j++)
		    {
		        System.out.println("BMS College Of Engineering.");
		        Thread.sleep(10000);
		    }
		}catch(InterruptedException e)
		{
		    System.out.println(e);
		}
	}
}
