package strings;

public class PangramChecking {

	public static boolean ContainsAtoZ(String s1) {
	
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
				return (false);
		
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     String s1="The quick brown fox jumps over the lazy dog ";
     String s1="Hello ";
     if(ContainsAtoZ(s1)==true) {
    	 System.out.println(s1+":is a pangram");
     }
     else
    	 System.out.println(s1+": is not a pangram");
	}
}
