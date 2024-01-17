package com.array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.transform.ErrorListener;

public class StringSegmentationDictionary {
	static boolean wordBreak(List<String> wordList,
			String word)
	{
		// If the word is empty, it can be broken down into
		// an empty list of words
		if (word.isEmpty()) {
			return true;
		}

		int wordLen = word.length();

		// Check if the word can be broken down into
		// words from the wordList
		for (int i = 1; i <= wordLen; i++) {
			String prefix = word.substring(0, i);

			if (wordList.contains(prefix)
					&& wordBreak(wordList, word.substring(i))) {
				return true;
			}
		}

		return false;
	}	

	public static void main(String[] args)
	{
		List<String> wordList = Arrays.asList(
				"mobile", "samsung0", "sam", "sung0", "man",
				"mango", "icecream", "and", "go", "i", "like",
				"ice", "cream");

		boolean result
		= wordBreak(wordList, "ilikesamsung");

		System.out.println(result); // Output: true
	}

}
