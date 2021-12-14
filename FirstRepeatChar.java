package com.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepeatChar {
	public void FirstRepeatChar(String s) {
		Set<Character> charSet = new HashSet<Character>();
		for(int i=0; i<s.length();i++) {
			if(!charSet.contains(s.charAt(i))){
				charSet.add(s.charAt(i));
			}
			else {
				System.out.println("Character "+s.charAt(i));
				break;
			}
		}
		
		
		
		
	}
	public static void main(String args[]) {
		FirstRepeatChar repChar = new FirstRepeatChar();
		repChar.FirstRepeatChar("adedade");
	}

}
