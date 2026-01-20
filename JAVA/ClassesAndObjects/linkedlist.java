public class linkedlist{
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.err.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        list.addFirst(10);
        list.printLL();
        list.addFirst(20);
        list.printLL();
        //System.out.println("Head: "+head.data);
        int nums[] = {1,2,3,4,5};
        //for(int i=0;i<=i;i++){
            //System.out.println(nums[i]);
        //}
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                System.out.println("\t"+nums[j]);
            }
        }
    }
}