package com.chitkara.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Collection<Integer> list=new ArrayList<>();
     Collection<Integer> list2=new ArrayList<>();
     list2.add(20);
     list2.add(30);
     list2.add(40);
     list.add(10);
     System.out.println(list);
     boolean l=list.contains(20);
     System.out.println(l);
     System.out.println(list.isEmpty());
     list.addAll(list2);
     System.out.println(list);
	}

}
