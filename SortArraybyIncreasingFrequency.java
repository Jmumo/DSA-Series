// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

 

// Example 1:

// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
// Example 2:

// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
// Example 3:

// Input: nums = [-1,1,-6,4,5,-6,1,4,1]
// Output: [5,-1,4,4,-6,-6,1,1,1]




class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums){
           freq.put(num, freq.getOrDefault(num, 0) + 1); 
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a,b) -> {
                if (!a.getValue().equals(b.getValue()))
                {
                    return a.getValue() - b.getValue();
                }else{
                    return b.getKey() - a.getKey();
                }
                
            }
        );

        minHeap.addAll(freq.entrySet());
     
        int [] ans = new int [nums.length];
        int i = 0;
         while (!minHeap.isEmpty()){
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            int number = entry.getKey();
            int count = entry.getValue();

            while (count > 0){
               ans[i] = number;
               count --;
               i ++; 
            }
         }
         return ans;
    }
}
