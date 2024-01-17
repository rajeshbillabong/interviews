package com.array.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsecutiveReplaceIncrement {

	//https://www.geeksforgeeks.org/replace-two-consecutive-equal-values-one-greater/

	/*Input : 5, 2, 1, 1, 2, 2
	Output : 5 4
	Explanation:
	step 1: While traversing, encountered pair of 1(gets replaced by 2. We get 5, 2, 2, 2, 2
	step 2: The first encountered pair of 2 gets replaced by 3. We get 5, 3, 2, 2
	step 3: Again pair of 2 gets replaced by 3. We get 5, 3, 3
	step 4: Recently formed pair of 3 gets replaced by 4. We get 5, 4
	This is our required answer.
	 */

	public static void main(String[] args) {

		Integer[] inputArr = {5,2,1,1,2,2};

		java.util.List<Integer> inputList = Arrays.asList(inputArr);

		boolean containsRepeat  = true;

		while(containsRepeat) {
			containsRepeat = false;
			for(int i=0;i<inputList.size()-1;i++) {
				System.out.println("i="+i);

				if(inputList.get(i) == inputList.get(i+1)) {
					containsRepeat = true;
					inputList.set(i, inputList.get(i)+1);

					System.out.println("After adding :"+inputList); 
					if(i+1<inputList.size()) {
						moveElements(inputList,i+1);
					}
				}
			}
		}

	}

	private  static void moveElements(java.util.List<Integer> input, int i) {

		System.out.println("Before move:"+input); 
		for(int k=i;k+1<input.size();k++) {
			input.set(k, input.get(k+1));
			System.out.println("In the move:"+input); 
		}
		input.remove(input.size()-1);
		System.out.println("After move:"+input); 
		
	}

}
