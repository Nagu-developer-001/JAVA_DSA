import java.util.Stack;
public class StacksProblem {
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];
        int NG;
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) NG =-1;
            else{
                NG = s.peek();
            }
            ans[i] = NG;
            s.push(arr[i]);
        } 
        return ans;
    } 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int[] arr = {7,9,10,0,3,8};
        int[] ans = nextGreaterElement(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        //System.out.println(s.peek());
        //System.out.println(s.pop());
        //System.out.println(s.peek());
    }
}