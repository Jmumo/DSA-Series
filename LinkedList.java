// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinkedList<T>{
    int size;
    Node<T> head;
    
    public LinkedList(){
        this.size = 0;
        this.head = null;
    }
    
    public Boolean isEmpty(){return size == 0;}
    
    public int size(){return size;}
    
    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("List is Empty");
    }
    
    
    public void addfirst(T data){
        Node<T> newNode = new Node(data);
         newNode.next = head;
         head = newNode;
         size++;
    }
    
    public T removeFirst(){
        if (head == null){
           // throw new NoSuchElementException("element not found");
        }else{
            T removeData = head.data;
            head.next = head;
            size --;
            return removeData;
        }
        return head.data;
    }
    
    static class Node<T>{
        T data;
        Node<T> next;
        
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
}


class Main {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.addfirst("mumo");
    
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.printList();
        System.out.println(list.removeFirst());
    }
}
