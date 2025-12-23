public class RecursionBasics{
    public static void DecresingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        DecresingOrder(n-1);
    }
    public static void IncresingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        IncresingOrder(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int nm1 = factorial(n-1);
        return n*nm1;
    }
    public static int Nsum(int n){
        if(n==1){
            return 1;
        }
        int Nm1 = Nsum(n-1);
        return n+Nm1;
    }
    public static int Fib(int n){
        if (n==1||n==0) {
            return n;
        }
        int nm1 = Fib(n-1);
        int nm2 = Fib(n-2);
        return nm1+nm2;
    }
    public static boolean SortArr(int arr[],int i){
        if(arr.length-1 == i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return SortArr(arr, i+1);
    }
    public static int FC(int arr[],int i,int key){
        if(arr.length == i){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return FC(arr,i+1,key);
    }
    public static int OC(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int keyFound =  OC(arr,i+1,key);
        if(keyFound!=-1){
            return keyFound;
        }
        if(arr[i] == key){
            return i ;
        }
        return keyFound;
    }
    public static int findP(int x,int n){
        if(n == 0) return 1;
        int po = findP(x,n-1);
        return x * po;
    }
    public static int findOP(int x,int n){//TODO O(logn);
        if(n==0) return 1;
        int HalfPower = findOP(x, n/2);
        int fullPower = HalfPower * HalfPower;
        if(n%2!=0){
            fullPower = x * fullPower;
        }
        return fullPower;
    }
    public static String RmvDupli(String str,int idx,boolean[] map,StringBuilder newStr){
        //String finalStr = "";
        if(str.length() == idx){
            return newStr.toString();
        }
        int index= str.charAt(idx) - 'a';
        if(map[index] == true){
            return RmvDupli(str,idx+1,map,newStr);
        }else{
            map[index]=true;
            return RmvDupli(str,idx+1,map,newStr.append(str.charAt(idx)));
        }
    }
    public static void main(String x[]){
        //StringBuilder sb= ;
        String finalStr = RmvDupli("apnacollege",0,new boolean[25],new StringBuilder(""));
        System.out.println(finalStr);
        //System.out.println("!!!DECREASING ORDER!!!");
        //DecresingOrder(5);
        //System.out.println("!!!INCRESING ORDER!!!");
        //IncresingOrder(5);
        //int fact = factorial(10);
        //System.out.println(fact);
        //System.out.println("!!!SUM OF N NUMBERS!!!");
        // int sum = Nsum(5);
        // System.out.println(sum);
        // System.out.println("!!!FIBONACCI OF A NUMBERS!!!");
        // int fibs = Fib(4);
        // System.out.println(fibs);
        //System.out.println("!!!CHECK WEATHER THE GIVEN ARRAY IS SORTED OR NOT!!!");
        //int arr[] = {1,2,1,4,5};
        // boolean check =  SortArr(arr,0);
        // System.out.println(check);
        //int idx = FC(arr,0,1); 
        //System.out.println(idx);
        // int idx  =  OC(arr,0,1);
        // System.out.println(idx);
        // int val = findP(2,5);
        // System.out.println(val);
        int val = findOP(2,10);
        System.out.println(val);
    }
}