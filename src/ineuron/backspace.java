package ineuron;

import java.util.Stack;

public class backspace {
	 public static boolean backspaceCompare(String S, String T) {

	        Stack<Character> stack1 = new Stack<Character>();
	        Stack<Character> stack2 = new Stack<Character>();
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)!='#'){
	            stack1.push(S.charAt(i));

	        }else{
	                    stack1.pop();
	                }
	        }
	        for(int j =0;j<T.length();j++){

	            if(T.charAt(j)!='#'){
	            stack2.push(S.charAt(j));

	        }else 
	                stack2.pop();
	        }

	        if(stack1.equals(stack2))
	            return true;
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab#c";
		String t = "ad#c";
		boolean ans=backspaceCompare(s,t);
		System.out.println(ans);
	}

}
