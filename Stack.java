import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Stack<String> games = new Stack<>();
        games.push("panda");
        games.push("wakanda");
        games.push("GOT");
        
        
        //checks if its empty
        System.out.println(games.isEmpty());
        
         System.out.println(games);
         
         //removes the first element in stack
         
         String first = games.pop();
         System.out.println(first);
         
         System.out.println(games);
         
         //gets the first element without removing it
         System.out.println(games.peek());
    }
}
