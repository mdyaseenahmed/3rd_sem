/******************************************************************************
    Java Program To Count the Number Of Nodes Present in a Linked List.
*******************************************************************************/

import java.util.Scanner;
import java.util.LinkedList;

class linkedList
{
    LinkedList<Integer> ll = new LinkedList<Integer>();
    
    public void insert()
    {
        System.out.println("Enter The Item To Be Inserted : ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        ll.addLast(item);
    }
    
    public void delet()
    {
        if(ll.size() == 0)
        {
            System.out.println("Delete Operation Not Possible, List is Empty.!");
        }
        else
        {
            System.out.println("Element Deleted is "+ll.removeFirst());
        }
    }
    
    public void display()
    {
        if(ll.size() == 0)
        {
            System.out.println("Display Operation Not Possible, List is EMPTY.!");
        }
        else
        {
            System.out.println(ll);   
        }
    }
    
    public void countNodes()
    {
        if(ll.size() == 0)
            System.out.println("List is Empty.!");
        else
        {
            System.out.println("The Total Number Of Nodes in the Linked List : "+ll.size());
        }
    }
}

public class countNodes
{
	public static void main(String[] args) 
	{
		linkedList l1 = new linkedList();
		
		System.out.println("QUEUE Impelmentation Using LinkedList : ");
		
		while(true)
		{
		    System.out.println("The Chocies Are : ");
		    System.out.println("1. INSERT. \n2. DELETE. \n3. Display. \n4. Total Nodes. \n5. Exit");    
		    System.out.println("\nEnter Your Choice : ");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    
		    switch(choice)
		    {
		        case 1 : l1.insert();
		                 break;
		               
		        case 2 : l1.delet();
		                 break;
		                 
		        case 3 : l1.display();
		                 break;
		        
		        case 4 : l1.countNodes();
		                 break;
		                 
		        case 5 : System.exit(0);
		                 break;
		        
		        default: System.out.println("Invalid Choice..!");
		    }
		}
	}
}
