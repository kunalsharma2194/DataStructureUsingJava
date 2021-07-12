package strings;

/*Input : s1 = "hello"
s2 = "geeksforgeeks"
Output : s2 = "hello"
*/

public class CopyString {

	static void myCopy(char s1[],char s2[])
	{
		int i=0;
		for (i = 0; i < s2.length; i++) {
			s2[i]=s1[i];
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char s1[]="geeksforgeeks".toCharArray();
      char s2[]=new char[s1.length];
//      s2="Hello".toCharArray();
      myCopy(s1,s2);
	}
}
