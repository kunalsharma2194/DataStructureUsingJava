package com.chitkara.recursion;

public class queenPermutation {

	public static void kitneWays(boolean[] buildings,int n,int totalBande,int kitnePlaceHogye,String s1) {
		if(totalBande==kitnePlaceHogye) {
			System.out.println(s1);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if(buildings[i]!=true) {
				buildings[i]=true;
			}
			kitneWays(buildings,n,totalBande,kitnePlaceHogye+1,s1+"c"+ i+ "q" +kitnePlaceHogye);
			buildings[i]=false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean[] buildings=new boolean[4];
	kitneWays(buildings, 4,2, 0,"");
	}

}
