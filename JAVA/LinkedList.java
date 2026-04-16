public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //TODO: addLast, addMiddle, removeFirst, removeLast, removeMiddle, search, reverse
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty!!");
            return -999;
        }else if(size==1){
            head=tail=null;
            return -999;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty!!");
            return -999;
        }else if(size==1){
            head=tail=null;
            return -999;
        }
        int i=0;
        Node prev = head;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        size--;
        return val;
    }
    public int removeMiddle(int idx){
        int i =0;
        Node prev = head;
        while(i<idx-1){
            prev = prev.next;
            i++; 
        }
        int val = prev.next.data;
        prev.next = tail;
        size--;
        return val;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp);
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String x[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addMiddle(1,2);
        // ll.print();
        // System.out.print("\nSize = "+size+"\n");
        // int val = ll.removeFirst();
        // ll.print();
        // System.out.print("\nSize = "+size+"\nvalue Removed is"+val+"\n");
        // val = ll.removeLast();
        ll.print();
        System.out.print("\nSize = "+size+"\n");
        int val = ll.removeMiddle(2);
        System.out.print("\nSize = "+size+"\nvalue Removed is "+val+"\n");
        ll.print();
    }
}