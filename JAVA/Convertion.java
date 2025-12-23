public class Convertion{
    public static void DecimalToBinaryConvertion(int n){
        int LD = 0;
        int BinNum = 0;
        int pow = 0;
        while(n!=0){
            LD = n%2;
            BinNum = BinNum + LD*(int)Math.pow(10,pow);
            pow+=1;
            n/=2;
        }
        System.out.print(BinNum);
        System.out.println();
    }
    public static void BinaryToDecimal(int n){
        int DecNum = 0;
        int LD = 0;
        int pow = 0;
        while(n!=0){
            LD = n%10;
            DecNum = DecNum + LD*(int)Math.pow(2,pow);
            pow+=1;
            n/=10;
        }
        System.out.print(DecNum);
    }
    public static void main(String args[]){
        DecimalToBinaryConvertion(10);
        BinaryToDecimal(101);
    }
}