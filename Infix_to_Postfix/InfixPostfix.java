/*Infix to Postfix conversion
 * Infix Expression:
 * In Infix expressions, operators are written in between their operands.
 * An expression such as A * (B + C) / D
 * 1. First add B and C together.
 * 2. Multiply the result by A
 * 3. Divide by D to get the final answer.
 * The expression for adding the numbers 1 and 2 is "1 + 2"
 * Postfix expressions:
 * In Postfix expressions, the operators follow their operands.
 * The expression for adding the numbers 3 and 4is "3 4 +"
 * If there are multiple operations, the operator is given immediately after its second operand. 
 * So the expression written for"3-4+5"would be "34-5+" in postfix notation.
 * Here, 4 is first subtracted from 3, then added to 5.
 * 
 * Write a program that takes input as a string containing an infix expression and returns the corresponding postfix expression.
 * 
 * Note:
 * 1. The string contains operators(+,-,/,*), parenthesis and operands(digits)
 * 2. Each digit is a separate operand.
 * 
 * The operator precedence is as follows:
 * 1. [divide(/) and multiply(*)operator] > [addition(+) and subtraction(-) operator]
 * 2. If you encounter operators with same precedence like(divide and multiply) or (addition or subtraction), then evaluate the operators from left to right.
 * 
 * Input Specifications:
 * Input1: an input string that contains the Infix expression
 * Output Specification:
 * Return the Postfix expression of the given Infix expression
 * 
 * Example 1:
 * Input1: 8+(7-9)*2
 * Output: 879-2*+
 * 
 * Example 2:
 * Input1: (1)+8
 * Output: 18+*/

import java.util.*;
public class InfixPostfix{ 
    static boolean isOperator(char c) {
    	return (!(c >= 'a' && c <= 'z') && 
    			!(c >= '0' && c <= '9') && 
    			!(c >= 'A' && c <= 'Z')); 
    }
	static int Prec(char c) 
    { 
        if(c=='+' || c=='-') {
        	return 1;
        }else if(c=='*' || c=='/') {
        	return 2;
        }else if(c=='^') {
        	return 3;
        }
    	return 0;
    } 
    public static String infixToprefix(String input1) {
    	Stack<Character> operators = new Stack<Character>();
    	Stack<String> operands = new Stack<String>();
    	for (int i = 0; i < input1.length(); i++) {
    		if (input1.charAt(i) == '(') 
    		{ 
    			operators.push(input1.charAt(i)); 
    		}
    		else if (input1.charAt(i) == ')') 
    		{ 
    			while (!operators.empty() && operators.peek() != '(') {  
    				String op1 = operands.peek(); 
    				operands.pop();  
    				String op2 = operands.peek(); 
    				operands.pop(); 
    				char op = operators.peek(); 
    				operators.pop(); 
    				String tmp = op + op2 + op1; 
    				operands.push(tmp); 
    			} 
    			operators.pop(); 
    		} 
    		else if (!isOperator(input1.charAt(i))) { 
    			operands.push(input1.charAt(i) + ""); 
    		}
    		else{ 
    			while (!operators.empty() && Prec(input1.charAt(i)) <= 
    					Prec(operators.peek())) 
    				{ 

    				String op1 = operands.peek(); 
    				operands.pop(); 

    				String op2 = operands.peek(); 
    				operands.pop(); 

    				char op = operators.peek(); 
    				operators.pop(); 

    				String tmp = op + op2 + op1; 
    				operands.push(tmp); 
    			} 

    			operators.push(input1.charAt(i)); 
    		} 
    	}
    	while (!operators.empty()) { 
    		String op1 = operands.peek(); 
    		operands.pop(); 

    		String op2 = operands.peek(); 
    		operands.pop(); 

    		char op = operators.peek(); 
    		operators.pop(); 

    		String tmp = op + op2 + op1; 
    		operands.push(tmp); 
    	}  
    	return operands.peek();
    }
    public static void main(String[] args)  
    { 
        Scanner scan = new Scanner(System.in);
    	String input1 = scan.nextLine(); 
        System.out.println(infixToprefix(input1)); 
    } 
} 
