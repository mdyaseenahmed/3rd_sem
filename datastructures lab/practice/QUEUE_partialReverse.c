/*****************************************************************************
    C Program To Implement a Partial REVERESE of QUEUE Data Structure.
*****************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#define SIZE 1000

int Q[1000], rear = -1, front = 0;
int S[1000], top = -1;    

void insert(int item)
{
    Q[++rear] = item;
}

int delet()
{
    return Q[front++];
}

void push(int item)
{
    S[++top] = item;
}

int pop()
{
    return S[top--];
}

void display()
{
    int i;
    if(front > rear)
    {
        printf("Operation Not Possible, QUEUE is EMPTY.!");
    }
    else
    {
        for(i = front; i <= rear; i++)
            printf("\t%d",Q[i]);
    }
}

void partialReverse()
{
    int temp,count = 0,i,k;
    if(front > rear)
    {
        printf("REVERSE Not Possible, QUEUE is Empty.!");
    }
    else
    {
        printf("Enter the Number Of Items To Be Reversed : ");
        scanf("%d",&k);
        for(i = front; i <= k-1; i++)    /*PUSHES The Contents of The QUEUE into The STACK.*/
        {
            temp = delet();
            push(temp);
            ++count;
        }                               
        for(i = 0; i <= count-1; i++)     /*POPs the Contents of The STACK & Insert Back Into the QUEUE.*/
        {
            temp = pop();
            Q[++rear] = temp;
        }
        display();
    }
}

int main()
{
    int choice,x;
    char ans;
    while(1)
    {
        printf("\nThe Choices Are : \n1. Insert.\n2. Delete.\n3. Display.\n4. Partial Reverse.\n5. Exit.\nEnter Your Choice : ");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1 : if(rear == SIZE-1)
                        printf("Operation Not Possible, QUEUE OVERFLOW.!"); 
                     else
                     {
                        printf("Enter The Element To Be Inserted : ");
                        scanf("%d",&x);
                        insert(x);
                     }
                     break;
                     
            case 2 : if(front > rear)
                        printf("Operation Not Possible,QUEUE UNDERFLOW.!");
                     else
                     {
                        x = delet();
                        printf("Element Deleted is %d",x);
                     }
                     break;
                     
            case 3 : display();
                     break;
            
            case 4 : partialReverse();
                     break;
            
            case 5 : exit(0);
            
            default : printf("\nInvalid Choice.!");         
        }
    }while(choice != 5);
    return 0;
}
