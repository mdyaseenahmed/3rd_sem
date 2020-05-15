/*****************************************************************************
    C Program To Implement STACK Using Array [Global Variables].
*****************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#define SIZE 1000

int S[1000], top = -1;    

void push()
{
    int item;
    if(top == SIZE-1)
        printf("PUSH Operation Not Possible, STACK OVERFLOW.!");
    else
    {
        printf("Enter The Element To be PUSHED : ");
        scanf("%d",&item);
        S[++top] = item;
    }
}

int pop()
{
    if(top == -1)
        printf("POP Operation Not Possible, STACK UNDERFLOW.!");
    else
        printf("Element Deleted is %d",S[top--]);
}

void display()
{
    int i;
    if(top == -1)
        printf("Display Not Possible, STACK is EMPTY.!");
    else
    {
        for(i = top; i >= 0; i--)
            printf("\t\n%d",S[i]);
    }
}

void peek()
{
    if(top == -1)
        printf("PEEK Operation Not Possible, STACK is EMPTY.!");
    else
        printf("The Element Present At the TOP of The STACK is : %d",S[top]);
}

int main()
{
    int choice,x;
    
    printf("STACK Implementation Using Arrays [GLOBAL VARIABLES] ");
    while(1)
    {
        printf("\nThe Choices Are : \n1. PUSH.\n2. POP.\n3. Display.\n4. PEEK.\n5. Exit.\n\nEnter Your Choice : ");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1 : push();
                     break;
                     
            case 2 : pop();
                     break;
                     
            case 3 : display();
                     break;
            
            case 4 : peek();
                     break;
            
            case 5 : exit(0);
                     break;
            
            default : printf("\tInvalid Choice.!");         
        }
    }
    return 0;
}

/*************************************************
----------------------
Output:
----------------------

STACK Implementation Using Arrays [GLOBAL VARIABLES]                                                                                        

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 1                                                                                                                       
Enter The Element To be PUSHED : 10                                                                                                         
                                                                                                                                            
The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 1                                                                                                                       
Enter The Element To be PUSHED : 20                                                                                                         
                                                                                                                                            
The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 1                                                                                                                       
Enter The Element To be PUSHED : 30
                                                                                                                                            
The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 4                                                                                                                       
The Element Present At the TOP of The STACK is : 30                                                                                         

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 3                                                                                                                       
                                                                                                                                            
30                                                                                                                                          
20                                                                                                                                          
10      
The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 2                                                                                                                       
Element Deleted is 30                                                                                                                       

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 2                                                                                                                       
Element Deleted is 20                                                                                                                       

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 2                                                                                                                       
Element Deleted is 10

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 3                                                                                                                       
Display Not Possible, STACK is EMPTY.!                                                                                                      

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 2                                                                                                                       
POP Operation Not Possible, STACK UNDERFLOW.!                                                                                               

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 4                                                                                                                       
PEEK Operation Not Possible, STACK is EMPTY.!

The Choices Are :                                                                                                                           
1. PUSH.                                                                                                                                    
2. POP.                                                                                                                                     
3. Display.                                                                                                                                 
4. PEEK.                                                                                                                                    
5. Exit.                                                                                                                                    

Enter Your Choice : 5                                                                                                                       
                                                                                                                                                                                                                                                                                        
...Program finished with exit code 0                                                                                                        
Press ENTER to exit console.

*************************************************/
