package com.sample;

public class MaxSumFixeSizeSubArray {
	
	public static int MaxSumFixedSizeSubArray(int[] arr, int k) {
		int sum =0, maxSum = 0, i =0, start = 0;
		int len = arr.length;
		for(i=0;i<k;i++) {
			sum += arr[i];
		}
		maxSum = sum;
		for(int j = k; j< len;j++) {
			sum = sum+ arr[j] - arr[start++];
			if(sum > maxSum) {
				maxSum =sum;
			}
		}
		return maxSum;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,4,5,3,4,7};
		int k = 2;
		System.out.println("Ans "+MaxSumFixedSizeSubArray(arr, k));
	}

}
