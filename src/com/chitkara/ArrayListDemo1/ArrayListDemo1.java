package com.chitkara.ArrayListDemo1;

import java.util.ArrayList;

	public class ArrayListDemo1 {
	  public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			list1.add(i*10);
		}
		System.out.println(list1);
		int removeItem=list1.remove(0);
		System.out.println(list1);
		System.out.println(removeItem);
		
		boolean removeHua=list1.remove(new Integer (30));
        System.out.println(removeHua);
        System.out.println(list1);
//        list1.clear();
//        System.out.println(list1);
        
        boolean contains1=list1.contains(20);
        System.out.println(contains1);
        
        int pehele=list1.set(0,35);
        System.out.println(pehele);
        System.out.println(list1);
        
        for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i)+" ");
		}
        
        
        for (int element : list1) {
			System.out.println(element);
		}
	  }
	}
