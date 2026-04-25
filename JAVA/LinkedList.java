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
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -999;
    }
    public int helper(Node head, int key) {
    if (head == null) {
        return -999; // sentinel value meaning "not found"
    }
    if (key == head.data) {
        return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -999) {
        return -999;
    }
    return idx + 1;
}
    public int recurseSearch(int key){
        return helper(head,key);
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp);
    }
    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head.next == null&&head == null){
            return false;
        }
        Node mid = findMid();
        Node precv = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = precv;
            precv = curr;
            curr = next;
        }
        Node right = precv;
        Node left =head;
        while(left!=null && right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean checkCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cyclic = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cyclic = true;
                break;
            }
        }
        if(cyclic==false)
        {
            return;
        }
        slow = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            if(slow==fast){
                break;
            }
        }
        prev.next = null;
    }
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node leftSide,Node rightSide)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(leftSide!=null && rightSide!=null){
            if(leftSide.data<=rightSide.data){
                temp.next = leftSide;
                leftSide = leftSide.next;
                temp = temp.next;
            }else{
                temp.next = rightSide;
                rightSide = rightSide.next;
                temp = temp.next;
            }
            }
            
        while(leftSide!=null){
                temp.next = leftSide;
                leftSide = leftSide.next;
                temp = temp.next;
            }
            while(rightSide!=null){
                temp.next = rightSide;
                rightSide = rightSide.next;
                temp = temp.next;
            }
        
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = findMiddle(head);
        Node rightNode = mid.next;
        mid.next = null;
        Node leftSide = mergeSort(head);
        Node rightSide = mergeSort(rightNode);
        return merge(leftSide,rightSide);
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String x[]){
        LinkedList ll = new LinkedList();
        // Node temp = new ll.Node(4);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addLast(2);
        ll.addLast(1);
        //ll.addMiddle(1,2);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        // System.out.print("\nSize = "+size+"\n");
        // int val = ll.removeFirst();
        // ll.print();
        // System.out.print("\nSize = "+size+"\nvalue Removed is"+val+"\n");
        // val = ll.removeLast();
        //int n = ll.search(1);
        //int m = ll.recurseSearch(9);
        //ll.print();
        // System.out.println("Cycle =  "+ll.checkCycle());
        // ll.print();

        // int val = ll.removeMiddle(2);
        // System.out.print("\n Size = "+size+" \n value Removed is "+val+"\n");
        // ll.print();
        // ll.reverse();
        // System.out.println();
        // ll.print();
        head = new Node(1);
        Node temp = new Node(4);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next =temp;
        //ll.print();
        System.out.println("Cycle =  "+ll.checkCycle());
        ll.removeCycle();
        ll.print();
        System.out.println("Cycle =  "+ll.checkCycle());
    }
}