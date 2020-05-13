/******************************************************************************
    
    C Program to Implement Doubly Linked List.
    
        1. Insert a Node at Front.
        2. Insert a Node at Rear
        3. Delete a Node From Front.
        4. Delete a Node From Rear
        4. Disply The Contents Of The List.
        
*******************************************************************************/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    struct node *llink;
    int data;
    struct node *rlink;
};
struct node *first = NULL; 

void insert_front()
{
    struct node *p;
    int item;
    p = (struct node*)malloc(sizeof(struct node));
    printf("Enter the Element To Be Inserted : ");
    scanf("%d",&item);
    p->data = item;
    p->llink = p->rlink = NULL;
    if(first == NULL)
    {
        first = p;
    }
    else
    {
        p->rlink = first;
        first->llink = p;
        first = p;
    }
}

void insert_rear()
{
    struct node *p,*temp;
    int item;
    p = (struct node*)malloc(sizeof(struct node));
    printf("Enter the Element To Be Inserted : ");
    scanf("%d",&item);
    p->data = item;
    p->llink = p->rlink = NULL;
    if(first == NULL)
    {
        first = p;
    }
    else
    {
        temp = first;
        while(temp->rlink != NULL)
            temp = temp->rlink;
        temp->rlink = p;
        p->llink = temp;
    }
}

void delet_front()
{
    struct node *temp;
    if(first == NULL)
    {
        printf("Deletion Not Possible.!");
    }
    else if(first->rlink == NULL)
    {
        printf("Element Deleted is %d",first->data);
        free(first);
        first = NULL;
    }
    else
    {
       printf("Element Deleted is %d",first->data); 
       temp = first;
       first = first->rlink;
       free(temp);
       first->llink = NULL;
    }
}

void delet_rear()
{
    struct node *temp;
    if(first == NULL)
    {
        printf("Deletion Not Possible.!");
    }
    else if(first->rlink == NULL)
    {
        printf("Element Deleted is %d",first->data);
        free(first);
        first = NULL;
    }
    else
    {
        temp = first;
        while(temp->rlink->rlink != NULL)
            temp = temp->rlink;
        printf("Element Deleted is %d",temp->rlink->data); 
        free(temp->rlink);
        temp->rlink = NULL;
    }
}

void display()
{
    struct node *temp;
    if(first == NULL)
    {
        printf("Display Not Possible.!");
    }
    else if(first->rlink == NULL)
    {
        printf("\t%d",first->data);
    }
    else
    {
        temp = first;
        while(temp != NULL)
        {
            printf("\t%d",temp->data);
            temp = temp->rlink;
        }
    }
}

int main()
{
    int choice;
    printf("DOUBLY Linked List Implementation\n");
    while(1)
    {
        printf("\nThe choices Are : \n1. Insert At the Front.\n2. Insert At the Rear.");
        printf("\n3. Delete From The Front.\n4. Delete From the Rear.\n5. Display.\n6. Exit.\n Enter Your Choice : ");
        scanf("%d",&choice); 
        
        switch(choice)
        {
            case 1 : insert_front();
                     break;
                     
            case 2 : insert_rear();
                     break;
                     
            case 3 : delet_front();
                     break;
                     
            case 4 : delet_rear();
                     break;
                     
            case 5 : display();
                     break;
                     
            case 6 : exit(0);
                     break;
                     
            default : printf("\nInvalid Choice..!");         
        }
    }
    return 0;
}
