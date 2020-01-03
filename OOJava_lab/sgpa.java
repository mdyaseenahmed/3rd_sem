//Java Program To Create a Class Student With Members USN,Name,An Array Credits and An Array Marks.
//Including Methods For Accepting And Displaying Details And a Method To Calculate SGPA Of a Student.

import java.io.*;
import java.util.*;

class student
{
	String name,usn;
	int[] credits,marks;
	int n;
	double cgpa; 

	student()
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter The USN : ");
		usn = inp.next();
		
		System.out.println("Enter The Name : ");
		name = inp.next();
		
		System.out.println("Enter The Number Of Subjects : ");
		n = inp.nextInt();

		marks = new int[n];
		credits = new int[n];
		
		System.out.println("Enter The Marks : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Marks For Subject : "+(i+1)+" ");			
			marks[i]=inp.nextInt();
		}

		System.out.println("Enter The credits : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Credits For Subject : "+(i+1)+" ");
			credits[i]=inp.nextInt();
		}
	}

	student(String usn,String name,int n)
	{
		Scanner sc = new Scanner(System.in);
		this.usn = usn;
		this.name = name;
		this.n = n;
		marks = new int[n];
		credits = new int[n];
		System.out.println("Enter The Marks & Credits Correspondingly : ");
		for(int i=1;i<=n;i++)
		{
			marks[i]=sc.nextInt();
			credits[i]=sc.nextInt();
		}
	}
	
	void cal_sgpa()
	{
		double sop=0,tot_cred=0;
		int grade;
		
		for(int i=0;i<n;i++)
		{
			if(marks[i]>=90)
			grade=10;
			else if((marks[i]>=75)&&(marks[i]<90))
			grade=9;
			else if((marks[i]>=60)&&(marks[i]<75))
			grade=8;
			else if((marks[i]>=50)&&(marks[i]<60))
			grade=7;
			else if((marks[i]>=40)&&(marks[i]<50))
			grade=6;
			else
			grade=0;
			
			sop+=grade*credits[i];
			tot_cred+=credits[i];
		}
		cgpa = sop/tot_cred;
	}
	
	void display()
	{
		System.out.println("USN : "+usn+"\nName : "+name+"\nNumber Of Subjects  : "+n);
		System.out.println("Marks :     Credits : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(marks[i]+" \t\t "+credits[i]);	
		}
		System.out.println("SGPA : "+cgpa);
	}
}

class sgpa
{
	public static void main(String args[])
	{
		student s = new student();
		s.cal_sgpa();
		s.display();
	}
} 
