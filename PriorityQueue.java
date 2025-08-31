import java.util.*;
class Main {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(1.5);
         queue.offer(1.1);
          queue.offer(1.3);
           queue.offer(1.3);
            queue.offer(1.6);
             queue.offer(1.5);
             
             while(!queue.isEmpty()){
                System.out.println(queue.poll()); 
             }
             
    }
}
