/*Create a class Cricket with instance members playerid, pname, total _scores, total_wickets, no_of_matches_played.  Write a program to create an array of n Cricket objects. Include methods that display the following according to requirement.  
          1. Name and Id of the player who has played least number of matches 
          2. Name and Id of the player(s) with wickets above 200.

		 */ 
import java.util.Scanner;
class Cricket
{   
	int id;
	String name;
	int total_scores;
	int total_wickets;
	int no_of_matches_played;
	
	void setdetails()
	{
	 Scanner s=new Scanner(System.in);
	 id=s.nextInt();
	 name=s.next();
	 total_scores=s.nextInt();
	 total_wickets=s.nextInt();
	 no_of_matches_played=s.nextInt();
	}
	
	void printdetails()
	{
	 System.out.println(id+" "+name+" "+total_scores+" "+	   total_wickets+" "+no_of_matches_played);
	}
	
	 
	
}
class cricketdemo
{	
	
    public static void main(String sss[])
	 {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of objects:");
		int n=s.nextInt();
		c=new Cricket[n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Cricket();
			c[i].setdetails();
					
		}
		System.out.println("The details are:");
		for(int i=0;i<n;i++)
		{
			c[i].printdetails();
					
		}
		minmatches(n);
		wickets(n);
	 }	 
	 
		static void minmatches(int n)
		 {
			 System.out.println("The details of player with min no of matches");
			 float m=c[0].no_of_matches_played;
			 int ind=0;
			for(int i=1;i<n;i++)
			{   
				if (c[i].no_of_matches_played<m)
				{  m=c[i].no_of_matches_played;
				   ind=i;
				}
			}
		 System.out.println(c[ind].id+" "+c[ind].name);
		}
		 
		static void wickets(int n)
		 {
			 System.out.println("The details of player with wickets less than 200");
		
			for(int i=0;i<n;i++)
			{   
				if (c[i].total_wickets>200)
				{  
					System.out.println(c[i].id+" "+c[i].name);
				}
			}
		 
		}
}	 
		 
		 
		 
		 
		 
		 
		 
	