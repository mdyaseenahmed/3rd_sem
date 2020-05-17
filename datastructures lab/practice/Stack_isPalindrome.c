/******************************************************************************
    C Program To check whether a Given String is Palindrome or Not Using STACK.
*******************************************************************************/

/************************************************************************************************************************************************************************************************************************************************
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
        now compare Original string which is there in str and the reversed string which is in rev Array Using the `strcmp()` built-in String function.
        
        Note : The `strcmp()` function returns 0 if both the string are 'EQUAL'.    
        
************************************************************************************************************************************************************************************************************************************************/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

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

void isPalindrome()
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
    
    if(strcmp(str,rev) == 0)
        printf("\tGiven String '%s' is Palindrome.",str);
    else
        printf("\tGiven String '%s' is Not Palindrome.",str);
}

int main()
{
    isPalindrome();
    return 0;
}

/************************************************
--------------------
Sample Output - 01:
--------------------
Enter a String : Hello                                                                                           
        Given String 'Hello' is Not Palindrome.                                                                                                               
                                                                                                                   
...Program finished with exit code 0                                                                               
Press ENTER to exit console.

--------------------
Sample Output - 02:
--------------------
Enter a String : MADAM                                                                                           
        Given String 'MADAM' is Palindrome.                                                                                                               
                                                                                                                   
...Program finished with exit code 0                                                                               
Press ENTER to exit console.

************************************************/
