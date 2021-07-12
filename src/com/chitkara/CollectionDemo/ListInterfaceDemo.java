package com.chitkara.CollectionDemo;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class ListInterfaceDemo {
   public static void main(String[] args) {
	
	   List<Integer> list=new ArrayList<>();
	   list.add(20);
	   list.add(40);
	   list.add(30);
	   list.add(40);
	   list.add(50);
	   System.out.println(list);
	   System.out.println(list.indexOf(40));
	   System.out.println(list.lastIndexOf(40));
      
//	   Immutable List
	   List<Integer> list1=List.of(1,2,3);
	   List<Integer> list2=List.of(1,2,3);
//	   System.out.println(list1.remove(2));
	   
	   List<String> list3=List.of("Monday","Tuesday","Wednesday");
	  System.out.println(list3.subList(1,2));
	  
//	    Objects class contains static utility method
//	  	System.out.println(Objects.equals(list1,list2));
	  
	    
   }
}
