package com.sample;

import java.util.Arrays;

public class anagram1 {
	public static void main(String args[]) {
		
		String s1 = "SILENCMSE";
		String s2 = "LICENSE";
		
		if(s1.length() != s2.length()) {
			System.out.println("Both Strings are not anagram");
			return;
		}
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);
		if(Arrays.equals(s1Arr, s2Arr)) {
			System.out.println("Both strings are anagram");
		} else {
			System.out.println("Both Strings are not anagram");
		}
		
	}

}
