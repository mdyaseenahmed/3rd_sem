/******************************************************************************
    Java Program To Finf the Middle Element of a Linked List.        
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
    
    public void midElement()
    {
        if(ll.size() == 0)
            System.out.println("List is Empty.!");
        else
        {
            int tot_count = ll.size();
            int midNode = tot_count/2;
            System.out.println("The Mid Element in the List is : "+ll.get(midNode));
        }
    }
}

public class midElement_LL
{
	public static void main(String[] args) 
	{
		linkedList l1 = new linkedList();
		
		while(true)
		{
		    System.out.println("The Chocies Are : ");
		    System.out.println("1. INSERT. \n2. DELETE. \n3. Display. \n4. Middle Element in the List. \n5. Exit");    
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
		        
		        case 4 : l1.midElement();
		                 break;
		                 
		        case 5 : System.exit(0);
		                 break;
		        
		        default: System.out.println("Invalid Choice..!");
		    }
		}
	}
}

/**********************************************************
-----------------
Output: 
-----------------

The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
1                                                                                                                                           
Enter The Item To Be Inserted :                                                                                                             
12                                                                                                                                          
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
1                                                                                                                                           
Enter The Item To Be Inserted :                                                                                                             
65
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
1                                                                                                                                           
Enter The Item To Be Inserted :                                                                                                             
98                                                                                                                                          
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
3                                                                                                                                           
[12, 65, 98]
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
4                                                                                                                                           
The Mid Element in the List is : 65                                                                                                         
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Middle Element in the List.                                                                                                              
5. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice :                                                                                                                         
5                

...Program finished with exit code 0                                                                                                        
Press ENTER to exit console.
/**********************************************************
