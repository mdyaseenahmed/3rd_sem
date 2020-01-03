/******************************************************************************

Develop a Java program so that it creates a thread (let's call it Thread 1). 
Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; 
and so on, up to Thread 5. Each thread should print "Hello from Thread <num>!",
but you should structure your program such that the threads print their greetings
in reverse order. 

*******************************************************************************/
import java.io.*;

class Thread_1 extends Thread
{
    int n;
    Thread_1(int a)
    {
        n = a;
        this.start();
    }
    
    public void run()
    {
        try
        {
            if(n<=5)
            {
                Thread_1 t = new Thread_1(n+1);
                this.sleep(2000/n);
                System.out.println("HELLO FROM THREAD"+n+" !");
            }
            
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}

public class Hello_Thread_P5
{
	public static void main(String[] args) {
		try
		{
		    Thread_1 t1 = new Thread_1(1);
		}catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
