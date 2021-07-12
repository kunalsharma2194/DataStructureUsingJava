package com.chitkara.recursion;

import java.util.ArrayList;

import java.util.*;

public class generateParanthesis {

	static List<String> list=new ArrayList<>();
	public void Paranthesis(int n,String s1,int open,int close) {
		
		    if(open==n&&close==n)
		    {
		    	list.add(s1);
			    return ;
		    }
		     
			if(open<n)
       		  Paranthesis(n, s1+"(", open+1, close);
			if(open>close)
			{			
			  Paranthesis(n, s1+")", open, close+1);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  generateParanthesis m=new generateParanthesis();
	  int n=3,open=0,close=0;
      String s1=" ";
      m.Paranthesis(n,s1,0,0);
      System.out.println(list);
	}

}
