/*Write a Java Program That Uses Non Recusive Functions To Print the nth Value of The Fibonacci Sequence.*/

import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args) 
{		
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The nth Index Of The Series : ");
		n = ip.nextInt();
		fibonacci(n);
	}
	
	static void fibonacci(int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(getfib(i)+" ");
	    }
	}
	
	static int getfib(int n)
	{
	    int f=1,s=1,nth=1;
	    if(n==0)
	    return 0;
	    else if(n==1)
	    return 1;
	    else
	    for(int i=2;i<n;i++)
	    {
	        nth=f+s;
	        f=s;
	        s=nth;
	    }
	   return nth; 
	}
}
