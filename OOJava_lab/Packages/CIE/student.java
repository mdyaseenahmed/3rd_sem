package CIE;
import java.util.Scanner;

public class student
{
	String name,USN;
	int sem;
	
	Scanner ip = new Scanner(System.in);
	
	public void set_data()
	{
		System.out.print("Enter The Name Of The Student : ");
		name = ip.next();
		System.out.println("-------------------------");
		System.out.print("Enter The USN : ");
		USN = ip.next();
		System.out.println("-------------------------");
		System.out.print("Enter The Sem : ");
		sem = ip.nextInt();
		System.out.println("-------------------------");
	}
	
	public void get_data()
	{
		System.out.println("Student Details Are : ");
		System.out.println("-------------------------");
		System.out.println("Name : "+name);
		System.out.println("-------------------------");
		System.out.println("USN : "+USN);
		System.out.println("-------------------------");
		System.out.println("Sem : "+sem);
		System.out.println("-------------------------");
	}
}
