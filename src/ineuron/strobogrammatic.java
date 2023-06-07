package ineuron;

import java.util.HashMap;

public class strobogrammatic {
	 public static boolean isStrobogrammatic(String num) {
	        HashMap<Character, Character> map = new HashMap<Character, Character>();
	        map.put('6', '9');
	        map.put('9', '6');
	        map.put('0', '0');
	        map.put('1', '1');
	        map.put('8', '8');

	        int l = 0, r = num.length() - 1;
	        while (l <= r) {
	            if (!map.containsKey(num.charAt(l))) return false;
	            if (map.get(num.charAt(l)) != num.charAt(r))
	                return false;
	            l++;
	            r--;
	        }

	        return true;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="69";
		boolean ans=isStrobogrammatic(num);
		System.out.println(ans);

		
	}

}
