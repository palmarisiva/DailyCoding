package com.sample;

import java.util.Arrays;

public class AlternateSort {
	
	//1 2 3 4 5 6 7 8
	//8 1 7 2 6 3
	
	public void alterSort(int arr[]) {
		
		Arrays.sort(arr);
	int n = arr.length;
		int i = 0, j= n-1;
		while(i<j) {
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++] +" ");
		}
		if(n%2 !=0) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String args[]) {
		AlternateSort as = new AlternateSort();
		int arr[] = {7,4,2,3,5,8,1,6,9};
		as.alterSort(arr);
	}

}
