public class BinaryOperations{
    public static void ANDOPR(){
        System.out.println(5 & 6);
    }
    public static void OROPS(){
        System.out.println(5 | 6);
    }
    public static void XOROPS(){
        System.out.println(5 ^ 6);
    }
    public static void LEFTSHIFT(){
        System.out.println(5<<2);
    }
    public static void RIGHTSHIFT(){
        System.out.println(5>>2);
    }
    public static void COMPLIMENT(){
        System.out.println(~8);
    }
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
                System.out.println("bitMask -"+bitMask);
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        
    }}
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearTthBit(int n,int i){
        
    }
    public static void main(String args[]){
        // ANDOPR();
        // OROPS();
        // XOROPS();
        // LEFTSHIFT();
        // RIGHTSHIFT();
        //COMPLIMENT();
        System.out.print(setIthBit(10,2));
    }
}