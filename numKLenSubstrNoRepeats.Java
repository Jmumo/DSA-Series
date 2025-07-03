

import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "havefunonleetcode";
        int k = 5;
        System.out.println(numKLenSubstrNoRepeats(s,k));
    }
    
    public static int numKLenSubstrNoRepeats(String s, int k){
        
        int counter = 0;
        int left = 0;
        Set<Character> window = new HashSet<>();
        
        if (s.length() < k ) return counter;
        
        for (int right = 0; right < s.length(); right ++){
            while (window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left ++;
            }
            window.add(s.charAt(right));
            if (right - left + 1 == k){
                counter ++;
                window.remove(s.charAt(left));
                left ++;
            }
        }
        
        return counter;
    }
}




/**
 * Finds the number of substrings of length `k` in the given string `s` 
 * that contain no repeated characters.
 *
 * This uses a sliding window and a HashSet to maintain a window of unique characters.
 * 
 * - If a duplicate character is found in the window, the left side of the window is
 *   moved forward until the duplicate is removed.
 * - Once a window of size `k` with all unique characters is found, it's counted as valid.
 * - The window is then slid forward by removing the leftmost character to look for the next.
 *
 * @param s The input string
 * @param k The length of substrings to consider
 * @return The count of substrings of length `k` with all unique characters
 */
