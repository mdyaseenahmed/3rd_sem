/******************************************************************************
    Java Program To Reverse a Sentence Using STACK.
*******************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class sentenceReverse
{
    String str = "";
    String rev = "";
    Stack stk = new Stack();
    
    public void getInput()
    {
        System.out.print("Enter a Sentence : ");
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
    
    public void display()
    {
        System.out.println("Reversed Sentence is : "+rev);
    }
}

public class LaunchSentenceReverse
{
	public static void main(String[] args)
	{
	    sentenceReverse s = new sentenceReverse();
	    s.getInput();
	    s.reverse();
	    s.display();
	}
}

/**********************************************

-----------------
Output:
-----------------
Enter a Sentence : hello world!                                                                                                             
Reversed Sentence is : !dlrow olleh                                                                                                         
                                                                                                                                          
                                                                                                                                          
...Program finished with exit code 0                                                                                                      
Press ENTER to exit console

**********************************************/
