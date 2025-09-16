
// Given a sentence, return the three most common strings in it.
// For example: input: "hi there care to discuss algorithm basis or how to solve algorithm or" -> will return - ["algorithm", "or","to "] Note: please return the strings in an ascending alphabetic order


import java.util.*;
class Main {
    public static void main(String[] args) {
      String Sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";
      
      String [] words = Sentence.split(" ");
      
      HashMap<String,Integer> map = new HashMap<>();
      
      for (String word: words){
          map.put(word, map.getOrDefault(word, 0) + 1);
          System.out.println(word);
      }
      
      List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
      entries.sort((a,b) -> b.getValue().compareTo(a.getValue()));
      
      for (int i = 0; i < Math.min(3, entries.size()); i ++){
          System.out.println(entries.get(i).getKey()); 
      }
    }
}
