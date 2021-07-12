package strings;
import java.util.*;
public class CountTheReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="[()]{}{[()()]()}";
     char s1[]=s.toCharArray();
     Stack<Character> a=new Stack<>();
     
     for (int i = 0; i < s.length(); i++) {
    	 char x=s.charAt(i);
//    	 if(a.isEmpty()) {
//    		 a.push(x);
//    	 }
    	 
		if(x=='{'||x=='['||x=='('){
			a.push(x);
		}
		else if(x=='}'||x==']'||x==')'&& !a.isEmpty()) {
//			if(a.peek()=='}'||a.peek()==']'||a.peek()==')')
			a.pop();
		}
	}
     System.out.println(a.toString());
     if(a.isEmpty()) {
    	 System.out.println("balanced");
     }
     else
     {
    	 System.out.println("Unbalanced");    	 
     }
	}

}
