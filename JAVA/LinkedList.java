public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String x[]){
        LinkedList ll = new LinkedList();
        ll.head = new Node(5);
        ll.head.next = new Node(4);
    }
}