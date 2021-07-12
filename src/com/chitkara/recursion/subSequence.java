package com.chitkara.recursion;

public class subSequence {
	
	 public void  Sequence(String s1,String sub) {
		 
		 if(s1.length()==0)
		 {
		 System.out.println(sub);
		 return;
		 }
		 
		 char zero=s1.charAt(0);
      		 
		 Sequence(s1.substring(1),sub);
		 Sequence(s1.substring(1),sub+zero);
		 
					 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        subSequence sb=new subSequence();
        sb.Sequence("abc"," ");
	}

}
