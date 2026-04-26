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
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head== null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.next=null;
        newNode.prev = tail;
        tail = newNode;
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
    public void removeLast(){
        if(size==0){
            System.out.println("The DLL is empty!!");
            return;
        }
        if(size==1){
            head=tail=null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public void addMid(int data,int idx){
        Node newNode = new Node(data);
        Node temp = head;
        Node prev = null;
        for(int i=0;i<idx-1;i++){
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        newNode.prev = prev;
        temp.prev = newNode;
        if(prev != null){
            prev.next = newNode;
        }
        else{
            head = newNode;
        }  
    }
    public void removeMid(int idx){
        Node temp = head;
        Node prev = null;
        for(int i=0;i<idx-1;i++){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out of bounds!!");
            return;
        }
        if(prev == null){
            head = temp.next;
        }
        if(temp.next != null){
            temp.next.prev = prev;
        }
        if(prev != null){
            prev.next = temp.next;
        }
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
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        //dll.addLast(7);
        dll.print();
        dll.removeMid(1);
        //dll.print();
        //dll.removeFirst();
        //dll.print();
        //dll.removeFirst();
        //dll.reverse();
        dll.print();
    }
}