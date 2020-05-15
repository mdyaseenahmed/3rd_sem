/*****************************************************************************
    C Program To Implement a Search Operation in QUEUE Data Structure. 
*****************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#define SIZE 1000

int Q[1000], rear = -1, front = 0;
    

void insert(int item)
{
    Q[++rear] = item;
}

int delet()
{
    return Q[front++];
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

void search()
{
    int key,temp,i;
    if(front > rear)
    {
        printf("Operation Not Possible, QUEUE is Empty.!");
    }
    else
    {
        printf("Enter The Key To Searched : ");
        scanf("%d",&key);
        for(i = front; i<=rear; i++)
        {
            temp = delet();
            if(temp == key)
            {
                printf("Key found.!");
                exit(0);
            }
        }
        printf("Key Not Found.!");
    }
}

int main()
{
    int choice,x;
    char ans;
    while(1)
    {
        printf("\nThe Choices Are : \n1. Insert.\n2. Delete.\n3. Display.\n4. Search.\n5. Exit.\nEnter Your Choice : ");
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
            
            case 4 : search();
                     break;
            
            case 5 : exit(0);
            
            default : printf("\nInvalid Choice.!");         
        }
    }while(choice != 5);
    return 0;
}
