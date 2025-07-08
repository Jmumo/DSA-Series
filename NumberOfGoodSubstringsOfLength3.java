// Given:
// A string s

// Goal:
// Return the number of substrings of length 3 that have all unique characters (no repeats).

// These are called “good substrings”.



class Main {
    public static void main(String[] args) {
        String s = "xyzzazfgh";
        System.out.println(NumberOfGoodSubstringsOfLength3(s));
    }
    public static int NumberOfGoodSubstringsOfLength3(String s){
        int count = 0;
        for(int i = 2; i < s.length(); i ++){
            if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2)
            && s.charAt(i- 2) != s.charAt(i - 1)){
                count ++;
            }
        }
        return count;
    }
}
