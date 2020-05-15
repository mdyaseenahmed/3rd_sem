/******************************************************************************************************
    C Program To Implement a Search for the Maximum Element Present in the QUEUE Data Structure.
******************************************************************************************************/

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

void searchMax()
{
    int max = -9999,temp,i;
    if(front > rear)
    {
        printf("Operation Not Possible, QUEUE is Empty.!");
    }
    else
    {
        for(i = front; i<=rear; i++)
        {
            temp = delet();
            if(temp > max)
                max = temp;
        }
        printf("\tThe Maximum Element Present in the QUEUE is %d",max);
    }
}

int main()
{
    int choice,x;
    char ans;
    while(1)
    {
        printf("\nThe Choices Are : \n1. Insert.\n2. Delete.\n3. Display.\n4. Maximum Element in QUEUE.\n5. Exit.\nEnter Your Choice : ");
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
            
            case 4 : searchMax();
                     break;
            
            case 5 : exit(0);
            
            default : printf("\nInvalid Choice.!");         
        }
    }while(choice != 5);
    return 0;
}
