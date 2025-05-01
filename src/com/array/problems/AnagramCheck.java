package com.array.problems;

import java.util.Arrays;

public class AnagramCheck {
	
	  public static boolean isAnagram() {
		
		String s = "anagram";
		String t = "naagram";
		
        if(s.length()!=t.length()){
            return false;
        }
        int map[]=new int[26];
        for(char x : s.toCharArray()){
        	
        	int temp = x-'a';
        	
            map[x-'a']++;
        }
        for(char x : t.toCharArray()){
            map[x-'a']--;
        }
        for(int i:map){
            if (i!=0){
                return false;
            }
        }
        return true;
        }
	
	public static void main(String[] args) {
		System.out.println("result="+isAnagram());
	}
	
	public static boolean solution() {
		String s = "anagram";
		String t = "naasgram";
		
		char[] a1 = s.toCharArray();
		char[] a2 = t.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
		
 		
	}

}
