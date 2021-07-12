package strings;

public class PangrammaticLipogram {

	public static  int count=0;
	public static boolean pangramLipoChecker(String s1) {
		boolean[] mark=new boolean[26];
		int index=0;
		s1.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			//If upper case,subtract A
			if(s1.charAt(i)>='a' &&s1.charAt(i)<='z')
			{
				index=s1.charAt(i)-'a';
			}
			
			else
				continue;
			
			mark[index]=true;
		}
		for (int i = 0; i < 25; i++) 
			if(mark[i]==false) {
				count++;
				return (false);
			}
		
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="The quick brown fox jumps over the lazy dog ";
    String s2="The quick brown fox jumped over the lazy dog";
    String s3="The quick brown fox jum over the lazy dog";
     if(pangramLipoChecker(s1)==true) {
    	 System.out.println(s1+":is a pangram");
     }
     pangramLipoChecker(s2);
     if(count==1) {
    	 System.out.println(s1+":Pangrammatic Lipogram");
	}
     pangramLipoChecker(s3);
	if(count>1)
	{
		System.out.println(s1+":Not a Pangram but might a Lipogram");
	}
     
}
}	
