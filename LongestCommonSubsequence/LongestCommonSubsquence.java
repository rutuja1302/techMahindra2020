//This program takes 2 strings as input and return the length of the longest common subsequence

/* Example 1:
 * Input1: ababa
 * Input2: aba
 * Output: 3
 */
public class LongestCommonSubsequence {
	static String x,y;
	public static int lcs(int i,int j, int count) {
		if(i==0 || j==0) {
			return count;
		}
		if(x.charAt(i-1) == y.charAt(j-1)) {
			count = lcs(i-1,j-1,count+1);
		}
		count = Math.max(count, Math.max(lcs(i-1,j,0),lcs(i,j-1,0)));
		return count;
	}
	public static void main(String[] args) {
		x = "abcdxyz";
		y = "xyzabcd";
		int m = x.length();
		int n = y.length();
		System.out.println(lcs(m,n,0));
	}
}
