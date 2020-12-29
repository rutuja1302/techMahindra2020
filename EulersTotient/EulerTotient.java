import java.util.*;
public class EulerTotient {
	static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
	public static int euler(int input1) {
		int result=1;
		for(int i=2;i<input1;i++) {
			if(gcd(i,input1)==1) {
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = euler(n);
		System.out.println(result);
	}
}
