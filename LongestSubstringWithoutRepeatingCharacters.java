// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubstringWithoutRepeatingCharacters(s));
    }
    public static int LongestSubstringWithoutRepeatingCharacters(String s){
        int count = 0;
        int left = 0;
        Set<Character> window = new HashSet<>();
        
        for(int i = 0; i < s.length(); i ++){
            if (window.contains(s.charAt(i))){
                window.remove(s.charAt(left));
                left ++;
            }
            window.add(s.charAt(i));
            count = Math.max(window.size(),count);
        }
    
        return count;
    }
}

// Given:
// A string s

// Goal:
// Return the length of the longest substring without repeating characters.
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The longest substring is "abc"
