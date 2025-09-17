// You are given an array of n integer numbers a[0], a[1], ..., a[n - 1]. Find the distance between the two closest (nearest) minimums in it. It is guaranteed that in the array a minimum occurs at least two times.
// Example: Given the following array [1,2,3,1,4,5,2] The function should return 3 Explanation: 1 is the smallest (minimum) number which appears twice. a[0] = 1 a[3] = 1 The distance is 3-0 = 3


import java.util.*;
class Main {
    public static void main(String[] args) {
  int [] nums = {1,2,3,1,4,5,2};
  
  int small = nums[0];
  int smallIndex = 0;
  int distance = 0;
  
  for (int i = 0; i < nums.length; i++){
      if (nums[i] < small){
          small = nums[i];
          smallIndex = i;
      }else if (nums[i] == small) {
          distance = i - smallIndex;
          
      }
  }
  System.out.println(distance);
    }
}
