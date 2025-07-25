// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.


class Solution {
    public boolean isPalindrome(String s) {
    String clean = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
    int left = 0;
    int right = clean.length() - 1;

    while(left < right){
        if (clean.charAt(left) != clean.charAt(right)){
            return false;
        }
        left ++;
        right --;
    }
    return true;
}
}
