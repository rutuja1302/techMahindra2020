//Program to Print Geometric Progression(GP)
//Given first two terms and a integer n of the Geometric Progression series, the task is to print the nth term of the series
/*Example:
 * Input1: 2.0  //g2
 * Input2: 4.0  //g3
 * Input3: 4    //n
 * Output: 8.0
 */

import java.util.Scanner;
public class GeometricProgression {
	public static Double geoProg(Double input1, Double input2, int input3) {
		Double n = input2;
		Double r = input2/input1;
		for(int i=0;i<input3-3;i++) {
			n = n*r;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double g2= scan.nextDouble();
		Double g3= scan.nextDouble();
		int n = scan.nextInt();
		Double r = geoProg(g2,g3,n);
		System.out.println(r);
	}
}
