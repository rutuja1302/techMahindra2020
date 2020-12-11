/*Remainder mod 11
 * Given a string (of maximum length 1000) representing a larger number.
 * Output its remainder modulo 11.
 * 
 * Input1: 121
 * Output: 0
 * 
 * Input2: 122
 * Output: 1*/

import java.util.*;

public class RemainderMod {
	public static int mod(String num) {
		int n = Integer.valueOf(num);
		int rem=n%11;
		return rem;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		System.out.println(mod(num));
	}
}
