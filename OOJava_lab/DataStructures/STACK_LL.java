/******************************************************************************    
    Java Program To implement STACK Using Linked List.        
*******************************************************************************/

import java.util.Scanner;
import java.util.LinkedList;

class Stack
{
    LinkedList<Integer> stck = new LinkedList<Integer>();
    
    public void push()
    {
        System.out.println("Enter The Item To Be Inserted : ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        stck.addFirst(item);
    }
    
    public void pop()
    {
        if(stck.size() == 0)
        {
            System.out.println("POP Operation Not Possible, STACK UNDERFLOW.");
        }
        else
        {
            System.out.println("Element Deleted is "+stck.removeFirst());
        }
    }
    
    public void display()
    {
        if(stck.size() == 0)
        {
            System.out.println("Display Operation Not Possible, STACK is EMPTY.!");
        }
        else
        {
            System.out.println(stck);   
        }
    }
}

public class STACK_LL
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		System.out.println("STACK Impelmentation Using LinkedList : ");
		
		while(true)
		{
		    System.out.println("The Chocies Are : ");
		    System.out.println("1. PUSH. \n2. POP. \n3. Display. \n4. Exit");    
		    System.out.println("\nEnter Your Choice : ");
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
