/******************************************************************************
    Java Program To convert a Given Postfix Expression to Prefix Expression.
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
                
                place the concatenated expression symbol and operand2 and operand1 in temp
                
                push temp onto the STACK 
            }
        }
        pop the top of the STACK and place it in ans
        
************************************************************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class PostfixToPrefix
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
    
    public void convPostToPre()
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
                String temp = symbol + opnd2 + opnd1;
                stk.push(temp);
            }
        }
        ans = stk.pop();
    }
    
    public void display()
    {
        System.out.println("Prefix Expression Equivalent of The Given Postfix is : "+ans);
    }
}

public class LaunchPostfixToPrefix
{
	public static void main(String[] args)
	{
		PostfixToPrefix con = new PostfixToPrefix();
		con.getInput();
		con.convPostToPre();
		con.display();
	}
}

/**************************************************************************
-----------------------
Sample Output - 01:
-----------------------
Enter a Valid Postfix Expression : 423*+                                                                                                   
Prefix Expression Equivalent of The Given Postfix is : +4*23
-----------------------
Sample Output - 02: 
-----------------------
Enter a Valid Postfix Expression : 85+63/*                                                                                                 
Prefix Expression Equivalent of The Given Postfix is : *+85/63
-----------------------
Sample Output - 03:
-----------------------
Enter a Valid Postfix Expression : 42$3*3-84/11+/+                                                                                         
Prefix Expression Equivalent of The Given Postfix is : +-*$4233//84+11 
**************************************************************************/
