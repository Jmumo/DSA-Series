
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int k = 3;
         System.out.println(Arrays.toString(MinimumSizeSubarraySumGreaterOrEqualsTarget(nums,k)));
    }
    
    public static int [] MinimumSizeSubarraySumGreaterOrEqualsTarget(int [] nums , int k){
        
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int sumCount = 0;
        
        for(int i = 0; i < nums.length; i ++){
            sumCount += nums[i];
            
            if (i >= k -1){
                if (sumCount > maxSum){
                    maxSum = sumCount;
                    startIndex = i - k + 1;
                }
            }
        }
          int [] maxSubArray = Arrays.copyOfRange(nums,startIndex, startIndex + k);
            return maxSubArray;
     
    }

}

// this function returns maxmum SubArray of an array but the actual sub array not the sum 
