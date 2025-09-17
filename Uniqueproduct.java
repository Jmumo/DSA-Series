// Unique product Write a method that, efficiently with respect to time and space used,
// finds the first product in an array that occurs only once in that array. 
// If there are no unique products in the array, null should be returned. For example, 
// firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag" }) should return "Computer".



import java.util.*;
class Main {
    public static void main(String[] args) {
   String [] products = {"apple","apple","Computer","Computer", "car","car", "bike"};
   
   HashMap<String, Integer> store = new HashMap<>();
   for (String product : products){
       store.put(product, store.getOrDefault(product, 0) + 1);
   }
    
    for(String product : products){
        if (store.get(product) == 1){
             System.out.println(product);
        }
    }
   
    }
}


