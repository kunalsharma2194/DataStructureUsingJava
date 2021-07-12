package com.chitkara.recursion;

public class LetterCombination {

	public static String getCodes(char c) {
		if(c=='2') 
			return "abc";
		else if(c=='3')
		   return "def";	
		else
			return " ";
	}
    private void combination(String a,String s) {
    	
    	char zeroth=a.charAt(0);//2
        String bachihuiString=a.substring(1);//3
        
        String zeroWali=getCodes(zeroth);//abc
        
        
          for (int i = 0; i < zeroWali.length(); i++) {
			combination(zeroWali,s+zeroWali.charAt(i));
		   }
        
        
        
        
    	if(a.length()==0)
    		System.out.println(s);
    		return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LetterCombination l=new LetterCombination();
       
      l.combination("23","");
	}

}
