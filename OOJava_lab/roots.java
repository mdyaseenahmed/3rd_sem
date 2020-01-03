//Java Program To Print All The Real Solutions To The Quadratic Equation ax^2+bx+c=0

import java.io.*;
import java.util.*;

class roots
{
	public static void main(String args[])
	{
		int a,b,c;
		double d,r1,r2;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter The Coefficients Of ax^2+bx+c=0 : ");
		a=ip.nextInt();
		b=ip.nextInt();
		c=ip.nextInt();
		if(a==0)
		System.out.println("Roots Doesn't Exists..,Entera Non Zero Value For a.");
		else
		{
			d=(b*b)-(4*a*c);
			if(d>0)
			{
				System.out.println("Roots Are Real & Not Equal.");
				r1=(-b+Math.sqrt(d))/(2*a);
				r2=(-b-Math.sqrt(d))/(2*a);
				System.out.println("Root1 : "+r1+"\tRoot2 : "+r2);	
			}

			else if(d==0)
			{
				System.out.println("Roots Are Real & Equal.");
				r1=(-b)/(2*a);
				r2=r1;
				System.out.println("Root1 : "+r1+"\tRoot2 : "+r2);
			}

			else if(d<0)
			{
				System.out.println("Roots Are Imaginary.");
			}
		}
	}
}