/******************************************************************************
    Java Program To convert a Given Postfix Expression to Infix Expression.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        
        Don't Reverese the given postfix expression but traverse the entire length of the postfix expression
        {
            consider the character at ith position as th current symbol
            
            if(symbol is not an operator)
            {
                push symbol onto the STACK 
            }
            else
            {
                pop the top of the STACK and place it in operand1
                pop the top of the STACK and place it in operand2
                
                place the concatenated expression operand2 and symbol and operand1 in temp
                
                push temp onto the STACK 
            }
        }
        pop the top of the STACK and place it in ans
        
************************************************************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class PostfixToInfix
{
    String expr;
    String ans;
    
    public void getInput()
    {
        System.out.print("Enter a Valid Postfix Expression : ");
        Scanner sc = new Scanner(System.in);
        expr = sc.next();
    }
    
    public boolean isOperator(char symbol)
    {
        switch(symbol)
        {
            case '+' : return true;
            case '-' : return true;
            case '*' : return true;
            case '/' : return true;
            case '$' : return true;
        }
        return false;
    }
    
    public void convPostToInf()
    {
        Stack<String> stk = new Stack<String>();
        
        for(int i = 0; i <= expr.length()-1; i++)
        {
            char symbol = expr.charAt(i);
            if(! isOperator(symbol))
            {
                String s = Character.toString(symbol);
                stk.push(s);
            }
            else
            {
                String opnd1 = stk.pop();
                String opnd2 = stk.pop();
                String temp = opnd2 + symbol + opnd1;
                stk.push(temp);
            }
        }
        ans = stk.pop();
    }
    
    public void display()
    {
        System.out.println("Infix Expression Equivalent of The Given Postfix is : "+ans);
    }
}

public class LaunchPostfixToInfix
{
	public static void main(String[] args)
	{
		PostfixToInfix con = new PostfixToInfix();
		con.getInput();
		con.convPostToInf();
		con.display();
	}
}

/**************************************************************************

-----------------------
Sample Output - 01:
-----------------------
Enter a Valid Postfix Expression : 423*+                                                                                                   
Infix Expression Equivalent of The Given Postfix is : 4+2*3

-----------------------
Sample Output - 02: 
-----------------------
Enter a Valid Postfix Expression : 85+63/*                                                                                                 
Infix Expression Equivalent of The Given Postfix is : 8+5*6/3

-----------------------
Sample Output - 03:
-----------------------
Enter a Valid Postfix Expression : 42$3*3-84/11+/+                                                                                         
Infix Expression Equivalent of The Given Postfix is : 4$2*3-3+8/4/1+1 

**************************************************************************/
