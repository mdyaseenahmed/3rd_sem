/***************************************************************
Write a Program To Implement Singly Linked List With Following Operations.

	a) Sort The Linked List.
	b) Reverse The Linked List.
	c) Concatenation of Linked Lists.
********************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

struct node
{
  int data;
  struct node *next;
};

typedef struct node *NODE;

NODE get_node ()
{
  NODE temp;
  temp = (NODE) malloc (sizeof (struct node));
  if (temp == NULL)
    printf ("No Memory..!!");
  else
    return temp;
}

//Inserts or Create a Linked List...
NODE create(NODE head,int item)
{
    NODE p,temp;
    p = get_node();
    p->data = item;
    p->next = NULL;
    if(head == NULL)
    {
        printf("\nInserted Successfully..!");
        return p;
    }
    else
    {
        temp = head;
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = p;
        printf("\nInserted Successfully..!");
        return head;
    }
}

//SORTS The Array in Ascending Order...
void Bubble_Sort(NODE head)
{
    NODE p,q;
    int temp;
    if(head == NULL)
    {
        printf("\nUnable To Sort,..List is Empty.!");
    }
    else
    {
        for(p = head;p!=NULL;p=p->next)
        {
            for(q = p->next;q!=NULL;q=q->next)
            {
                if(p->data>q->data)
                {
                    temp = p->data;
                    p->data = q->data;
                    q->data = temp;
                }
            }
        }
    }
    display(head);
}

//Merges Or Concatenates Two Lists...
NODE concat(NODE head1,NODE head2)
{
    NODE temp;
    if(head1 == NULL)
        return head2;
    if(head2 == NULL)    
        return head1;
    else
    {
        temp = head1;
        while(temp->next != NULL)
            temp = temp->next;
        temp->next = head2;
        return head1;
    }
        
}

//REVERSE The Contents Of The List...
NODE reverse(NODE head)
{
    NODE temp = NULL,prev = NULL;
    NODE curr = head;
    if(head == NULL)
        printf("\nList is Empty..!");
    if(head->next == NULL)
        return head;
    while(curr!=NULL)
        {
            temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }
    head = prev;
    return head;
}

//DISPLAYS THE CONTENTS OF THE LIST...
void display(NODE head)
{
  NODE p;
  if (head == NULL)
    {
      printf ("\nList is Empty..!There is No Content To Display..!");
    }
  else
    {
      p = head;
      while (p != NULL)
	{
	  printf ("%d->\t", p->data);
	  p = p->next;
	}
    }
}

int main ()
{
  NODE head1 = NULL;
  NODE head2 = NULL;
  int item, choice;
  int pos,val;
  
  do
    {
      printf ("\n-------------");
      printf ("\nMain Menu\n");
      printf ("--------------\n");
      printf ("The Choices Are : ");
      printf ("\n1.Insert in List - 1.\n2.Insert in List - 2.\n3.Reverse The List - 1.\n4.Reverse The List - 2.\n");
      printf ("5.Concatenate The List - 1 & List - 2.\n6.Sort List - 1.\n7.Sort List - 2.\n");
      printf ("8.Display The Contents Of List - 1.\n9.Display The Contents Of List - 2.\n10.Exit.");
      printf ("\nEnter Your Choice : ");
      scanf ("%d", &choice);

      switch (choice)
	{
	case 1 :
	  printf ("\nEnter The Element To Be Inserted in List - 1 : ");
	  scanf ("%d", &item);
	  head1 = create (head1, item);
	  break;

	case 2 : 
	  printf ("\nEnter The Element To Be Inserted in List - 2 : ");
	  scanf ("%d", &item);
	  head2 = create (head2, item);
	  break;

    	case 3 :
     	  head1 = reverse(head1);
   	  display(head1);
	  break;
	  
	case 4:
	  head2 = reverse(head1);
      	  display(head1);
	  break;

	case 5:
	  concat(head1,head2);
	  display(head1);
      	  break;

	case 6:
	  Bubble_Sort(head1);
	  break;

	case 7:
	  Bubble_Sort(head2);
	  break;
	  
	case 8:
	    display(head1);;
	    break;
	    
	case 9:
	    display(head2);
	    break;
	    
    	case 10: 
        	  exit(0);
        	  break;
        
	default:
	  printf ("\nInvalid Choice..!!");
	}
    }
  while (choice != 10);
  return 0;
}
