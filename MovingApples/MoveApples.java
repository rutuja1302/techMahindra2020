/*Moving Apples
 * There are N number of baskets, where the i^th basket contains input[i] apples.
 * We want to move apples between baskets so that all baskets have the same number of apples. What is the minimum number of apples that must be moved?
 * 
 * It is guaranteed that there exists a way to move apples so as to have an equal number of apples in each basket.
 * 
 * Input Specifications:
 * Input1: N, denoting the Number of Baskets
 * Input2: array representing the number of apples in the i^th basket
 * 
 * Output Specification:
 * Return the minimum number of apples that must be moved so that all baskets have the same number of apples.
 * 
 * Example 1:
 * Input1 : 2
 * Input2: {1,3}
 * Output: 1
 * Explanation: There are 2 baskets with first containing 1 apple and second containing 3 apples.
 * If we shift one apple from the second container to the first container then both will have 2 apples. So only one apple was required to move.
 * Hence output is 1.
 * 
 * Example 2:
 * Input1: 5
 * Input2: {2849,1620,705,1,30}
 * Output: 2387*/

import java.util.Scanner;
public class MoveApples {
	public static int moveApples(int input1, int[] input2) {
		int moveApples = 0,reqApples=0;
		//apples required in each basket
		for(int i=0;i<input1;i++) {
			reqApples += input2[i];
		}
		reqApples /= input1;
		//apples to be moved
		for(int i=0;i<input1;i++) {
			if(input2[i]>reqApples) {
				moveApples += (input2[i]-reqApples);
			}
		}
		return moveApples;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int result = moveApples(n,arr);
		System.out.println(result);
	}
}
