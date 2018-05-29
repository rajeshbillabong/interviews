package com.tree.problems;

import java.util.HashMap;
import java.util.Map;

public class TestSome {
 
    static int findLongestRepeatingSubSeq(String str)
    {
        int n = str.length();
  
        // Create and initialize DP table
        int[][] dp = new int[n+1][n+1];
  
        // Fill dp table (similar to LCS loops)
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                // If characters match and indexes are not same
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    dp[i][j] =  1 + dp[i-1][j-1];          
                       
                // If characters do not match
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {
        int[] arr = {0,0,-1,0,-2,0,-3,0,-4,0,0,0,-1,0,-2,0,-3,0,-4,0}; // 2, 3 repeats at position 2.

        // for every position in the array:
        for (int startPos = 0; startPos < arr.length; startPos++) {
            // check if there is a repeating sequence here:

            // check every sequence length which is lower or equal to half the
            // remaining array length: (this is important, otherwise we'll go out of bounds)
            for (int sequenceLength = 1; sequenceLength <= (arr.length - startPos) / 2; sequenceLength++) {

                // check if the sequences of length sequenceLength which start
                // at startPos and (startPos + sequenceLength (the one
                // immediately following it)) are equal:
                boolean sequencesAreEqual = true;
                for (int i = 0; i < sequenceLength; i++) {
                    if (arr[startPos + i] != arr[startPos + sequenceLength + i]) {
                        sequencesAreEqual = false;
                        break;
                    }
                }
                if (sequencesAreEqual) {
                    System.out.println("Found repeating sequence at pos " + startPos);
                }
            }
        }
    }
}
