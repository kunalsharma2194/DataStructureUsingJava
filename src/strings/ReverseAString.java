package strings;

public class ReverseAString {

	static  void ReverseString(StringBuffer str) {
//		s1.toCharArray();
		int l=str.length();
		int j=0;
		Character[] temp=new Character[l];
		for (int i = l-1; i >= 0; i--) {
			temp[j++]= str.charAt(i);
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="abc";
      StringBuffer str=new StringBuffer(s1);
      ReverseString(str);
	}

}
