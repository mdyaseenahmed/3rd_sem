/******************************************************************************
    C Program To Reverse a Given String Using STACK.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        
        Ask for the input String
        Collect the input String
        
        As long as(the STACK is not EMPTY)
        {
            consider the current symbol as item
            push the item
            proceed
        }
        
        As long as(the STACK is not EMPTY)
        {
            pop & place the contents Of teh STACK int the rev Array 
            proceed
        }
        print the rev Array
        
************************************************************************************************************************/

#include<stdio.h>
#include<stdlib.h>

char S[1000];
int top = -1;

void push(char item)
{
    S[++top] = item;
}

char pop()
{
    return S[top--];
}

void strrev()
{
    int i = 0, j = 0;
    char str[200],rev[200];
    char item;
    
    printf("Enter a String : ");
    scanf("%s",str);
    
    while(str[i] != '\0')
    {
        item = str[i];
        push(item);
        ++i;
    }
    
    while(top != -1)
    {
        rev[j] = pop();
        ++j;
    }
    rev[j] = '\0';
    printf("%s",rev);
}

int main()
{
    strrev();
    return 0;
}

/************************************************
--------------------
Output:
--------------------

Enter a String : Hello                                                                                           
olleH                                                                                                              
                                                                                                                   
...Program finished with exit code 0                                                                               
Press ENTER to exit console.
/************************************************
