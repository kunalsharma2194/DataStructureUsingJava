package com.chitkara.Graphs;

import java.util.*;
public class BreathFirstSerachUsingQueue {

	static void addEdge(LinkedList< LinkedList<Integer>> adj,int u,int v) {
	adj.get(u).add(v);
	adj.get(v).add(u); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList <LinkedList<Integer>> adj=new LinkedList<LinkedList<Integer>>();
    int v=5;
    
    for (int i = 0; i < 5; i++) {
		adj.add(new LinkedList<Integer>());
	}
    
    addEdge(adj,0,1);
    addEdge(adj,0,4);
    addEdge(adj,1,2);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    
    System.out.println(adj);
	}
    
}
