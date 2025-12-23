public class Recursion{
    public static void DecreasingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        DecreasingOrder(n-1);
    }
    public static void IncresingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        IncresingOrder(n-1);
        System.out.println(n+" ");
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int nm1 = factorial(n-1);
        return n*nm1;
    }
    public static int  SumOfN(int n){
        if(n==1){
            return n;
        }
        int nm1 = SumOfN(n-1);
        return n+nm1;
    }
    public static int fib(int n){
        if(n==1||n==0){
            return n;
        }
        int nm1 = fib(n-1);
        int nm2 = fib(n-2);
        return nm1+nm2;
    }
    public static int LastOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOccurance(arr,key,i+1);
        if(isFound!=-1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        //System.out.println(isFound);
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        // DecreasingOrder(5);
        // IncresingOrder(5);
        // int fact = factorial(5);
        // System.out.println(fact);
        // int sum = SumOfN(5);
        // System.out.println(sum);
        // int fibonacci = fib(6);
        // System.out.println(fibonacci);
        int LO = LastOccurance(arr,5,0);
        System.err.println(LO);
    }
}