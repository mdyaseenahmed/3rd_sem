/*Program To Simulate The Working Of a QUEUE Using Arrays.*/

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define MAX 3

void Q_ins(int Q[],int item,int *r)
{
    if((*r)>=MAX-1)
    {
        printf("QUEUE OVERFLOW..!");
    }
    else
    {
        Q[++(*r)]=item;
        printf("Item Inserted Successfully");
    }
}

void Q_del(int Q[],int *f,int *r)
{
    if((*f)>(*r))
    {
        printf("QUEUE UNDERFLOW..!");
    }
    else
    {
        printf("\nThe Item Deleted is : %d",Q[(*f)]);
        (*f)++;
    }
}

void display(int Q[],int *f,int *r)
{
    int i;
    if((*f)>(*r)||(*r)==-1)
    {
        printf("\nQUEUE is EMPTY..!");
    }
    else
    {
        for(i=0;i<=(*r);i++)
        printf("%d\t",Q[i]);
    }
}

int main()
{
   int f,r;
   int Q[MAX];
   int c,item;
   f=0;
   r=-1;
   clrscr();
   printf("QUEUE Implementation");
   do
   {
        printf("\nThe Choices Are : ");   
        printf("\n1.INSERT.\n2.DELETE.\n3.DISPLAY.\n4.EXIT.\n");
        printf("Enter Your Choice : ");
        scanf("%d",&c);
        
        switch(c)
        {
            case 1 : printf("\nEnter The Element TO Be Inserted : "); 
                     scanf("%d",&item);
                     Q_ins(Q,item,&r);
                     break;
            
            case 2 : Q_del(Q,&f,&r);
                     break;
                     
            case 3 : display(Q,&f,&r);
                     break;
                     
            default : printf("\nInvalid Choice...!!");                     
        }
   }while(c!=4);
   getch();
   return 0;
}