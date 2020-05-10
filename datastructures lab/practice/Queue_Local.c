/*****************************************************************************
    C Program To Implement a QUEUE Using Array [Local Variables].
*****************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#define SIZE 10

int insert(int Q[],int rear)
{
    int item;
    if(rear == SIZE-1)
    {
        printf("QUEUE OVERFLOW.!");
    }
    else
    {
        printf("Enter The Item To be Inserted : ");
        scanf("%d",&item);
        Q[++rear] = item;
        printf("\nInserted.");
    }
    return rear;
}

int delet(int Q[],int rear,int front)
{
    if(front > rear)
    {
        printf("QUEUE UNDERFLOW.!");
    }
    else
    {
        printf("The Element %d is Deleted.",Q[front++]);
    }
    return front;
}

void display(int Q[],int rear,int front)
{
    int i;
    if(front > rear)
    {
        printf("QUEUE is EMPTY.!");
    }
    else
    {
        for(i = front; i <= rear; i++)
        {
            printf("\t%d",Q[i]);
        }
        printf("\n");
    }
}

int main()
{
    int Q[100],front = 0,rear = -1;
    int choice;
    char ans;
    printf("\nQUEUE IMPLEMENTATION USING ARRAYS [LOCAL VARIABLES] : \n");
    do
    {
        printf("\nThe Choices Are : \n1. Insert.\n2. Delete.\n3. Display.\n4. Exit.\nEnter Your Choice : ");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1 : rear = insert(Q,rear);
                     break;
                     
            case 2 : front = delet(Q,rear,front);
                     break;
                     
            case 3 : display(Q,rear,front);
                     break;
            
            case 4 : exit(0);
            
            default : printf("\nInvalid Choice.!");         
        }
    }while(choice != 4);
}
