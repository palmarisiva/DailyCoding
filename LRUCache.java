package com.sample;

import java.util.HashMap;

public class LRUCache {
	int size;
	HashMap<Integer,DLLNode> hm; 
	//Head Most used
	DLLNode head;
	//Tail Least used
	DLLNode tail; 
	
	public LRUCache(int size) {
		this.size = size;
		hm = new HashMap<Integer,DLLNode>();
	}
	public int get(int key) {
		
		// Check key
		if(hm.containsKey(key)) {
			DLLNode node = hm.get(key);
			removeNode(node);
			putitOnTop(node);
			return node.val;
		} 
		
		return -1;
	}
	public void put(int key, int val) {
		//Key is present
		if(hm.containsKey(key)) {
			DLLNode node = hm.get(key);
			node.val  =val;
			//removeNode
			removeNode(node);
			putitOnTop(node);
			//putitonTop
		} else {
			if(hm.size() >= size) {
				hm.remove(tail.key);
				removeNode(tail);
				
			} 
				DLLNode node1 = new DLLNode(key, val);
			    hm.put(key, node1);
			    putitOnTop(node1);
			
		}
	}
	
	public void removeNode(DLLNode node) {
		DLLNode prev = node.prev;
		DLLNode next = node.next;
		if(prev != null ) {
			prev.next = node.next;
		} else {
			head = next;
		}
		if(next != null) {
			next.prev = prev;
			
		}
		else {
			tail = prev;
		}
		
	}
	public void putitOnTop(DLLNode node) {
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
		if(tail == null) {
			tail = node;
		}
		
	}
 public static void main(String args[]) {
	 LRUCache lruCache = new LRUCache(3);
	 lruCache.put(1, 3);
	 lruCache.put(4, 2);
	 System.out.println("val "+lruCache.get(1));
	 lruCache.put(5,6);
	 System.out.println("val "+lruCache.get(7));
	 System.out.println("val "+lruCache.get(5));
	 lruCache.put(7,4);
	 System.out.println("val "+lruCache.get(4));
	 System.out.println("val "+lruCache.get(1));
	 System.out.println("val "+lruCache.get(5));
 }
}
