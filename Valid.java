package com.sample;

import java.util.Stack;

public class Valid {
	public static boolean validString(String s1) {
	//	String s1 = "{ed([d]e)de}";
		boolean isValid = false;
		Stack<Character> stk = new Stack<Character>();
		char[] chArray =s1.toCharArray();
		char tmpChar ;
		for(int i = 0; i< chArray.length; i++) {
			if(chArray[i] == '{' || chArray[i] == '[' || chArray[i] == '(') {
				stk.push(chArray[i]);
			}
			if(chArray[i] == '}' || chArray[i] == ']' || chArray[i] == ')') {
				tmpChar = stk.pop();
				isValid = false;
				switch(chArray[i]) {
				
				case ')':
					if(tmpChar == '(') {
						isValid = true;
						break;
					}
				case '}':
					if(tmpChar == '{') {
						isValid = true;
						break;
					}
				case ']':
					if(tmpChar == '[') {
						isValid = true;
						break;
					}
				     
				}
				if(!isValid) {
					return isValid;
				}
			}
		}
		if(!stk.isEmpty()) {
			isValid = false;
		}
		return isValid;
	} 
	public static void main(String args[]) {
		String s1 = "aa[dd[[{dd(dd)ee}ee]";
		System.out.println("validString "+validString(s1));
	}
	
	

}
