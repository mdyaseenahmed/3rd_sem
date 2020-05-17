/******************************************************************************
    Java Program To Reverse a String Using STACK.
*******************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class stringReverse
{
    String str = "";
    String rev = "";
    Stack stk = new Stack();
    
    public void getInput()
    {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        str = sc.next(); 
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
        System.out.println("Reversed String is : "+rev);
    }
}

public class LaunchStringReverse
{
	public static void main(String[] args)
	{
	    stringReverse s = new stringReverse();
	    s.getInput();
	    s.reverse();
	    s.display();
	}
}

/**********************************************

-----------------
Output:
-----------------
Enter a String : hello                                                                                                                    
Reversed String is : olleh                                                                                                                
                                                                                                                                          
                                                                                                                                          
...Program finished with exit code 0                                                                                                      
Press ENTER to exit console

**********************************************/
