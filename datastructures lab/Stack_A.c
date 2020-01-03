/*Program To Simulate The Working Of The Stack Using an Array.*/

#include<stdio.h>
#define MAX 20
#include<conio.h>

void push(int a[],int,int *);
void pop(int a[],int *);
void display(int a[],int *);

int main()
{
	int a[MAX];
	int top=-1;
	int item,choice;
	clrscr();
	printf("\nSTACK IMPLEMENTATION.");
	printf("\n-------------------------");
	do
	{
		printf("\n\nThe Choice Are : ");
		printf("\n1.PUSH.\n2.POP.\n3.DISPLAY.\n4.EXIT.\n");
		printf("\nEnter Your Choice : ");
		scanf("%d",&choice);

		switch(choice)
		{
			case 1 : printf("\nEnter The Element To Be Pushed : ");
			scanf("%d",&item);
			push(a,item,&top);
			break;

			case 2 : pop(a,&top);
			break;

			case 3 : display(a,&top);
			break;

			case 4 : exit(0);
			break;

			default : printf("\nInvalid Choice..!!");
		}
	} while(choice!=4);
getch();
return 0;
}

void push(int a[],int item,int *top)
{
	if(*top==MAX-1)
	printf("STACK OVERFLOW..!\n");
	else
	{
		a[++(*top)]=item;
		printf("Inserted Successfully.\n");
	}
}

void pop(int a[],int *top)
{
	if((*top)==-1)
	printf("\nSTACK UNDERFLOW..!\n");
	else
	printf("\nThe POPPED Element is %d.\n",a[*top]);
	(*top)--;
}

void display(int a[],int *top)
{
	int i;
	if(*top==-1)
	printf("\nSTACK is EMPTY..!!!\n");
	else
	for(i=0;i<=(*top);i++)
	printf("\t%d",a[i]);
}
