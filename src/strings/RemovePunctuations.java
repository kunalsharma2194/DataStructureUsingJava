package strings;
import java.util.*;
public class RemovePunctuations {

	public static void rmvp(String s1) {		
		String str=s1.replaceAll("\\p{Punct}","");
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
		String s1=sc.nextLine();
		
		rmvp(s1);
	}

}
