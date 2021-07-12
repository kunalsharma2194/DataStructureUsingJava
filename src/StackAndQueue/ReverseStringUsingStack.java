package StackAndQueue;

import java.util.Arrays;

public class ReverseStringUsingStack {

    public void reverse(StringBuffer s1) {
    	String s2=s1.toString();
    	char arr[]=s2.toCharArray();
    	char[] temp=new char[arr.length];
        int top=arr.length-1;
        
    	for (int i = 0; i <arr.length; i++) {
			temp[top--]=arr[i];
			
		}
        s1.reverse();
    	System.out.println(s1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer s1= new StringBuffer("GeeksforGeeks");
     
     ReverseStringUsingStack m1=new ReverseStringUsingStack();
     m1.reverse(s1);
	}

}
