
import java.util.Scanner;


public class binaryOperator{
    public static void evenOrOdd(int n){
        //int i =1;
        if((n & 1)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    // OPERATIONS => 3
    //TODO GET Ith BIT
    public static void getIBit(int n,int i){
        int bitmask = 1<<i;
        System.out.println("BIT MASK:"+bitmask);
        if((n & bitmask)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    //TODO SET Ith BIT
    public static void setIBit(int n,int i){
        int bitmask = 1<<i;
        System.out.println((n|bitmask));
    }
    //TODO CLEAR Ith BIT
    public static int clearBit(int n,int i){
        int bitmask = ~(1<<i);
        System.out.println((n&bitmask));
        return n&bitmask;
    }
    public static void toggleBit(int n,int i){
        int bitmask = 1<<i;
        System.out.println((n ^ bitmask));
    }
    public static void updateBit(int n,int i,int setBit){
        n = clearBit(n, i);
        int bitMask = setBit<<i;
        System.out.println((n|bitMask));
    }
    public static void ClearIBit(int n,int i){
        int bitMask = ~0<<i;
        System.out.println(n&bitMask);
    }
    public static void RangeBits(int n,int i,int j){
        int a = -1<<i+1;
        int b = (1<<j+1)-1;
        int bitMask = a|b;
        System.out.println(n&bitMask);
    }
    public static void CountSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n= n>>1;
        }
        System.out.println("COUNTS = "+count);
    }
    public static void powerOfTwo(int n){
        if((n&(n-1))==0){
            System.out.println("The Given number is power of 2");
        }else{
            System.out.println("The Given number is not a power of 2");
        }
    }
    public static void FastExpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a=a*a;
            n = n>>1;
        }
        System.out.println("Ans := "+ans);
    }
    public static void UniqueNumber(int arr[]){
        System.out.println("Do Input = ");
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int unique = 0;
        for(int i = 0;i<arr.length;i++){
            unique = unique ^ arr[i];
        }
        System.out.println("Unique element in the array is ==>>"+unique);
    }
    public static void findUnique(int arr[]){
        System.out.println("Do Input = ");
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int unique = 0;
        for(int i = 0;i<arr.length;i++){
            unique = unique ^ arr[i];
        }
        System.out.println("Unique element in the array is ==>>"+unique);
    }
    public static void findDuplicates(int arr[]){
        int count = 1;
        boolean[] duplicate = new boolean[32];
        for(int i=0;i<arr.length-1;i++){
            if(duplicate[i]==true) continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate[j] = true;
                    count+=1;
                }
            }
        }
        if(count>1){
            System.out.println(count+" many duplicate elements are there...");
        }
    }
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        System.out.println("AND OPERATION: "+(num1 & num2));
        System.out.println("OR OPERATOR :"+(num1 | num2));
        System.out.println("XOR OPERATOR :"+(num1 ^ num2));
        System.out.println("COMPLEMENT OPERATOR FOR "+num1+" :"+(~num1));
        System.out.println("COMPLEMENT OPERATOR FOR "+num1+" :"+(~num2));
        System.out.println("LEFT SHIFT OPERATOR :"+(num1<<num2));
        System.out.println("RIGHT SHIFT OPERATOR :"+(num1>>num2));
        // evenOrOdd(num1);
        // getIBit(num1,0);
        // setIBit(num1,2);
        // //clearBit(num1,3);
        // toggleBit(num1,3);
        // updateBit(num1,3,0);
        // ClearIBit(num1,2);
        // RangeBits(num1,2,1);
        // CountSetBits(num1);
        // powerOfTwo(4);
        // FastExpo(3,5);
        // UniqueNumber(new int[5]);
        // findUnique(new int[5]);
        findDuplicates(new int[]{1,2,2,4,3,4,2})
    }
}