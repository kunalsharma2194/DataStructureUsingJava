package strings;

import java.util.regex.Pattern;
public class ReverseWords {

	static void reverseWords(String s1) {
		
		Pattern pattern=Pattern.compile("\\s");
		
		String[] temp=pattern.split(s1);
		String result="";
		
		for (int i = 0; i < temp.length; i++) {
			if(i==temp.length-1)
				result=temp[i]+result;
		else
			result=" "+temp[i]+result;
		
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome to geeksforgeeks";
		String s2 = "I love Java Programming";
      reverseWords(s2);
	}

}
