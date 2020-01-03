/*Write a program which creates two threads, one thread displaying “BMS College of Engineering” once every ten seconds and another displaying “CSE” once every two seconds.*/

import java.lang.*;
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
            for(;;)
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
		System.out.println("Press Ctrl C To Exit.!");
		try
		{
		    for(;;)
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
