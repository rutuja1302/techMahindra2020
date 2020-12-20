/*Evaluate a Given Postfix Expression
In Postfix Expressions, the operators follow their operands.
For example: To add 3 and 4, we would write "3 4 +"rather than "3 + 4".
If there are multiple operations, the operator is given immediately after its second operand.
So the expression "3 - 4 + 5" would be written as "3 4 - 5 +" in Postfix notation. Here, 4 is first subtracted from 3, then 5 added to it.
 
Write a program that takes as input a string containing a postfix expression and returns the evaluated value of that postfix expression.

Note:
1. The string contains operators(+,-,/,*) and operands(digits)
2. Each digit is a separate operand.
3. The division operator performs integer division.
4. It is guaranteed that division by zero will never occur during the evaluation.

Input Specification:
Input1: string which contains the postfix expression.
Output Specification:
Return the evaluated value of postfix expression.

Example 1:
Input1: 84-
Output: 4*/

import java.util.Scanner;
public class PostfixExpression {
	public static int postfix(char[] array) {
		char temp;
		int res;
		for(int i=0;i<array.length;i++) {
			if(array[i]=='+' || array[i]=='-' || array[i]=='*' || array[i]=='/') {
				temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			}
		}
		res = Character.getNumericValue(array[0]);
		for(int i = 1;i<array.length;i++) {
			if(array[i]=='+') {
				res += Character.getNumericValue(array[i+1]);
			}else if(array[i]=='-') {
				res -= Character.getNumericValue(array[i+1]);
			}else if(array[i]=='/') {
				res /= Character.getNumericValue(array[i+1]);
			}else if(array[i]=='*') {
				res *= Character.getNumericValue(array[i+1]);
			}
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expression = scan.nextLine();
		char[] exp = expression.toCharArray();
		int result = postfix(exp);
		System.out.println(result);
	}
}
