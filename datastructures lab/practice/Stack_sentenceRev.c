/******************************************************************************
    C Program To Reverse a Given Sentence Using STACK.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        Ask for the input Sentence
        Collect the input Sentence Using `gets()` built-in input function
        
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
    
    printf("Enter a Sentence : ");
    gets(str);
    
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
Enter a Sentence : Hello World!                                                                                          
!dlroW olleH                                                                                                              
                                                                                                                   
...Program finished with exit code 0                                                                               
Press ENTER to exit console.
************************************************/
