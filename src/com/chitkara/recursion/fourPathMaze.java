package com.chitkara.recursion;

import java.util.*;
public class fourPathMaze {

	public void fourPath(int cr,int cl,int n,String s1,boolean a[][]) {
		
		
		if(cr>=n||cl>=n || cr<0 || cl<0||a[cr][cl]==true) {
			return ;
		}
		if(cr==n-1&&cl==n-1)
		{
			System.out.println(s1);
			return;
		}
		a[cr][cl]=true;
		fourPath(cr-1,cl,n,s1+"U",a);
		fourPath(cr+1,cl,n,s1+"D",a);
		fourPath(cr,cl-1,n,s1+"L",a);
		fourPath(cr,cl+1,n,s1+"R",a);
		a[cr][cl]=false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fourPathMaze f=new fourPathMaze();
     boolean[][] vis=new boolean[3][3] ;
     f.fourPath(0,0,3,"",vis);
	}

}
