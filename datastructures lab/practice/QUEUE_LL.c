/******************************************************************************
    C Program To Implement QUEUE Using Linked List.
*******************************************************************************/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *link;
};
struct node *first = NULL;

void insert()
{
    int item;
    struct node *p,*temp;
    p = malloc(sizeof(struct node));
    printf("Enter The Element To be Pushed : ");
    scanf("%d",&item);
    p->data = item;
    p->link = NULL;
    
    if(first == NULL)
        first = p;
    else
    {
        temp = first;
        while(temp->link != NULL)
        {
            temp = temp->link;
        }
        temp->link = p;
    }
}

void delet()
{
    struct node *temp;
    if(first == NULL)
        printf("POP Operation Not Possibl.!");
    else if(first->link == NULL)
    {
        printf("Element Deleted is %d",first->data);   
        free(first);
        first = NULL;
    }
    else
    {
        temp = first;
        first = first->link;
        printf("Element Deleted is %d",temp->data);
        free(temp);
    }
}

void display()
{
    struct node *temp;
    if(first == NULL)
        printf("Display Operation Not Possible.!");
    else
    {
        temp = first;
        while(temp != NULL)
        {
            printf("\t%d",temp->data);
            temp = temp->link;
        }
    }
}

int main()
{
    int choice;
    printf("QUEUE Implementation Using Linked List : ");
    while(1)
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
                     break;
                     
            default : printf("Invalid choice.!");         
        }
    }
    return 0;
}
