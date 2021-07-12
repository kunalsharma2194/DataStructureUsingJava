package com.chitkara.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 List<Integer> emptyList=Collections.emptyList();
	 
//	 System.out.println(emptyList.add(1));
	 
	 List<String> ek=Collections.singletonList("ferrari");
	 System.out.println(ek);
	 List<String> gaddiyan=new ArrayList<>();
	 gaddiyan.add("Mustang");
	 gaddiyan.add("Chirag");
	 gaddiyan.add("Aston martin");
	 gaddiyan.add("Buggati");
	 gaddiyan.add("Tesla");
	 List<String> dummy=Collections.unmodifiableList(gaddiyan);
	 System.out.println(dummy);
	 
	Collections.sort(gaddiyan);
	System.out.println(gaddiyan);
	
	List<Integer> l=new ArrayList<>(List.of(1,1,3,4,3,6));
	Collections.reverse(l);
	System.out.println(l);
	Collections.shuffle(l);
	System.out.println(l);
	int f=Collections.frequency(l,3);
	System.out.println(f);
	
	int min=Collections.min(l);
	System.out.println(min);
	
	int max=Collections.max(l);
	System.out.println(max);
	}

}
