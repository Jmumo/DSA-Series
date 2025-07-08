// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0


class Main {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target = 7;
         System.out.println(MinimumSizeSubarraySumGreaterOrEqualsTarget(nums,target));
    }
    
    public static int MinimumSizeSubarraySumGreaterOrEqualsTarget(int [] nums , int target){
     

        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int lower = 0;

        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
            while (sum >= target){
                minLength = Math.min(minLength,i - lower + 1);
                sum -= nums[lower];
                lower ++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength; 
    }

}
