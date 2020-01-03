/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea().
Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape.
Each one of the classes contain only the method printArea( ) that prints the area of the given shape.*/

import java.util.*;
import java.io.*;
import java.lang.*;

abstract class shape
{
	int l,w;
    	abstract void printArea();
}

class Rectangle extends shape
{
	Rectangle(int a,int b)
    	{
	        super.l = a;
	        super.w = b;
	}
    
    	public void printArea()
    	{
	        double area=l*w;
	        System.out.println("---------------------");
	        System.out.println("Area Of Rectangle : "+area);
	        System.out.println("----------------------");
	}
}

class Triangle extends shape
{
	Triangle(int a,int b)   
    	{
	        super.l = a;
	        super.w = b;
	}
    
    	public void printArea()
    	{
	        double area = 0.5*l*w;
	        System.out.println("---------------------");
	        System.out.println("Area Of Triangle : "+area);
	        System.out.println("----------------------");
	}
}

class Circle extends shape
{
	Circle(int rad)
    	{
	        super.l = rad;
	}
    
    	public void printArea()
    	{
	        double area = 3.141*l*l;
	        System.out.println("---------------------");
	        System.out.println("Area Of Circle : "+area);
	        System.out.println("---------------------");
	}
}

public class abs_shape 
{
	public static void main(String[] args) 
	{
		int x,y,c;
		int r;
		Scanner i = new Scanner(System.in);
	    	do
	    	{
		        System.out.println("----------");
		        System.out.println("Main Menu");
		        System.out.println("----------");
		        System.out.println("The Choices Are : ");
		        System.out.println("1.Area Of Rectangle.\n2.Area Of Triangle.\n3.Area Of Circle.\n4.Exit");
		        System.out.println("------------------");

		        System.out.print("Enter Your Choice : ");
		        c = i.nextInt();
	        
	        switch(c)
	        {
	         	case 1 : System.out.print("Enter The Length : ");
	                   x = i.nextInt();
		                 System.out.print("Enter The Breadth : ");
		                 y = i.nextInt();
		                 Rectangle rect = new Rectangle(x,y);
		                 rect.printArea();
				             break;
	                
	          case 2 : System.out.println("Enter The Base : ");
	                   x = i.nextInt();
		                 System.out.println("Enter The Height : ");
		                 y = i.nextInt();
	                   Triangle tri = new Triangle(x,y);
		                 tri.printArea();
		                 break;
	            
	         case 3 : System.out.print("Enter The Radius : ");     
	                   r = i.nextInt();
		                 Circle cir = new Circle(r);   
		                 cir.printArea();
		                 break;

			     case 4 : System.exit(0);
				            break;           
               		                    
         default : System.out.println("Invalid Choice..!");       
	      }
	   }while(c!=4);
	}
}
