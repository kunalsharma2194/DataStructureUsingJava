package strings;

public class AllCharIsSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
//      String s1="geeks";
      String s1="gggg1";
      for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)!=s1.charAt(0)) {
			flag=1;
		}
	}      
      if(flag==1) {
    	  System.out.println("no");
      }
      else
      {    	  
    	  System.out.println("yes");
      }
	}

}
