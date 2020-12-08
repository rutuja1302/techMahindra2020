/*Maximum Sum
 * Write a program that adds up the largest row sum and the largest column sum from an N-rows * M-column array of numbers.
 * As a preliminary phrase, you should reformat the sequence of numbers as a matrix, whose number of rows and columns are to be specified as arguments.
 * 
 * Input Specification:
 * Input1: Integer for row dimension of the array
 * Input2: Integer for column dimension of the array
 * Input3: Array elements to be entered in row major
 * 
 * Output Specification
 * Largest row sum + Largest Column sum
 * 
 * Example 1:
 * Input1: 2
 * Input2: 2
 * Input3: {1,2,5,6}
 * Output: 19
 * Explanation: The array has 2 rows(input1) and columns(input2). The elements in the first row are 1 and 2 and the elements in the second row are 5 and 6(input3).
 * The largest sum among the two rows is 11(5+6). The largest sum among the two columns is 8+(2+6). By adding those two up, we get the final sum of 19(11+8)
 * 
 * Example 2:
 * Input1: 3
 * Input2: 3
 * Input3: {3,6,9,1,4,7,2,8,9}
 * Output: 44*/

import java.util.Scanner;
public class MaximumSum {
	public static int max(int row,int column,int[] array) {
		int max,maxR=0,maxC=0;
		//form a matrix
		int[][] rc = new int[column][row];
		int a=0;
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				rc[i][j] = array[a];
				a++;
			}
		}
		//find row max
		for(int i=0;i<column;i++) {
			int m=0;
			for(int j=0;j<row;j++) {
				m += rc[i][j];
			}
			if(maxR<m) {
				maxR = m;
			}
		}
		//find column max
		for(int i=0;i<row;i++) {
			int m=0;
			for(int j=0;j<column;j++) {
				m += rc[j][i];
			}
			if(maxC<m) {
				maxC = m;
			}
		}
		//max of row&column = max of row + max of column
		max = maxR + maxC;
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[] arr = new int[row*column];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		int result = max(row,column,arr);
		System.out.println(result);
	}
}
