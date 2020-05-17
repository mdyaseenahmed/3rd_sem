/******************************************************************************
    Java Program To Implement STACK Using Array.
*******************************************************************************/

import java.util.Scanner;

class Stack
{
    int S[] = new int[100];
    int SIZE = 100;
    int top = -1;
    
    public void push()
    {
        int item;
        if(top == SIZE-1)
        {
            System.out.println("STACK OVERFLOW.!");
        }
        else
        {
            System.out.print("Enter the Element To Be Pushed : ");
            Scanner s = new Scanner(System.in);
            item = s.nextInt();
            S[++top] = item;
        }
    }
    
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("STACK UNDERFLOW.!");
        }
        else
        {
            System.out.println("Element Deleted is : "+S[top--]);
        }
    }
    
    public void display()
    {
        int i;
        if(top == -1)
        {
            System.out.println("STACK is EMPTY.!");
        }
        else
        {
            System.out.println("The Contents of the STACK is as Follows : ");
            for(i = top; i >= 0; i--)
                System.out.print("\n\t "+S[i]);
            System.out.println();
        }
    }
}

public class Main
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		
		System.out.println("STACK Impelmentation Arrays : ");
		
		while(true)
		{
		    System.out.println("\nThe Chocies Are : ");
		    System.out.println("1. PUSH. \n2. POP. \n3. Display. \n4. Exit");    
		    System.out.print("\nEnter Your Choice : ");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    
		    switch(choice)
		    {
		        case 1 : s.push();
		                 break;
		               
		        case 2 : s.pop();
		                 break;
		                 
		        case 3 : s.display();
		                 break;
		                 
		        case 4 : System.exit(0);
		                 break;
		        
		        default: System.out.println("Invalid Choice..!");
		    }
		}
	}
}
