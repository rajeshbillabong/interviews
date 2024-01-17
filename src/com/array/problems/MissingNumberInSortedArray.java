package com.array.problems;

 

class MissingNumberInSortedArray {
    
   static int   missingNumber(int array[], int n) {
        // Your Code Here
                int len = array.length;
                
                int sum = n*(n+1)/2;
                
                 
                for(int i=0;i<n-1;i++){
                    sum = sum - array[i];
 
                }
                
                return sum;

    }
    
    public static void main (String args[]){
        int[] arr = {1,2,3,4,5,7};
        System.out.println("calling function now");
        System.out.println("result=" + missingNumber(arr,7));
        System.out.println("done");

    }
}