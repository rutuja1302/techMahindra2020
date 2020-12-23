public class LPS {
	public static int longestPalindrome1(String s) { 
		int maxPalinLength = 0; 
		String longestPalindrome = null; 
		int length = s.length(); 
		// check all possible sub strings 
		for (int i = 0; i < length; i++) { 
		    for (int j = i + 1; j < length; j++) { 
		        int len = j - i; 
		        String curr = s.substring(i, j + 1); 
		        if (isPalindrome(curr)) { 
		            if (len > maxPalinLength) { 
		                  longestPalindrome = curr; 
		                  maxPalinLength = len; 
		            } 
		        } 
		     } 
		} 
		return longestPalindrome.length(); 
	} 
	public static boolean isPalindrome(String s) { 
        for (int i = 0; i < s.length() - 1; i++) { 
		    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) { 
		        return false; 
		    } 
		} 
		return true; 
    }
	public static void main(String[] args) {
		String s = "bbbab";
		System.out.println(longestPalindrome1(s));
	}
}
