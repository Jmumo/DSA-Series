// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(ContainsDuplicateII(nums, k1));
    }
    
    public static boolean ContainsDuplicateII(int [] nums , int k){
        
        Set<Integer> store = new HashSet<>();
        
        for (int i = 0; i < nums.length; i ++){
            if (store.contains(nums[i])){
                return true;
            }
            store.add(nums[i]);
            
            if (i >= k){
                store.remove(nums[i - k]);
            }
        }
        
        return false;
        
    }
}

// Given:
// 	•	An array of integers nums
// 	•	An integer k

// Goal:
// Return true if there are two distinct indices i and j in the array such that:
// 	•	nums[i] == nums[j], and
	// •	abs(i - j) <= k
