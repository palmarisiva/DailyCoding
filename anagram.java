package com.sample;
import java.util.HashMap;
import java.util.Map;

public class anagram {
	//SILENCE LICENSE
	//Both strings length are equal or not
	//word count equal
	public static void main(String args[]) {
		//HashMap
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		String s1 = "silence";
		String s2 = "licenswewe";
		if(s1.length() != s2.length()) {
			System.out.println("Both strings are not anagram");
			return;
		}
		
		for(int i =0; i<s1.length(); i++) {
			if(!charCount.containsKey((Character)s1.charAt(i))) {
				//System.out.println("Entered ");
				charCount.put((Character)s1.charAt(i), 1);
			} else {
				charCount.put((Character)s1.charAt(i), charCount.get((Character)s1.charAt(i))+1);
			}
			if(!charCount.containsKey((Character)s2.charAt(i))){
				charCount.put((Character)s2.charAt(i), -1);
			} else {
				charCount.put((Character)s2.charAt(i), charCount.get((Character)s2.charAt(i))-1);
			}
		}
		//System.out.println("Map "+charCount);
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() != 0) {
				System.out.println("Both strings are not anagram");
				break;
			} 
		}
		System.out.println("Both Strings are anagram");
		
		
	}

}
