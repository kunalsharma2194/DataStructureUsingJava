package strings;

public class SplitBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="0100110101";
		int countZero=0;
		int countOne=0;
		int outPut=0;
		char s[]=s1.toCharArray();
		System.out.println(s[0]);
		for (int i = 0; i < s.length; i++) {
			if(s[i]=='0') {
				countZero++;
			}
			else
			{
              countOne++;				
			}
			if(countZero==countOne) {
			 	outPut++;
			}
		}
     System.out.println(outPut);
	}

}
