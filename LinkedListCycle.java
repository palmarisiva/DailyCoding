package com.sample;

import java.util.HashSet;
import java.util.Set;

 

public class LinkedListCycle {
	// 1->2->3->4->null
	//1->2->3->4->2
	static public boolean cycleLinkedList(Node head) {
		Set<Node> nodeSeen = new HashSet<Node>();
		while(head !=null) {
			if(nodeSeen.contains(head)) {
				return true;
			}
			nodeSeen.add(head);
		    head = head.next;
		}
		
		return false;
		
	}

}
