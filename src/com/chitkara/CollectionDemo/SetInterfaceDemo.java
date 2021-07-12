package com.chitkara.CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<Integer> s1=new HashSet<>();
     s1.add(10);
     s1.add(20);
     s1.add(30);
     s1.add(40);
     s1.add(50);
     s1.add(60);
     s1.add(70);
     System.out.println(s1);
     Set<Integer> s2=new LinkedHashSet<>();
     s2.add(10);
     s2.add(20);
     s2.add(30);
     s2.add(40);
     s2.add(50);
     s2.add(60);
     s2.add(70);
     System.out.println(s2);
     
     Set<Integer> s3=new TreeSet<>();
     s3.add(7);
     s3.add(4);
     s3.add(1);
     s3.add(9);
     s3.add(12);
     
     System.out.println(s3);
	}

}
