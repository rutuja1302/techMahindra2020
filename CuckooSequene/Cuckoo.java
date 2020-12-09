/*The Cuckoo Sequence
 * A Cuckoo Sequence is defined as shown.
 * Cuckoo[1]=0
 * Cuckoo[2]=1
 * Cuckoo[n]=1*Cuckoo[n-1]+2*Cuckoo[n-2]+3*1, for n>2
 * Given n (1<=n<=10^9)
 * 
 * Input Specification
 * Input1: Integer 'n'
 * Output Specification:
 * Return the value of Cuckoo[n].
 * Example 1:
 * input1: 3
 * Output: 4
 * */

import java.util.Scanner;
public class Cuckoo {
	public static int cuckoo(int n) {
		int[] cuckoo = new int[n+1];
		cuckoo[0]=0;
		cuckoo[1]=0;
		cuckoo[2]=1;
		for(int i=3;i<cuckoo.length;i++) {
			cuckoo[i] = 1*cuckoo[i-1] + 2*cuckoo[i-2] + 3*1;
		}
		return cuckoo[n];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = cuckoo(n);
		System.out.println(result);
	}
}
