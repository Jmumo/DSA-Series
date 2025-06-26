
class Anagram {
    public static void main(String[] args) {
        System.out.println(anagrams("anagram","nagaram"));
    }
    
    public static boolean anagrams(String s,String t){
        
        if (t.length() != s.length()) return false;
        
        int [] scount = new int [26];
        
        for (int i = 0; i < s.length(); i ++){
            scount[s.charAt(i) - 'a']++;
            scount[t.charAt(i) - 'a']--;
        }
        
        for (int count : scount){
            if (count != 0) return false;
        }
        return true;
       
    }
}


/*.
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 */ 
