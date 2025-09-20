// So what this code is doing is sorting the array into index = value order using cyclic sort, by repeatedly swapping elements into their correct place.


import java.util.*;
class Main {
    public static void main(String[] args) {
       int [] nums = {4 ,3 ,2 ,1,0};
       
       int current = 0;
       
       while (current < nums.length){
          if(nums[current] != current && nums[current] < nums.length){
           int temp = nums[current];
           nums[current] = nums[temp];
           nums[temp] = temp;
          }else{
              current ++;
          }
       }
       System.out.println(Arrays.toString(nums));
    }
}
