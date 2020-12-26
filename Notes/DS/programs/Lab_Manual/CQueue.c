/*****************************************************************
WAP To Simulate The Working of a Circular Queue of Integers Using an Array. Provide The Following Operations.
	
	a) Insert
	b) Delete
	c) Display

The Program Should Print Appropriate Messages For Queue Empty and Queue Overflow Conditions.
******************************************************************/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 3

void insert(int Q[],int *r,int *count)
{
	int item;
	if((*count) == MAX)
	printf("\nQUEUE OVERFLOW.!");
	else
	{
		printf("\nEnter The Element To Be Inserted : ");
		scanf("%d",&item);
		*r = (*r+1) % MAX;
		Q[*r] = item;
		(*count)++;
	}
}

void Delete(int Q[], int *f, int *count)
{
	if(*count == 0)
	printf("\nQUEUE UNDERFLOW.!");
	else
	{
		printf("\nItem %d is Deleted.",Q[*f]);
		*f = (*f+1)%MAX;
		(*count)--;
	}
}

void Display(int Q[], int *f,int *count)
{
	int i;
	if((*count) == 0)
	printf("\nQUEUE is Empty.");
	else
	{
		printf("\nThe Queue is: \n");
		for(i=0;i<*count;i++)
		{
			printf("%d\n",Q[i]);
		}
	}
}

int main()
{
	int Q[20];
	int r=-1;
	int f=0;
	int count=0;
	int choice;
	printf("\n________________________________");
    printf("\nCIRCULAR QUEUE IMPLEMENTATION");
	do
	{
	    printf("\n-----------------------------------");
	    printf("\nThe Choices Are : ");
		printf("\n1.Insert.\n");
		printf("2.Delete.\n");
		printf("3.Display.\n");
		printf("4.Exit.\n");
		printf("-----------------------------------");
		printf("\nEnter Your Choice :  ");
		scanf("%d",&choice);
		printf("\n-----------------------------------");
		
		switch(choice)
		{
			case 1:
				insert(Q,&r,&count);
				break;
	
			case 2:
				Delete(Q,&f,&count);
				break;
		
			case 3:
				Display(Q,&f,&count);
				break;
			
			case 4:
				exit(0);
				break;
		
			default:
			printf("\nInvalid Choice..!");
		}
	}while(choice!=4);
	return(0);
}
