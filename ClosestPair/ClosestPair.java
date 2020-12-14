/*Find the closest pair in an array
 * 
 * Example 1:
 * Input1: 3
 * Input2: {-10,0,11}
 * Output: 10
 * Explanation: In above example, the distance between -10 and 0 is 10, distance between -10 and 11 is 21, and between 0 and 11 is 11. So, the distance between the closest pair is 10
 * 
 * Example 2:
 * Input1: 5
 * Input2: {10,2,-4,5,29}
 * Output: 3
 * Explanation: closest pair is 2 and 5*/

import java.util.Scanner;
public class ClosestPair {
	public static int closestPair(int n, int[] arr) {
		int d;
		int c = Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				d = Math.abs(arr[i] - arr[j]);
				if(d<c) {
					c = d;
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //input1
		int[] arr = new int[n];  //input2
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int result = closestPair(n,arr);
		System.out.println(result);
	}
}
