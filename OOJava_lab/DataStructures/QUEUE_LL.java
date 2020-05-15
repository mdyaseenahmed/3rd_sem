/******************************************************************************
    Java Program To implement QUEUE Using Linked List.        
*******************************************************************************/

import java.util.Scanner;
import java.util.LinkedList;

class Queue
{
    LinkedList<Integer> Q = new LinkedList<Integer>();
    
    public void insert()
    {
        System.out.println("Enter The Item To Be Inserted : ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        Q.addLast(item);
    }
    
    public void delet()
    {
        if(Q.size() == 0)
        {
            System.out.println("POP Operation Not Possible, QUEUE UNDERFLOW.");
        }
        else
        {
            System.out.println("Element Deleted is "+Q.removeFirst());
        }
    }
    
    public void display()
    {
        if(Q.size() == 0)
        {
            System.out.println("Display Operation Not Possible, QUEUE is EMPTY.!");
        }
        else
        {
            System.out.println(Q);   
        }
    }
}

public class QUEUE_LL
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		
		System.out.println("QUEUE Impelmentation Using LinkedList : ");
		
		while(true)
		{
		    System.out.println("The Chocies Are : ");
		    System.out.println("1. INSERT. \n2. DELETE. \n3. Display. \n4. Exit");    
		    System.out.println("\nEnter Your Choice : ");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    
		    switch(choice)
		    {
		        case 1 : q.insert();
		                 break;
		               
		        case 2 : q.delet();
		                 break;
		                 
		        case 3 : q.display();
		                 break;
		                 
		        case 4 : System.exit(0);
		                 break;
		        
		        default: System.out.println("Invalid Choice..!");
		    }
		}
	}
}
