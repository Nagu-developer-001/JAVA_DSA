public class Dll{
    public static  class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("DLL is empty!!");
            return;
        }
        // if(size==1){
        //     tail=head=null;
        //     return;
        // }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void print(){
        Node temp = head;
        System.out.print("null");
        while(temp!=null){
            System.out.print("<-->");
            System.out.print(temp.data);
            //System.out.print("->");
            temp = temp.next;
        }
        System.out.print("->");
        System.out.println("null");
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String x[]){
        Dll dll = new Dll();
        dll.addFirst(1);
        dll.addFirst(10);
        dll.addFirst(3);
        dll.addFirst(2);
        //dll.print();
        //dll.removeFirst();
        //dll.print();
        //dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();
    }
}