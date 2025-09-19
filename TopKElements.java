// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]

// Example 2:

// Input: nums = [1], k = 1

// Output: [1]

// Example 3:

// Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

// Output: [1,2]



class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<>();
       //get frequency Map frequencies
        for (int num : nums){
            store.put(num, store.getOrDefault(num,0) + 1);
        }
       //create a desceding order minheap

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =  new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        ); //desceding order
       //add the elements there in the minheap
        for (Map.Entry<Integer, Integer> entry : store.entrySet()){
            minHeap.offer(entry);

            if (minHeap.size() > k){
                minHeap.poll();
            }
        }

        //put the answers in the array

        int [] ans = new int [k];

        for (int i = k -1; i >= 0; i --){
            ans[i] = minHeap.poll().getKey();
        }

        return ans;
    }
}
