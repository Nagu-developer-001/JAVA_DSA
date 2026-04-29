public class Stack{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class createStack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(!isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            return data;
        }

    }
    //     static ArrayList<Integer> arr = new ArrayList<>();
    //     public static boolean isEmpty()
    //     {
    //         return arr.size() == 0;
    //     }
    //     public static void push(int data)
    //     {
    //         arr.add(data);
    //     }
    //     public static int pop()
    //     {
    //         if(!isEmpty()){
    //             int top = arr.get(arr.size()-1);
    //         arr.remove(arr.size()-1);
    //         return top;
    //         }
    //         return -1;
    //     }
    //     public static int peek()
    //     {
    //         if(!isEmpty()){
    //             int top = arr.get(arr.size()-1);
    //         return top;
    //         }
    //         return -1;
    //     } 
    // }
    public static void main(String[] args) {
        Stack obj = new Stack();
        createStack.push(10);
        int popedVal = createStack.pop();
        System.out.println(popedVal);
        popedVal = createStack.pop();
        System.out.println(popedVal);
        createStack.push(10);
        createStack.push(30);
        System.out.println(createStack.peek());
    }
}