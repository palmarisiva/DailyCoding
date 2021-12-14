package com.sample;

import java.util.Arrays;

public class MinimumSwap {
	public static void main(String args[]) {
		int arr[] = {10,17,15,34,20};
		int num[]  = new int[arr.length];
		for(int i =0;i<arr.length;i++)
			num[i] = arr[i];
	    int index,tmp = 0;
		
		// num = [1,4,3,2]
		Arrays.sort(arr);
		int swapCount = 0;
		//arr = [1,2,3,4];
		for(int i =0;i<arr.length;i++) {
			System.out.println("num value "+num[i]+" arr value "+arr[i]);
			while(num[i]!=arr[i]) {
				index = Arrays.binarySearch(arr, num[i]);
				tmp = num[i];
				num[i] = num[index];
				num[index] = tmp;
				swapCount ++;
				
			}
		}
		System.out.println("Swap count "+swapCount);
		
	}

}
