package ineuron;

public class reverseSubString {
	 public static String reverseStr(String s, int k) {
	        int n = s.length();
	        StringBuilder sb = new StringBuilder(n);

	        for (int i = 0; i < n; i += 2*k) {
	             int j = Math.min(i + k, n);
	             StringBuilder rev = new StringBuilder(s.substring(i, j));
	             rev.reverse();
	             sb.append(rev);
	             int rem = Math.min(i + 2*k, n);
	             sb.append(s.substring(j, rem));
	        }
	         return sb.toString();
	    }

	public static void main(String[] args) {
		String s= "abcdefg";
		int k=2;
		String ans=reverseStr(s,k);
		System.out.println(ans);
	}

}
