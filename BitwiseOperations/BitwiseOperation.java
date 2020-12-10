/*Bitwise Operations
Given an integer, say N. You need to find the following.
1. The number of set bits (bits that are 1 in the bitwise representation) in N
2. The position of the least significant set bit.
3. The position of the most significant set bit.
The output should be a string of the form a#b#c, where a,b,c are answer for the above three queries respectively.

Input Specification:
Input1: N, denoting an integer
Output Specification:
Return String of the form: a#b#c, where a,b,c are the total number of set bit(i.e. 1), least significant position of set bit, and most significant position of the set bit in the bitwise representation of N.

Example 1:
Input1: 10
Output: 2#1#3
Explanation: 
The bitwise representation of 10 is 1010(indexing is 3,2,1,0)
Total count of set bit(i.e 1)is 2. So a=2
the position of least significant set bit is 1, so b=1
the position of the most significant set bit is 3, so c=3
The output is returned in the form of a#b#c, hence the output is 2#1#3

Example 2:
Input1: 1
Output: 1#0#0*/

import java.util.Scanner;
public class BitwiseOperation {
	public static void bitwiseOp(int n) {
		String result = ""; //string to hold result
		String bin = Integer.toBinaryString(n);  //string conversion from integer to binary
		char[] arr = bin.toCharArray();  //char array of binary expression to count number of set bits
		//count number of set bits
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='1') {
				a++;
			}
		}
		//to find least significant position and most significant position of set bit reverse the array and then find the first and last index of set bits
		String r = "";
		for(int i=arr.length-1 ; i>=0 ; i--) {
			r += arr[i];
		}
		int b = r.lastIndexOf("1"); //least significant position
		int c = r.indexOf("1");  //most significant position
		
		//print output
		result += a+"#"+b+"#"+c;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		bitwiseOp(n);
	}
}
