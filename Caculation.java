package com.sample;

public class Caculation {
	public static int findMax(int arr[]) {
		int max = 0;
		for(int i: arr) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]) {
		System.out.println("Calculation ");
	}

}
