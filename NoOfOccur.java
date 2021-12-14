package com.sample;

public class NoOfOccur {
	public static void main(String args[]) {
		int[] arr = {1,2,3,3,4,4,4,4,4,6};
		int k = 4, start =0, mid =0, end = arr.length;
		System.out.println("Valke "+first_pos(arr, 4));
		
		System.out.println("Valke "+first_pos(arr, 5));
	}
	
	static int first_pos(int[] arr, int k) {
		int first_pos = -1;
		
		int start =0, mid =0, end = arr.length-1;
		while(start<=end) {
			mid = ((end - start)/2) + start;
			if(arr[mid] >= k) {
				first_pos = mid;
				end = mid-1;
			} else if(arr[mid] < k) {
				start = mid +1;
			} 
		}
		return first_pos;
		
	}

}
