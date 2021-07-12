package strings;
import java.util.*;
public class MissingCharacterinPangram {

	

	public static void ContainsAtoZ(String s1) {
	    
		 ArrayList<Character> charsList = new ArrayList<>();
		boolean[] mark=new boolean[26];
		int index=0;
		
		for(int i=0;i<s1.length();i++) {
			//If upper case,subtract A
			if(s1.charAt(i)>='A' &&s1.charAt(i)<='Z')
			{
				index=s1.charAt(i)-'A';
			}
			else if(s1.charAt(i)>='a' &&s1.charAt(i)<='z')
			{
				index=s1.charAt(i)-'a';
			}
			else
				continue;
			
			mark[index]=true;
		}
		for (int i = 0; i < 25; i++) 
			if(mark[i]==false)
			charsList.add((char)(i+'a'));
		
		 if (charsList.size() >= 1)
		    {
		        for(Character character : charsList)
		        {
		            System.out.print(character);
		        }
		    }
//System.out.println(mark.toString());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     ContainsAtoZ(s1);
	}

}
