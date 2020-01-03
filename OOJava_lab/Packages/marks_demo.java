/*Create a package CIE which has two classes- Student and Internals.
The class Personal has members like usn, name, sem. The class
internals has an array that stores the internal marks scored in five
courses of the current semester of the student. Create another package
SEE which has the class External which is a derived class of Student.
This class has an array that stores the see marks scored in five courses 
of the current semester of the student. Import the two packages in a
file that declares the final marks of the n students in all five courses. */

import CIE.student;
import CIE.internal;
import SEE.external;
import java.util.*;
import java.io.*;

class marks_demo
{
	public static void main(String args[])
	{
		student s = new student();
		s.set_data();
		
		
		internal i = new internal();
		i.set_data();
		
		
		external ei = new external();
		ei.set_data();
		
		System.out.println("The Details Of The Student is As Follows : ");
		System.out.println("-------------------------");

		s.get_data();
		i.get_data();
		ei.get_data();

	}
}
