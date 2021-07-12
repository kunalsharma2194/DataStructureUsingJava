package strings;

import java.util.*;

public class IntegerorStringCheck {

	static boolean check(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))==false)
			{
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(check(s)){
			System.out.println("Integer");
		}
		else
		{
			System.out.println("String");
		}
	}
}
