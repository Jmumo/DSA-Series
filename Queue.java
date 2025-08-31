// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();
        
        //offer is adding
        queue.offer("mumo");
        queue.offer("wayua");
        queue.offer("morgan");
        System.out.println(queue);
        
        //poll removes first element from the queue
        System.out.println(queue.poll());
        
        //peek gets the first element withoutb removing it
        System.out.println(queue.peek());
    }
}
