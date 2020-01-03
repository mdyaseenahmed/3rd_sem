/***********************************************************************
Create a package CIE which has two classes- Student and Internals.
The class Personal has members like usn, name, sem. The class
internals has an array that stores the internal marks scored in five
courses of the current semester of the student. Create another package
SEE which has the class External which is a derived class of Student.
This class has an array that stores the see marks scored in five courses 
of the current semester of the student. Import the two packages in a
file that declares the final marks of the n students in all five courses. 
*************************************************************************/

import CIE.student;
import CIE.internal;
import SEE.external;
import java.util.*;
import java.io.*;

class marks
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in)		
		int n;
		System.out.print("Enter The Number Of Students : ");
		n = ip.nextInt();

		System.out.println("Enter The Details Of "+n+" Students : ");
		student s[] = new student[n];	
		internal it[] = new internal[n];
		external ei[] = new external[n];	
		
		for(int i = 0;i<n;i++)
		{
			s[i] = new student();
			s[i].set_data();
		
			it[i] = new internal();
			it[i].set_data();
		
			ei[i] = new external();
			ei[i].set_data();
		}
		System.out.println("The Details Of The Students is As Follows : ");
		System.out.println("-------------------------");
		
		for(int i =0;i<n;i++)
		{
			s[i].get_data();
			it[i].get_data();
			ei[i].get_data();
		}
	}
}
