/***********************************************************************************
    Java Program To check whether a Given String is Palindrome or Not Using STACK.
***********************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class isPalindrome
{
    String str = "";
    String rev = "";
    Stack stk = new Stack();
    
    public void getInput()
    {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine(); 
    }
    
    public void reverse()
    {
        int i = 0;
        while(i <= str.length()-1)
        {
            char item = str.charAt(i);
            stk.push(item);
            ++i;
        }
        
        while(! stk.empty())
        {
            rev = rev + stk.pop();
        }
    }
    
    public void isPalin()
    {
        if(str.equals(rev))
        {
            System.out.println("Given String is Palindrome.");
        }
        else
        {
            System.out.println("Given String is Not Palindrome.!");
        }
    }
}

public class LaunchisPalindrome
{
	public static void main(String[] args)
	{
	    isPalindrome s = new isPalindrome();
	    s.getInput();
	    s.reverse();
	    s.isPalin();
	}
}

/**********************************************

-----------------
Sample Output - 01:
-----------------
Enter a String : hello world!                                                                                                             
Given String is Not Palindrome.!


...Program finished with exit code 0                                                                                                      
Press ENTER to exit console

-----------------
Sample Output - 02:
-----------------
Enter a String : MADAM
Given String is Palindrome.


...Program finished with exit code 0                                                                                                      
Press ENTER to exit console

**********************************************/
