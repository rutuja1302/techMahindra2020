/*Next Greater Number
Given a number 'N'(containing at most 10,000 digits), find the next greater number having the same digits.
It is guaranteed that there exists a next greater number having the same digits as N.

Input Specifications:
Input 1: the length of the String "n"
Input 2: the number 'N' in the form of a string
Output Specifications:
Return the next grater number having the same digits as 'N' in the form of a string
 
Example 1:
Input 1: 3
Input 2: 182
Output: 218
Explanation:Using the same digit the number of permutation are:
128 218 281 812 821
The next greatest number is 218

Example 2:
Input1: 19
Input2: 123457849876554321
Output: 1234567851234456789
*/

import java.util.*;
public class NextGreaterNum {
	public static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	public static String greaternum(int input1,String input2) {
		char[] ar = input2.toCharArray();
        int i; 
		String result = "";
		for (i = input1 - 1; i > 0; i--) 
		{ 
			if (ar[i] > ar[i - 1]) { 
				break; 
			} 
		} 
 
		if (i == 0) 
		{ 
			result = input2;
		} 
		else
		{ 
			int x = ar[i - 1], min = i;  
			for (int j = i + 1; j < input1; j++) 
			{ 
				if (ar[j] > x && ar[j] < ar[min]) { 
					min = j; 
				} 
			} 
 
			swap(ar, i - 1, min); 

			Arrays.sort(ar, i, input1); 
			for(i=0;i<input1;i++) {
				result += ar[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num = scan.next();
		System.out.println(greaternum(n,num));
	}
}
