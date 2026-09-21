import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Classroom {
    // static class Queue{
    //     java.util.Deque<Integer> dq = new java.util.LinkedList<>();
    //     public void add(int data){
    //         dq.addLast(data);
    //     }
    //     public int remove(){
    //         return(dq.removeFirst());
    //     }
    //     public int peek(){
    //         return(dq.getFirst());
    //     }
    // }
    // static class Stack{
    //     Deque<Integer> dq = new LinkedList<>();
    //     public void push(int data){
    //         dq.addLast(data);
    //     }
    //     public int pop(){
    //         return(dq.removeLast());
    //     }
    //     public int peek(){
    //         return(dq.getLast());
    //     }
    // }
    public static void reverse(java.util.Queue<Integer> q){
java.util.Stack<Integer> st = new java.util.Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void interleave(java.util.Queue<Integer> q){
        int size = q.size();
        java.util.Queue<Integer> fq = new java.util.LinkedList<>();
        for(int i=0;i<size/2;i++){
            fq.add(q.remove());
        }
        while(!fq.isEmpty()){
            q.add(fq.remove());
            q.add(q.remove());
        }
    }
    public static void FirstNonRepeatingCharacter(String  str){
        int[] freq = new int[26];
        java.util.Queue<Character> q =new java.util.LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;


            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
    }
    public static int FindMinCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            res+=first + second;
            pq.add(first + second);
        }
        return res;
    }
    public static void main(String[] args) {
        //String str = "aabccxb";
        //FirstNonRepeatingCharacter(str);
        //Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);
        // interleave(q);
        // System.out.println(q);
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // reverse(q);
        // System.out.print(" "+q);
        //Stack s = new Stack();
        //s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);
        // System.out.println(s.peek());
        // while(!s.dq.isEmpty()){
        //     System.out.print(s.pop() + " ");
        // }
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // System.out.println(q.peek());
        // while(!q.dq.isEmpty()){
        //     System.out.print(q.remove()+ " ");
        // }
        int cost =FindMinCost(new int[]{4, 3, 2, 6});
        System.out.println(cost);
    }
}