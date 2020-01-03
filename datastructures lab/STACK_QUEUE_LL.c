/*Write a C Program To Implement STACK & QUEUES Using Linked List Representation.*/

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct node 
{
    int data;
    struct node *next;
};

typedef struct node *NODE;

NODE get_node()
{
    NODE temp;
    temp = (NODE)malloc(sizeof(struct node));
    if(temp==NULL)
    {
        printf("No Memory..!");
        exit(0);
    }
    else
      return temp;
}

//Inserts The New Element On The Top Of STACK...
NODE push(NODE head,int item)
{
    NODE p,curr;
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
        curr = head;
        while(curr->next!=NULL)
        {
            curr = curr->next;
        }
        curr->next = p;
        printf("\nInserted Successfully..!");
    }
    return head;
}

//POPs an Element From The Top Of The STACK...
NODE pop(NODE head)
{
    NODE curr=head,prev;
    if(head == NULL)
    {
        printf("\nSTACK UNDERFLOW...!");
    }
    else if(curr!=NULL&&curr->next==NULL)
    {
       printf("\nItem %d is Deleted.",head->data);
       head = head->next;
    }
    else
    {
        curr = head;
        prev = NULL;
        while(curr->next!=NULL)
        {
            prev = curr;
            curr = curr->next;
        }
        printf("\nItem %d is Deleted.",curr->data);
        prev->next = NULL;
        free(curr);
    }
    return head;
}

//Displays The Contents Of The STACK...
void Sdisplay(NODE head)
{
    NODE p;
    if(head == NULL)
    {
        printf("\nSTACK is EMPTY..!");
    }
    else
    {
        p = head;
        printf("\n");
        while(p!=NULL)
        {
            printf("%d\t",p->data);
            p = p->next;
        }
    }
}

//Inserts a New Element In The QUEUE...
NODE Qinsert(NODE head,int item)
{
    NODE p,curr;
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
        curr = head;
        while(curr->next!=NULL)
        {
            curr = curr->next;
        }
        curr->next = p;
        printf("\nInserted Successfully..!");
    }
    return head;
}

//Deletes an Element From The QUEUE...
NODE Qdelete(NODE head)
{
    NODE curr=head;
    if(head == NULL)
    {
        printf("\nQUEUE UNDERFLOW...!");
    }
    else 
    {
       printf("\nItem %d is Deleted.",curr->data);
       curr = curr->next;
       free(head);
    }
    return curr;
}

//Displays The Contents Of The QUEUE...
void Qdisplay(NODE head)
{
    NODE p;
    if(head == NULL)
    {
        printf("\nQUEUE is EMPTY..!");
    }
    else
    {
        p = head;
        printf("\n");
        while(p!=NULL)
        {
            printf("%d\t",p->data);
            p = p->next;
        }
    }
}

int main()
{
    int item,choice,sq;
    NODE head = NULL;
    NODE head1 = NULL;
    do
    {
        printf("\n***********************");
        printf("\nMAIN MENU");    
        printf("\n***********************");
        printf("\nThe Choices Are : ");
        printf("\n1.STACK IMPLEMENTATION USING LINKED LIST.");
        printf("\n2.QUEUE IMPLEMENTATION USING LINKED LIST.");
        printf("\n3.EXIT.");
        printf("\n-------------------");    
        printf("\nEnter Your Choice :  ");
        scanf("%d",&sq);
        
        switch(sq)
        {
            case 1 : 
            do
            {
                printf("\n-------------------");    
                printf("\nSTACK OPERATIONS"); 
                printf("\n-------------------");    
                printf("\nThe Choices Are : ");
                printf("\n1.PUSH.\n2.POP.\n3.DISPLAY.\n4.EXIT.\n");
                printf("--------------------------");
                printf("\nEnter Your Choice : ");
                scanf("%d",&choice);
                printf("\n--------------------------");
        
                switch(choice)
                {
                    case 1 : 
                        printf("\nEnter The Element To Be Pushed : ");
                        scanf("%d",&item);
                        head = push(head,item);
                        break;
                
                    case 2 : 
                        head = pop(head);
                        break;
                    
                    case 3 : 
                        Sdisplay(head);
                        break;
                    
                    case 4 : 
                        break;
                
                    default : printf("\nInvalid Choice..!!!");    
                }
            }while(choice!=4);
            break;
        
            case 2 :
                do
                {
                    printf("\n-------------------");
                    printf("\nQUEUE IMPLEMENTATION\n");
                    printf("-------------------\n");    
                    printf("The Choices Are : \n");
                    printf("\n1.INSERT.\n2.DELETE.\n3.DISPLAY.\n4.EXIT.");
                    printf("\n--------------------------");
                    printf("\nEnter Your Choice : ");
                    scanf("%d",&choice);
                    printf("\n--------------------------");
        
                    switch(choice)
                    {
                        case 1 : 
                            printf("\nEnter The Element To Be Inserted : ");
                            scanf("%d",&item);
                            head1 = Qinsert(head1,item);
                            break;
            
                        case 2 : 
                            head1 = Qdelete(head1);
                            break;
            
                        case 3 : 
                            Qdisplay(head1);
                            break;
            
                        case 4 : 
                            break;
                
                        default : printf("\nInvalid Choice..!!!");    
                    }
                }while(choice!=4);
                break;
                    
                case 3: exit(0);
                    break;
                        
               default : printf("\nInvalid Choice.!");    
            }
    }while(choice!=3);
    return 0;
}
