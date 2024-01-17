package com.array.problems;

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

}
