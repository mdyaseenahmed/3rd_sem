/*******************************************************************************
Write a Program To Implement The Doubly Linked List With Primitive Operations : 
    a) Create Doubly Linked List.
    b) Insert a New Node To The Left Of The Node.
    c) Delete The Node Of The Data.
    d) Display The Contents Of The List.
********************************************************************************/

#include <stdlib.h>
#include <conio.h>
#include <stdio.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

typedef struct node *NODE;

NODE get_node()
{
    NODE temp;
    temp = (NODE)malloc(sizeof(struct node));
    if(temp!=NULL)
        return temp;
    else
        printf("\nNo Memory.!");
        exit(0);
}

NODE create(NODE head,int item)
{
    NODE p;
    NODE temp = head;
    p = get_node();
    p->data = item;
    p->next = NULL;
    p->prev = NULL;
    if(head == NULL)
    {
        printf("\nCreated Successfully..!");
        return p;
    }
    else
    {
        while(temp->next!=NULL)
            temp = temp->next;
        temp->next = p;
        p->prev = temp;
        printf("\nInserted Successfully..!");
        return head;
    }
}

//Insert a New Node To The Left Of The Node... 
NODE insert_Left(NODE head,int item)
{
    NODE p;
    p = get_node();
    p->data = item;
    p->next = NULL;
    p->prev = NULL;
    if(head == NULL)
    {
        printf("\nInserted Successfully..!");
        return p;
    }
    else
    {
        p->next = head;
        head->prev = p;
        printf("\nInserted Successfully..!");
        return p;
        
    }
}

//Delete The Node Of The Data...
NODE delete_val(NODE head,int val)
{
    NODE curr = head;
    if(head == NULL)
    {
        printf("\nList is Empty.!");
        return head;
    }
    else if(curr->next == NULL && curr->data == val)
    {
        printf("\nItem %d is Deleted..!",val);
        free(curr);
        return NULL;
    }
    else if(curr->next != NULL && curr->data == val)
    {
        head = curr->next;
        printf("\nItem %d is Deleted.!",val);
        free(curr);
        return head;
    }
    else
    {
        while(curr != NULL)
	    {
    		if(curr->data == val)
	    	{
	    	    if(curr->next!=NULL)
	    	    {
		    	    (curr->prev)->next=curr->next;
			        (curr->next)->prev=curr->prev;
			        printf("\nItem %d is Deleted.!",val);
			        free(curr);
	    	    }
	    	    else
	    	    {
	    	        (curr->prev)->next = NULL;
	    	        printf("\nItem %d is Deleted.!",val);
			        free(curr);
	    	    }
			    return head;
		    }
		    if(curr->next == NULL && curr->data != val)
    	    { 
    	        printf("\nInvalid Value.!");
	            return head;
    	    }
		    else
		    curr=curr->next;
	    }
    }
        
}

void display(NODE head)
{
    NODE temp = head;
    if(head == NULL)
    {
        printf("\nList is Empty..!");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("\t%d",temp->data);
            temp = temp->next;
        }
    }
}

int main()
{
    NODE head = NULL;
    int choice;
    int item,val;
    clrscr();
    printf("\n___________________________________");
    printf("\nDOUBLY LINKED LIST IMPLEMENTATION.");
    do
    {
        printf("\n------------------------------------");
        printf("\nThe Choices Are : ");
        printf("\n----------------------------------");
        printf("\n1.Create.\n2.Insert a New Node As Left Node In List.\n3.Delete based On Value.\n4.Display.\n5.Exit.");
        printf("\n------------------------------------");
        printf("\nEnter Your Choice : ");
        scanf("%d",&choice);
        printf("------------------------------------\n");
        switch(choice)
        {
            case 1 : printf("Enter The Element To Be Inserted : ");
                     scanf("%d",&item);
                     head = create(head,item);
                     break;
                     
            case 2 : printf("Enter Element To Be Inserted : ");          
                     scanf("%d",&item);
                     head = insert_Left(head,item);
                     break;
                     
            case 3 : printf("Enter The Value To Be Deleted : ");
                     scanf("%d",&val);
                     head = delete_val(head,val);         
                     break;
                     
            case 4 : display(head);
                     break;
                     
            case 5 : exit(0);         
                     break;
                     
            default : printf("\nInvalid Choice..!");         
        }
    }while(choice!=5);
    return 0;
}
