import java.util.Scanner;
class udexception extends Exception
{
   private String s;
   
   udexception(String xx)
   {s=xx;}
   
   public String toString()
   {
      return("Only "+s+" digits allowed");
   }
}

class userdefinedexc
{
  public static void main(String xxx[])
  {
  try
  { System.out.println("Enter a single digit number:");
    Scanner s = new Scanner(System.in);
	int x=s.nextInt();
	if(x>=10)
	 {  throw new udexception("Single");}
	else
      {System.out.println("You have entered a correct number");}
  }
  catch(udexception ue)
  {System.out.println(ue);}
  }
}