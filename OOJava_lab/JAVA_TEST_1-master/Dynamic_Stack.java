/*Java Program To Create a Dynamic STACK Using Interface.*/

import java.io.*;
import java.util.*;

interface Stack
{
    void push(int item);
    int pop();
}

class Stack_im implements Stack
{
    int stck[];
    int top;
    
    Stack_im(int n)
    {
        stck = new int[n];
        top = -1;
    }
    
    public void push(int item)
    {
        if(top == stck.length-1)
        {
            int temp[] = new int[stck.length * 2]; //Double The Size...
            for(int i=0;i<stck.length;i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++top] = item;
        }
        else
            stck[++top] = item;
    }
    
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("STACK UNDERFLOW.!");
            return 0;
        }
        else
        {
            return stck[top--];
        }
        
    }
    
    void display()
    {
        if(top==-1)
        {
            System.out.println("STACK is Empty.!");
        }
        else
        {
            for(int i=0;i<=top;i++)
            System.out.println(stck[i]);
        }
    }
}

public class Dynamic_Stack
{
	public static void main(String[] args) 
	{
	    int n,ch,item;
		Scanner ip = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.print("Enter The Size Of Stack : ");
		n = ip.nextInt();
		System.out.println("---------------------------");
		Stack_im s = new Stack_im(n);
		do
		{
		    System.out.println("---------------------------");
		    System.out.println("The Choices Are : ");
		    System.out.println("---------------------------");
		    System.out.print("1.PUSH.\n2.POP.\n3.Display.\n4.Exit.\nEnter Your Choice : ");
		    ch = ip.nextInt();
		    System.out.println("---------------------------");
		    
		    switch(ch)
		    {
		        case 1 : System.out.print("Enter The Element To Pushed : ");
		                 item = ip.nextInt();
		                 s.push(item);
		                 break;
		                 
                case 2 : item = s.pop();
                         if(item!=0)
                            System.out.println("The POPPED Element is : "+item);
                        break;
                        
                case 3 : s.display();
                         break;
                         
                case 4 : System.exit(0);         
                         break;
                         
                default : System.out.println("Invalid Choice.!");                         
		    }
		}while(ch!=4);
	}
}
