package com.chitkara.Graphs;

import java.util.*;
public class Graph {
	
	  static void addEdge(LinkedList<LinkedList<Integer>> adj,int u,int v) {
		  adj.get(u).add(v);
		  adj.get(v).add(u);
	  }
	  
	  // To print the adjaceny list
	    static void
	    printadjacenylist(LinkedList<LinkedList<Integer> > adj)
	    {
	        for (int i = 0; i < adj.size(); ++i) {
	  
	            // Printing the head
	            System.out.print(i + "->");
	  
	            for (int v : adj.get(i)) {
	                // Printing the nodes
	                System.out.print(v + " ");
	            }
	  
	            // Now a new line is needed
	            System.out.println();
	        }
	    }
	  
	public static void main(String[] args) {
          int v=5;
          
          LinkedList< LinkedList<Integer> > adj =new LinkedList< LinkedList<Integer> >();
          for (int i = 0; i < v; i++) {
			adj.add(new LinkedList<Integer>());
		  }
          
          addEdge(adj,0,1);
          addEdge(adj,0,4);
          addEdge(adj,1,2);
          addEdge(adj, 1, 3);
          addEdge(adj, 1, 4);
          addEdge(adj, 2, 3);
          addEdge(adj, 3, 4);
          
//          System.out.println(adj);
          
          printadjacenylist(adj);
	}
}
