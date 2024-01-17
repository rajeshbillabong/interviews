package com.array.problems;

  

class SubArrayWithGivenSum {
    
   static String   subArray(int array[], int reqSum) {
 
	   int elemSum = 0;
	   int startPos = 0;
	   StringBuffer resultStb = new StringBuffer();
	   
	   for(int i = 0;i<array.length;i++) {
		
		elemSum = elemSum + array[i];
		
		if(elemSum == reqSum) {
	        System.out.println("comes in 1");

			resultStb.append("start="+startPos+", end="+i); 
			break;
		} else if( elemSum > reqSum) {
	        elemSum = elemSum-array[startPos];
	        startPos++;
			
	        if(elemSum == reqSum ) {
				System.out.println("comes in break break");
				resultStb.append("start="+startPos+", end="+i); 

				break;
			}
	        
		}else  {
		}
		
	   }
                
                return resultStb.toString(); 

    }
    
    public static void main (String args[]){
        int[] arr = {2,4,6,7,2,3};
        int sum = 5;
        
        System.out.println("starting ...");
        System.out.println("result=" + subArray(arr,sum));
        System.out.println("done!");

    }
}