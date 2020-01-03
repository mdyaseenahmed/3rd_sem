package SEE;
import CIE.student;
import java.util.Scanner;

public class external extends internals
{
	Scanner sc = new Scanner(System.in);
	int Smarks[];
	int sum = 0;	
	double avg;
	int n;

	public void set_data()
	{
		System.out.println("Enter The Number Of Subjects Of SEE : ");
		n = sc.nextInt();
		Smarks = new int[n];
		System.out.println("-------------------------");
		System.out.println("Enter The Marks For Each Subject : ");

		System.out.println("-------------------------");
		
		for(int i=0;i<n;i++)
		
		{

			System.out.println("Enter The Marks in Subject "+(i+1)+" : ");
		
			Smarks[i] = sc.nextInt();
			
			System.out.println("-------------------------");
		
		}

	
	}

	public void get_data()
	{
		System.out.println("The Marks Scored By The Student in SEE is : ");
		System.out.println("-------------------------");
		for(int i=0;i<n;i++) 
		{
			System.out.println("Score in Subject "+(i+1)+" is : "+Smarks[i]);
			System.out.println("-------------------------");
			sum+=Smarks[i];
		}
		avg = sum/n;
		System.out.println("The Average Marks Scored By The Student in SEE is : "+avg);
	}
}
