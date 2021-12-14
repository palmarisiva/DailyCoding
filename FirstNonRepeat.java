package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeat {
	public static Character FirstNonRepeat(String s) {
		/*Set<Character> nonRepeatSet = new HashSet<Character>();
		List<Character> repeatList = new ArrayList<Character>();
		for(int i =0; i<s.length();i++) {
			if(!nonRepeatSet.contains(s.charAt(i))) {
				nonRepeatSet.add(s.charAt(i));
				repeatList.add(s.charAt(i));
			} else {
				repeatList.remove((Character)s.charAt(i));
			}
		}
		if(s.length()== 0)
			return Character.MIN_VALUE;
		return(repeatList.get(0));*/
		HashMap<Character, Integer> testMap = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char tmpChar = s.charAt(i);
			if(!testMap.containsKey(tmpChar)) {
				testMap.put(tmpChar,1);
			} else {
				testMap.put(tmpChar, testMap.get(tmpChar)+1);
			}
		}
		for(Map.Entry<Character, Integer> entrySet : testMap.entrySet()) {
			if(entrySet.getValue() == 1) {
				return(entrySet.getKey());
				
			}
		}
		return Character.MIN_VALUE;
		
	}
	public static void main(String args[]) {
		
		FirstNonRepeat.FirstNonRepeat("asdeadk");
	}
	
}

