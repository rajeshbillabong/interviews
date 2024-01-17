//https://leetcode.com/problems/is-subsequence/
public class SubSequence {

	
	public static boolean isSubsequence() {
		
		String s1 = "abc";
		String s2 = "ahbgdc";
		
		int pos=0;
		
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i) == s1.charAt(pos) && pos <s1.length()) {
				pos++;
			}
		}
		if(pos != s1.length()) return false;

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("result="+isSubsequence());
	}

	
}
