package com.chitkara.CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Map<String,Integer> contactList=new HashMap<>();
	
	contactList.put("Arjun",98123444);
	contactList.put("Raj",98123444);
	contactList.put("Sumit",98123444);
	
	System.out.println(contactList.get("Raj"));
//	contactList.remove("Raj");
	System.out.println(contactList.get("Raj"));
	System.out.println(contactList);
	
	if(contactList.containsKey("Rahul")) {
		System.out.println(contactList.get("Rahul"));
	}
	else
	{
		System.out.println("Save hi nahi hai");
	}
	
//    Advance method
	 int a=contactList.getOrDefault("Raja",0);
	 System.out.println(a);
	 
	 contactList.putIfAbsent("Navika",12393730);
	 
	 System.out.println(contactList);
	 
	 contactList.putIfAbsent("Navika",12393733);
	 
	 System.out.println(contactList);
	 
	 //Interate over maps
	 
//	 Set<String> keykaSet=contactList.keySet();//Big-B
//	 for(String key :keykaSet) {
//		 System.out.println(key + " "+contactList.get(key));
//	 }
	 
	 for(Map.Entry<String,Integer> pair : contactList.entrySet()) {
		 System.out.println(pair.getKey()+" "+pair.getValue());
	 }
	 
	 
}
	
	

}
