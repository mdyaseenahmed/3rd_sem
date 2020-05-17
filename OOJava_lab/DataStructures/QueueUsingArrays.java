/******************************************************************************
    Java Program To Implement QUEUE Using Array.
*******************************************************************************/

import java.util.Scanner;

class Queue
{
    int Q[] = new int[100];
    int SIZE = 100;
    int front = 0;
    int rear = -1;
    
    public void insert()
    {
        int item;
        if(rear == SIZE-1)
        {
            System.out.println("QUEUE OVERFLOW.!");
        }
        else
        {
            System.out.print("Enter the Element To Be Inserted : ");
            Scanner s = new Scanner(System.in);
            item = s.nextInt();
            Q[++rear] = item;
        }
    }
       
    public void delet()
    {
        if(front > rear)
        {
            System.out.println("QUEUE UNDERFLOW.!");
        }
        else
        {
            System.out.println("Element Deleted is : "+Q[front++]);
        }
    }
    
    public void display()
    {
        int i;
        if(front > rear)
        {
            System.out.println("QUEUE is EMPTY.!");
        }
        else
        {
            System.out.println("The Contents of the QUEUE is as Follows : ");
            for(i = front; i <= rear; i++)
                System.out.print("\t "+Q[i]);
            System.out.println();
        }
    }
}

public class QueueUsingArrays
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		
		System.out.println("QUEUE Impelmentation Arrays : ");
		
		while(true)
		{
		    System.out.println("\nThe Chocies Are : ");
		    System.out.println("1. INSERT. \n2. DELETE. \n3. Display. \n4. Exit");    
		    System.out.print("\nEnter Your Choice : ");
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

/***************************************************************
---------------------------
Output:
---------------------------

QUEUE Impelmentation Arrays :                                                                                                               
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 1                                                                                                                       
Enter the Element To Be Inserted : 12                                                                                                         
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 3                                                                                                                       
The Contents of the QUEUE is as Follows :                                                                                                   
         12                                                                                                                                 
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 1
Enter the Element To Be Inserted : 23                                                                                                         
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 1                                                                                                                       
Enter the Element To Be Inserted : 65                                                                                                         
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 3                                                                                                                       
The Contents of the QUEUE is as Follows :                                                                                                   
         12      23      65                                                                                                                 
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit
                                                                                                                                            
Enter Your Choice : 2                                                                                                                       
Element Deleted is : 12                                                                                                               
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 3                                                                                                                       
The Contents of the QUEUE is as Follows :                                                                                                   
         23      65                                                                                                                         
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 2                                                                                                                       
Element Deleted is : 23                                                                                                                     
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 3                                                                                                                       
The Contents of the QUEUE is as Follows :                                                                                                   
         65                                                                                                                                 
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 2                                                                                                                       
Element Deleted is : 65                                                                                                                     
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 3                                                                                                                       
QUEUE is EMPTY.!                                                                                                                            
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 2                                                                                                                       
QUEUE UNDERFLOW.!                                                                                                                           
                                                                                                                                            
The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit

The Chocies Are :                                                                                                                           
1. INSERT.                                                                                                                                  
2. DELETE.                                                                                                                                  
3. Display.                                                                                                                                 
4. Exit                                                                                                                                     
                                                                                                                                            
Enter Your Choice : 4                                                                                                                       
                                                                                                                                            
                                                                                                                                            
...Program finished with exit code 0                                                                                                        
Press ENTER to exit console.
***************************************************************/
