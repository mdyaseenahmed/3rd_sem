/******************************************************************************
 Design an interface named Iqueue with the following methods:
        a) insert and delete elements from the queue
        b) check whether the queue is empty or not.
Implement the Iqueue with the help of arrays and if the size of the array becomes 
too small to hold the elements,create a new one. Test this interface by inheriting 
it in its subclass QueueTest.java.
*******************************************************************************/

import java.util.*;

interface Iqueue
{
    void insert(int item);    
    void delete();
}

class QueueTest implements Iqueue
{
    int Q[];
    int r,f;
    
    QueueTest(int n)
    {
        Q = new int[n];
        r = -1;
        f = 0;
    }
    
    public void insert(int item)
    {
        if(r == Q.length-1)
        {
            int temp[] = new int[Q.length*2];
            for(int i=0;i<Q.length;i++)
            {
                temp[i] = Q[i];
            }
            Q = temp;
            Q[++r] = item;
        }
        else
            Q[++r] = item;
    }
    
    public void display()
    {
        if(r==-1||f>r)
            System.out.println("Queue is Empty.!");
        else
        {
            for(int i = f;i<=r;i++)
            System.out.println(Q[i]);
        }    
    }
    
    public void delete()
    {
        if(f>r||f==-1)
            System.out.println("Queue UNDERFLOW.!");
        else
        {
            System.out.println("Popped Element is : "+Q[f]);
            f++;
        }
    }
}

public class IQueue_Demo
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n,ch,item;
		System.out.print("Enter The Size Of Queue : ");
		n = ip.nextInt();
		
		QueueTest q = new QueueTest(n);
		do
		{
		    System.out.print("\nThe Choices Are : \n1.insert.\n2.Delete.\n3.Display.\n4.Exit.\nEnter Your Choice : ");
		    ch = ip.nextInt();
		    
		    switch(ch)
		    {
		        case 1 : System.out.print("Enter The Element TO Be Inserted : ");
		                 item = ip.nextInt();
		                 q.insert(item);
		                 break;
		                 
                case 2 : q.delete();
                         break;
                         
                case 3 : q.display();
                         break;
                         
                case 4 : System.exit(0);
                         break;
                         
                default : System.out.println("Invalid Choice..!");         
		    }
		}while(ch!=4);
	}
}
