/******************************************************************************
    Java Program To convert a Given Prefix Expression to Infix Expression.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        
        Reverese the prefix expression and traverse the entire length of the prefix expression
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
                
                place the concatenated expression operand1 and symbol and operand2 in temp
                
                push temp onto the STACK 
            }
        }
        pop the top of the STACK and place it in ans
        
************************************************************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class PrefixToInfix
{
    String expr;
    String ans;
    
    public void getInput()
    {
        System.out.print("Enter a Valid Prefix Expression : ");
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
    
    public void convPreToInf()
    {
        Stack<String> stk = new Stack<String>();
        
        for(int i = expr.length()-1; i >= 0; --i)
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
                String temp = opnd1 + symbol + opnd2;
                stk.push(temp);
            }
        }
        ans = stk.pop();
    }
    
    public void display()
    {
        System.out.println("Infix Expression Equivalent of The Given Prefix is : "+ans);
    }
}

public class LaunchPrefixToInfix
{
	public static void main(String[] args)
	{
		PrefixToInfix con = new PrefixToInfix();
		con.getInput();
		con.convPreToInf();
		con.display();
	}
}

/**************************************************************************
-----------------------
Sample Output - 01:
-----------------------
Enter a Valid Prefix Expression : +4*23                                                                                                   
Infix Expression Equivalent of The Given Prefix is : 4+2*3

-----------------------
Sample Output - 02: 
-----------------------
Enter a Valid Prefix Expression : *+85/63                                                                                                 
Infix Expression Equivalent of The Given Prefix is : 8+5*6/3

-----------------------
Sample Output - 03:
-----------------------
Enter a Valid Prefix Expression : +-*$4233//84+11                                                                                         
Infix Expression Equivalent of The Given Prefix is : 4$2*3-3+8/4/1+1

**************************************************************************/
