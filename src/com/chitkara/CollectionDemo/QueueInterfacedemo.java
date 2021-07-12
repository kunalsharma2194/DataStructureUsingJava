package com.chitkara.CollectionDemo;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue<Integer> q1=new LinkedList<>();
    Collection<Integer> q2=new LinkedList<>();
    Deque<Integer> q3=new LinkedList<>();    
    Queue<Integer> q4=new ArrayDeque<>();
    
    Deque<Integer> stack=new ArrayDeque<>();
    stack.addLast(10);
    stack.addLast(20);
    stack.addLast(30);
    stack.addLast(40);
    
    stack.removeLast();
    System.out.println(stack.peekLast());
	}

}
