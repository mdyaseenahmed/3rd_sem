package CIE;
import java.util.Scanner;

public class internal
{
	int n;
	int marks[];
	int sum=0;
	double avg;
	Scanner s = new Scanner(System.in);
	
	public void set_data()
	{
		System.out.print("Enter The Number of Subjects For CIE : ");
		n = s.nextInt();
		System.out.println("-------------------------");
		
		marks = new int[n];
		System.out.println("Enter The Marks For Each Subject : ");
		System.out.println("-------------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Marks in Subject "+(i+1)+" : ");
			marks[i] = s.nextInt();
			System.out.println("-------------------------");
		}
	}
	
	public void get_data()
	{
		System.out.println("The Marks Scored By The Student in CIE is : ");
		System.out.println("-------------------------");
		for(int i=0;i<n;i++) 
		{
			System.out.println("Score in Subject "+(i+1)+" is : "+marks[i]);
			System.out.println("-------------------------");
			sum+=marks[i];
		}
		avg = sum/3;
		System.out.println("The Average Marks Scored By The Student in CIE is : "+avg);
	}
}
