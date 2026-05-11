import java.util.Stack;
public class Stacks{
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class createStack{
    //     public static Node head;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }
    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(!isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int data = head.data;
    //         head = head.next;
    //         return data;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int data = head.data;
    //         return data;
    //     }

    // }
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
    public static int[] stockSpan(int stocks[]){
        int span[] = new int[stocks.length];
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        // Stack obj = new Stack();
        // createStack.push(10);
        // int popedVal = createStack.pop();
        // System.out.println(popedVal);
        // popedVal = createStack.pop();
        // System.out.println(popedVal);
        // createStack.push(10);
        // createStack.push(30);
        // System.out.println(createStack.peek());
        int stocks[] = {100,80,60,70,60,85,100,120};
        int span[] = stockSpan(stocks);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
}