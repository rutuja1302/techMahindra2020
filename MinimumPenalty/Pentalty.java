//Minimum Penalty -  Write a program which accepts array of length N and returns the sum of all the differences between two adjacent elements.

/* Input1: 5
 * Input2: 10 -12 15 0 5
 * Output: 27
 * 
 * Input1: 3
 * Input2: 5 10 15
 * Output: 10
 */
import java.util.*;
public class Penalty {
	public static void penalty(int input1, int[] input2) {
		int pen = 0;
		int temp;
		//arranging elements
		Arrays.sort(input2);
		for(int i=0;i<input1-1;i++) {
			pen += Math.abs(input2[i+1]-input2[i]);
		}
		System.out.println(pen);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		penalty(n,arr);
	}
}
