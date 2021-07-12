package com.chitkara.recursion;

public class Maze {

	private void printPath(int cr,int cc,int dr,int dc,String s1) {

		if(cr>dr||cc>dr)
			return;
           
		if(cr==(dr-1)&&cc==(dr-1))
		{
		System.out.println(s1);
		return;
		}
		printPath(cr+1,cc,dr,dc,s1+"H");
		
		printPath(cr,cc+1,dr,dc,s1+"V");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Maze m=new Maze();
      String s1="";
      m.printPath(0,0,3,3,s1);
	}

}
