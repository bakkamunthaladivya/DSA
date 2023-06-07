package ineuron;

public class reverseString {

	public static String reverseWords(String s) {
        String[] str=s.split(" ");
        String finalresult="";
        for(int i=0;i<str.length;i++){
        	String result="";
	   	for(int j=0;j<str[i].length();j++){
	   		result+=str[i].charAt(str[i].length()-j-1);
	   	}
	   	result+=" ";
	   	finalresult+=result;
	   }
        return finalresult.trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Let's take LeetCode contest";
		String ans=reverseWords(s);
		System.out.println(ans);

	}

}
