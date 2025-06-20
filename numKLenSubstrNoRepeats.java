    public static int numKLenSubstrNoRepeats(String s, int k) {
      int left = 0, count = 0;
      
      Set<Character> window = new HashSet<>();
      
      for(int right = 0; right < s.length(); right ++){
         char c = s.charAt(right);
         while (window.contains(c)){
             window.remove(s.charAt(left));
             left ++;
         }
         
         window.add(c);
         if (window.size() == k){
             count ++;
             window.remove(s.charAt(left));
             left ++;
         }
      }
      return count;
    }



// Given a string s and an integer k, return the number of substrings of length k with no repeated characters.
