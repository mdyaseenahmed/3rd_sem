/***************************************************************
Write a Program To Implement Single Linked List With Following Operations.
a) Create a Linked List.
b) Insertion Of a Node at First Position, At Any Position & At The End Of The List.
c) Display The Contents Of The Linked List.
********************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

//STRUCTURE Definition For SINGLY Linked List... 
struct node
{
  int data;
  struct node *next;
};

typedef struct node *NODE;

//Allocates Memory For New Node...
NODE get_node ()
{
  NODE temp;
  temp = (NODE) malloc (sizeof (struct node));
  if (temp == NULL)
    printf ("No Memory..!!");
  else
    return temp;
}

//INSERTS AT THE FRONT/BEGINING OF THE LIST... 
NODE insert_beg (NODE head, int item)
{
  NODE p;
  p = get_node ();
  p->data = item;
  p->next = NULL;
  if (head == NULL)
    {
      head = p;
      printf ("\nInserted Successfully..!!");
      return head;
    }
  else
    {
      p->next = head;
      head = p;
      printf ("\nInserted Successfully..!!");
      return head;
    }
}

//INSERTS AT THE END OF THE LIST...
NODE insert_end (NODE head, int item)
{
  NODE p, temp;
  p = get_node ();
  p->data = item;
  p->next = NULL;
  if (head == NULL)
    {
      head = p;
      printf ("\nInserted Successfully..!!");
      return head;
    }
  else
    {
      temp = head;
      while (temp->next != NULL)
	{
	  temp = temp->next;
	}
      temp->next = p;
      printf ("\nInserted Successfully..!!");
      return head;
    }
}

//INSERTS AT THE SPECIFIED LOCATION/POSITION...
NODE insert_pos (NODE head, int item, int pos)
{
  NODE p, curr, prev;
  int count = 1;
  p = get_node ();
  p->data = item;
  p->next = NULL;
  curr = head;
  prev = NULL;
  if (curr == NULL && pos == 1)
    {
      printf ("\nInserted Successfully..!!");
      return p;
    }
  if (curr == NULL && pos != 1)
    {
      printf ("\nInvalid Position..!");
      return head;
    }
  if (pos == 1)
    {
      p->next = head;
      printf ("\nInserted Successfully...!!");
      return p;
    }
  while (curr != NULL && count != pos)
    {
      prev = curr;
      curr = curr->next;
      count++;
    }
  if (pos == count)
    {
      prev->next = p;
      p->next = curr;
      printf ("Inserted Successfully..!!");
      return head;
    }
  else
    {
      printf ("Invalid Position..!!");
      return head;
    }
}

//DISPLAYS THE CONTENTS OF THE LIST...
void display (NODE head)
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
  NODE head = NULL;
  int item, choice;
  int pos,val;
  clrscr();
  do
    {
      printf ("\n-------------");
      printf ("\nMain Menu\n");
      printf ("--------------\n");
      printf ("The Choices Are : ");
      printf ("\n1.Insert At The Front.\n2.Insert At the End.\n3.Insert At The Specified Position.\n4.Display.\n5.Exit.");
      printf ("\nEnter Your Choice : ");
      scanf ("%d", &choice);

      switch (choice)
	{
	case 1:
	  printf ("\nEnter The Element To Be Inserted : ");
	  scanf ("%d", &item);
	  head = insert_beg (head, item);
	  break;

	case 2:
	  printf ("\nEnter The Element To Be Inserted : ");
	  scanf ("%d", &item);
	  head = insert_end (head, item);
	  break;

	case 3:
	  printf ("Enter The Element To Be Inserted : ");
	  scanf ("%d", &item);
	  printf ("Enter The Position : ");
	  scanf ("%d", &pos);
	  head = insert_pos (head, item, pos);
	  break;

	case 4:
	  display (head);
	  break;

	case 5:
     	 exit(0);
     	 break;
      
	default:
	  printf ("\nInvalid Choice..!!");
	}
    }
  while (choice != 5);
  return 0;
}