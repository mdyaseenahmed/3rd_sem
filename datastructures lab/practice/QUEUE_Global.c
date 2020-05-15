/*****************************************************************************
    C Program To Implement QUEUE Using Arrays [Global Variables].
*****************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#define SIZE 10

int Q[100],front = 0,rear = -1;

void insert()
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
}

void delet()
{
    if(front > rear)
    {
        printf("QUEUE UNDERFLOW.!");
    }
    else
    {
        printf("The Element %d is Deleted.",Q[front++]);
    }
}

void display()
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
    int choice;
    char ans;
    printf("\nQUEUE IMPLEMENTATION USING ARRAYS [GLOBAL VARIABLES] : \n");
    do
    {
        printf("\nThe Choices Are : \n1. Insert.\n2. Delete.\n3. Display.\n4. Exit.\nEnter Your Choice : ");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1 : insert();
                     break;
                     
            case 2 : delet();
                     break;
                     
            case 3 : display();
                     break;
            
            case 4 : exit(0);
            
            default : printf("\nInvalid Choice.!");         
        }
    }while(choice != 4);
}
