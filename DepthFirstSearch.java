package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
	
	public <T> void traverse(Vertex<T> startVertex) {
		
		Stack<Vertex> stk = new Stack<Vertex>();
		stk.push(startVertex);
		while(!stk.isEmpty()) {
			Vertex currentV = stk.pop();
			if(!currentV.isVisited()) {
				currentV.setVisited(true);
				System.out.println(currentV.getData());
				Collections.reverse(currentV.getNeighbours());
				List<Vertex> l = currentV.getNeighbours();
				
				for(Vertex childVertex : l) {
					stk.push(childVertex);
				}
				
			}
		}
		
	}
	
	public static void main(String args[]) {
		Vertex<Integer> v0 = new Vertex<Integer>(0);
		Vertex<Integer> v1 = new Vertex<Integer>(1);
		Vertex<Integer> v2 = new Vertex<Integer>(2);
		Vertex<Integer> v3 = new Vertex<Integer>(3);
		Vertex<Integer> v4 = new Vertex<Integer>(4);
		Vertex<Integer> v5 = new Vertex<Integer>(5);
		Vertex<Integer> v6 = new Vertex<Integer>(6);
		v0.setNeighbours(Arrays.asList(v1,v5,v6));
		v1.setNeighbours(Arrays.asList(v3,v4,v5));
		v4.setNeighbours(Arrays.asList(v2,v6));
		v6.setNeighbours(Arrays.asList(v0));
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.traverse(v0);
 	}

}
