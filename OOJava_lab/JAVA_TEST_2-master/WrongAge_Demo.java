/*Write a Program That Demostrates Handling Of Exceptions in Inheritance tree. Create a Base Class Called “Father” & Derived Class Called “Son” which extends the Base Class. In Father Class, implement a constructor which takes the age & Throws the Exception WrongAge() when the input age<0. In Class, implement a constructor that cases both father & son’s age is >= father’s age.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class WrongAge extends Exception
{
    int a,b;
    WrongAge(int x)    
    {
        a = x;
        System.out.println("Age Cannot Be "+a);
    }
    
    WrongAge(int x,int y)
    {
        a = x;
        b = y;
        if(b>a)
        System.out.println("Son Age is > Than Father Age.");
        else if(b==a)
        System.out.println("Son Age is = To Father Age.");
        System.out.println("Father Age : "+a+"\nSon Age : "+b);
    }
}

class Father
{
    int fage;
    Scanner ip = new Scanner(System.in);
    Father()
    {
        try
        {
            System.out.print("Enter The Father's Age : ");
		    fage = ip.nextInt();
            if(fage<=0) 
            {
                throw new WrongAge(fage);
            }
            else
            {
                System.out.println("Father Age : "+fage);
            }
        }catch(WrongAge e)  
            {
                System.out.println(e);
        }
    }
}

class Son extends Father
{
    int sage;
    	Scanner ip = new Scanner(System.in);
    Son()
    {
      try
        {
            System.out.print("Enter The Son's Age : ");
            sage = ip.nextInt();
            if(sage<=0)
            {
                throw new WrongAge(sage);
            }
        
            else if(sage>=fage)
            {
                throw new WrongAge(fage,sage);
            }
        
            else
            {
            System.out.println("Father Age : "+fage);  
            System.out.println("Son Age : "+sage);
        }
    }catch(WrongAge e)
        {
        System.out.println(e);
        }
    }
}

public class WrongAge_Demo
{
	public static void main(String[] args) 
	{
	    Son s1 = new Son();
	}
}
