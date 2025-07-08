// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int [] nums = {2, 1, 5, 1, 3, 2};
        int k = 3 ;
        System.out.println(maxmumSubArrayOfK(nums,k));
    }
    
    public static int maxmumSubArrayOfK(int [] nums, int k){
        int maxSum = 0;
        
        int sum = 0;
        
        for(int i = 0; i < k; i ++){
            sum += nums[i];
        }
        maxSum = Math.max(maxSum,sum);
        
        for (int i = k ; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum,sum);
        }
        
        return maxSum;
    }
}


// Given:
// 	•	An array of integers nums
// 	•	An integer k

// // Goal:
// Find the maximum sum of any contiguous subarray of size k.



