/******************************************************************************
    Java Program To Evaluate a Given Postfix Expression.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        
        create a new STACK of Integers
        Don't Reverese the expression but traverse the entire length of the postfix expression
        {
            consider the character at ith position as th current symbol
            
            if(the current symbol is a digit)
            {
                obtain the numeric value of the symbol and place it in num
                push num onto the STACK
            }
            else
            {
                pop the top of the STACK and place it in operand2
                pop the top of the STACK and place it in operand1
                
                verify(if symbol is)
                {
                    case '+' : then compute operand1 + operand2 and push it onto the STACK
                    case '-' : then compute operand1 - operand2 and push it onto the STACK
                    case '*' : then compute operand1 * operand2 and push it onto the STACK
                    case '/' : then compute operand1 / operand2 and push it onto the STACK
                    case '$' : then compute operand1 ^ operand2 and push it onto the STACK
                }
            }
        }
        pop the top of the STACK and place it in ans
        
************************************************************************************************************************/

/************************************************************************************************************************
-----------------------------------------------------------    
    Steps For Evaluating a Prefix Expression:
-----------------------------------------------------------
        
        Step 1 : No Reversal is Required.
        Step 2 : If an Operand is Encountered : Push it onto the STACK.
        Step 3 : If an Operator is Encountered :    i. POP the top of The STACK and Make it operand2.
                                                   ii. POP the top of The STACK and Make it operand1.
                                                  iii. Perform the Operaion.
                                                   iv. Push the Result Back to the STACK.
                                
************************************************************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class EvaluatePostfixExpression
{
    String expr;
    int ans;
    
    public void getInput()
    {
        System.out.print("Enter a Valid Postfix Expression : ");
        Scanner sc = new Scanner(System.in);
        expr = sc.next();
    }
    
    
    public void evalPostfix()
    {
        Stack<Integer> stk = new Stack<Integer>();
        
        for(int i = 0; i <= expr.length()-1; ++i)
        {
            char symbol = expr.charAt(i);
            if(Character.isDigit(symbol))
            {
                int num = Character.getNumericValue(symbol);
                stk.push(num);
            }
            else
            {
                int opnd2 = stk.pop();
                int opnd1 = stk.pop();
                
                switch(symbol)
                {
                    case '+' :  stk.push(opnd1 + opnd2);
                                break;
                                
                    case '-' :  stk.push(opnd1 - opnd2);
                                break;
                                
                    case '*' :  stk.push(opnd1 * opnd2);
                                break;
                                
                    case '/' :  if(opnd2 == 0)
                                {
                                    System.out.println("Division By Zero Not Possible.!");
                                    System.exit(0);
                                }
                                else
                                {
                                    stk.push(opnd1 / opnd2);
                                    break;
                                }
                    
                    case '$' :  stk.push(opnd1 ^ opnd2);
                                break;            
                }
            }
        }
        ans = stk.pop();
    }
    
    public void display()
    {
        System.out.println("Result of Evaluation of The Given Postfix Expression is : "+ans);
    }
}

public class LaunchEvaluatePostfix
{
	public static void main(String[] args)
	{
		EvaluatePostfixExpression eval = new EvaluatePostfixExpression();
		eval.getInput();
		eval.evalPostfix();
		eval.display();
	}
}

/**************************************************************************
-----------------------
Sample Output - 01:
-----------------------
Enter a Valid Postfix Expression : 423*+                                                                                                  
Result of Evaluation of The Given Postfix Expression is : 10

-----------------------
Sample Output - 02: 
-----------------------
Enter a Valid Postfix Expression : 85+63/*                                                                                                 
Result of Evaluation of The Given Postfix Expression is : 26

-----------------------
Sample Output - 03:
-----------------------
Enter a Valid Postfix Expression : 42$3*3-84/11+/+                                                                                          
Result of Evaluation of The Given Postfix Expression is : 16 
**************************************************************************/
