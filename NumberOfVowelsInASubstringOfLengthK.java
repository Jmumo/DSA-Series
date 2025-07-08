import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(NumberOfVowelsInASubstringOfLengthK(s,k));
    }
    
    public static int NumberOfVowelsInASubstringOfLengthK( String s, int k){
        
        Set<Character> vowels = Set.of('a','e','i','o','u');
        
        int count = 0;
        int maxCount = 0;
  
        for (int i = 0; i < k; i ++){
          if (vowels.contains(s.charAt(i))) count++;
        }
        maxCount = count;
        
        for (int i = k; i < s.length(); i ++){
            if (vowels.contains(s.charAt(i))) count ++;
            if (vowels.contains(s.charAt(i - k))) count --;
            
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
        
    }
}


// Given:
// 	•	A string s
// 	•	An integer k

// Goal:
// Find the maximum number of vowels in any substring of length k.
