import java.util.Scanner;
import java.io.*;

 class student {
int rno,i,n;
String name;
void getdata()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter name");
	name = sc.next();
	System.out.println("enter roll no");
	rno = sc.nextInt();
}
}
class exam extends student 
{
	int marks[] = new int[3];
	double sum = 0;
	void getmarks()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter marks");
		for(i=0;i<n;i++)
		{
			marks[i] = s.nextInt();
			sum+=marks[i];
		}
	}
}
	class result extends exam
	{
		double avg=0;
		void display()
		{
			avg=sum/3;
			System.out.println("Name: " + name);
			System.out.println("Roll no: " + rno);
			System.out.println("average: " + avg);
		}
	}


	class lab 
		{
		public static void main (String[] args)
		{
			result r = new result();
			r.getdata();
			r.getmarks();
			r.display();
		}
		}