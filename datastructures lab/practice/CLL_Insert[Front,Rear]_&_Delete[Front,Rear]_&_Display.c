/***********************************************************************************************************************
  
  C Program To Implement Circular Linked List with,
    
    1. Insert a Node at Front
    2. Insert a Node at Rear
    3. Delete a Node at Front
    4. Delete a Node at Rear
    5. Display the Contents Of the List    
    
***********************************************************************************************************************/

#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *link;
};

struct node *first = NULL;

void insert_front()
{
    struct node *p,*temp;
    int item;
    p = malloc(sizeof(struct node));
    printf("Enter The Item to be Inserted : ");
    scanf("%d",&item);
    p->data = item;
    p->link = p;
    if(first == NULL)
        first = p;
    else if(first->link == first)
    {
        first->link = p;
        p->link = first;
    }
    else
    {
        temp = first;
        while(temp->link != first)
            temp = temp->link;
        p->link = first;
        temp->link = p;
        first = p;
    }
}

void insert_rear()
{
    struct node *p,*temp = first;
    int item;
    p = malloc(sizeof(struct node));
    printf("Enter The Item to be Inserted : ");
    scanf("%d",&item);
    p->data = item;
    p->link = p;
    if(first == NULL)
        first = p;
    else if(first->link == first)
    {
        first->link = p;
        p->link = first;
    }
    else
    {
        while(temp->link != first)
            temp = temp->link;
        temp->link = p;    
        p->link = first;
    }
}

void delet_front()
{
    struct node *temp,*x;
    if(first == NULL)
    {
        printf("Deletion is Not Possible.");
    }
    else if(first->link == first)
    {
        printf("Element Deleted is %d",first->data);    
        free(first);
        first = NULL;
    }
    else
    {
        temp = first;
        while(temp->link != first)
            temp = temp->link;
        x = first;    
        first = first->link;
        printf("Element Deleted is %d",x->data);    
        free(x);
        temp->link = first;
    }    
}        

void delet_rear()
{
    struct node *temp;
    if(first == NULL)
    {
        printf("Deletion is Not Possible.");
    }
    else if(first->link == first)
    {
        printf("Element Deleted is %d",first->data);    
        free(first);
        first = NULL;
    }
    else
    {
        temp = first;
        while(temp->link->link != first)
        {
            temp = temp->link;
        }   
        printf("Element Deleted is %d",temp->link->data);
        free(temp->link);
        temp->link = first;
    }
}

void display()
{
    struct node *temp;
    if(first == NULL)
    {
        printf("Display is Not Possible.");
    }
    else if(first->link == first)
    {
        printf("\t%d",first->data);    
    }
    else
    {
        temp = first;
        while(temp->link != first)
        {
            printf("\t%d",temp->data);
            temp = temp->link;
        }
        printf("\t%d",temp->data);
    }
}

int main()
{
    int choice;
    printf("\nCIRCULAR LINKED LIST : \n");
    while(1)
    {
        printf("\nThe Choices Are : \n1. Insert Front.\n2. Insert Rear.\n3. Delete Front\n4. Delete Rear.\n5. Display.\n6. Exit.\nEnter Your Choice : ");
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
