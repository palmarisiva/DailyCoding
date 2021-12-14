package com.sample;

import java.util.HashMap;

public class LRUImpl {
	
	// Left LRU, Right MRU
	// Store HashMap with key and node value.
	// shift the recently used to right and left LRU. 
	
	public static HashMap LRU(int size,HashMap hm, Node node, int[] arr, String oper) {
		
		//HashMap<Integer, Node> hm = new HashMap<Integer, Node>();
		//Node node = (Node)hm.get(arr[0]);
	    if(oper.equals("put")) {
		if (node == null && hm.isEmpty() ) {
			node = new Node(arr[1],null, null);
			hm.put(arr[0], node);
		} 
		else {
			if(!hm.isEmpty() && !hm.containsKey(arr[0])) {
				Node node1 = new Node(arr[1], null, null);
				node1.prev = null;
				node1.next = node;
				hm.put(arr[0], node1);
			}
			
		}
	    }
	    if(oper.equals("get")) {
	    	
	    	if(!hm.isEmpty() && hm.containsKey(arr[0])) {
	    		while(node !=null) {
	    			if(node.data == arr[0]) {
	    				Node tmpNode = node.next;
	    				node.next = null;
	    				node.prev = tmpNode;
	    			} else {
	    				Node tmpNode = node;
	    				node = node.next;
	    				node.next = tmpNode;
	    				
	    			}
	    		}
	    		
	    		
	    		
	    	}
	    	
	    }
		
		return hm;
		
	}
	public static void main(String args[]) {
		Node node = null;
		int arr[] = {1,1};
		HashMap hm1= LRU(2,new HashMap<Integer, Node>(), node, arr, "put");
		int arr1[] = {2,2};
		HashMap hm2 = LRU(2,hm1,(Node)hm1.get(arr[0]),arr1, "put");
		int arr2[] = {1};
		HashMap hm3 = LRU(3,hm2,(Node)hm2.get(arr1[0]),arr2, "get");		
	}

}
