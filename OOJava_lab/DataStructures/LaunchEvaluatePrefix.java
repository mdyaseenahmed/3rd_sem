/******************************************************************************
    Java Program To Evaluate a Given Prefix Expression.
*******************************************************************************/

/************************************************************************************************************************
----------------------------- 
    Pseudocode: 
-----------------------------    
        
        create a new STACK of Integers
        Reverese the given prefix expression and traverse the entire length of the prefix expression
        {
            consider the character at ith position as th current symbol
            
            if(the current symbol is a digit)
            {
                obtain the numeric value of the symbol and place it in num
                push num onto the STACK
            }
            else
            {
                pop the top of the STACK and place it in operand1
                pop the top of the STACK and place it in operand2
                
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
        
        Step 1 : Reverse the Prefix Expression.
        Step 2 : If an Operand is Encountered : Push it onto the STACK.
        Step 3 : If an Operator is Encountered :    i. POP the top of The STACK and Make it operand1.
                                                   ii. POP the top of The STACK and Make it operand2.
                                                  iii. Perform the Operaion.
                                                   iv. Push the Result Back to the STACK.
                                
************************************************************************************************************************/

import java.util.Scanner;
import java.util.Stack;

class EvaluatePrefixExpression
{
    String expr;
    int ans;
    
    public void getInput()
    {
        System.out.print("Enter a Valid Prefix Expression : ");
        Scanner sc = new Scanner(System.in);
        expr = sc.next();
    }
    
    
    public void evalPrefix()
    {
        Stack<Integer> stk = new Stack<Integer>();
        
        for(int i = expr.length()-1; i >= 0; --i)
        {
            char symbol = expr.charAt(i);
            if(Character.isDigit(symbol))
            {
                int num = Character.getNumericValue(symbol);
                stk.push(num);
            }
            else
            {
                int opnd1 = stk.pop();
                int opnd2 = stk.pop();
                
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
        System.out.println("Result of Evaluation of The Given Prefix Expression is : "+ans);
    }
}

public class LaunchEvaluatePrefix
{
	public static void main(String[] args)
	{
		EvaluatePrefixExpression eval = new EvaluatePrefixExpression();
		eval.getInput();
		eval.evalPrefix();
		eval.display();
	}
}

/**************************************************************************
-----------------------
Sample Output - 01:
-----------------------
Enter a Valid Prefix Expression : +4*23                                                                                                   
Result of Evaluation of The Given Prefix Expression is : 10

-----------------------
Sample Output - 02: 
-----------------------
Enter a Valid Prefix Expression : *+85/63                                                                                                 
Result of Evaluation of The Given Prefix Expression is : 26

-----------------------
Sample Output - 03:
-----------------------
Enter a Valid Prefix Expression : +-*$4233//84+11                                                                                          
Result of Evaluation of The Given Prefix Expression is : 16 
**************************************************************************/
