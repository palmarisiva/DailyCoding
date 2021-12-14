package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class SumArrayZero {
	
	public static boolean sumArrayZero(int arr[]) {
		// Sub array zero 
		//{1,3,-2,-1,2,4,5,0}
		// Either the element is 0, sum is 0, same value stored in the stack earlier. 
		boolean isSumArrayZero = false;
	//	int[] arr = {1,2,3,2,-3,1};
		//List<Integer> sumList  = new ArrayList<Integer>();
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		
		int sum =0;
		for(int i = 0 ;i<arr.length;i++) {
			sum += arr[i];
			System.out.println("sum "+sum+" arr[i] "+arr[i]);
			if(arr[i] ==0 || sum == 0 ) {
				System.out.println("Contains zero");
				
			} 
			if(sumMap.containsKey(sum)) {
				sumMap.put(sum, sumMap.get(sum)+1);
				
				return true;
				
			}
			else {
				sumMap.put(sum, 1);
			}
			
		}
		return false;
	}
		 
		 
		

	
	

}
