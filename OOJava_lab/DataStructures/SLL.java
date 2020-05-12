/******************************************************************************
    
    Java Program To implement Singly Linked List with,
        1. Insert a Node at Front
        2. Insert a Node at Rear
        3. Delete a Node at Front
        4. Delete a Node at Rear
        5. Display the Contents Of the List   
        
*******************************************************************************/

import java.util.Scanner;
import java.util.LinkedList;

class SinglyLinkedList
{
    LinkedList<Integer> sll = new LinkedList<Integer>();
    
    public void insert_front()
    {
        System.out.println("Enter The Item To Be Inserted : ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        sll.addFirst(item);
    }
    
    public void insert_rear()
    {
        System.out.println("Enter The Item To Be Inserted : ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        sll.addLast(item);
    }
    
    public void delet_front()
    {
        if(sll.size() == 0)
        {
            System.out.println("Deletion Not Possible.");
        }
        else
        {
            System.out.println("Element Deleted is "+sll.removeFirst());
        }
    }
    
    public void delet_rear()
    {
        if(sll.size() == 0)
        {
            System.out.println("Deletion Not Possible.");
        }
        else
        {
            System.out.println("Element Deleted is "+sll.removeLast());
        }
    }
    
    public void display()
    {
        if(sll.size() == 0)
        {
            System.out.println("Deletion Not Possible.");
        }
        else
        {
            System.out.println(sll);   
        }
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		SinglyLinkedList s = new SinglyLinkedList();
		
		System.out.println("SINGLY LinkedList Impelmentation : ");
		
		while(true)
		{
		    System.out.println("The Chocies Are : ");
		    System.out.println("1. Insert at Front. \n2. Insert at Rear. \n3. Delete at Front.\n4. Delete at Rear");    
		    System.out.println("5. Display. \n6. Exit. \nEnter Your Choice : ");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    
		    switch(choice)
		    {
		        case 1 : s.insert_front();
		                 break;
		               
		        case 2 : s.insert_rear();
		                 break;
		                 
		        case 3 : s.delet_front();
		                 break;
		                 
		        case 4 : s.delet_rear();
		                 break;
		        
		        case 5 : s.display();
		                 break;
		        
		        case 6 : System.exit(0);
		                 break;
		        
		        default: System.out.println("Invalid Choice..!");
		    }
		}
	}
}
