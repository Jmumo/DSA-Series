
class Main {
    public static void main(String[] args) {
        
        int [] nums = {1,2,3,4,4,5,6,7};
        System.out.println(singleNumber(nums));
    }
    
    public static int singleNumber(int [] nums){
        int singleNum = 0;
        
        for (int num : nums){
           singleNum = singleNum ^ num; 
        }
        
        return singleNum;

        
    }
}




/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]


*/
