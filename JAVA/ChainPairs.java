import java.util.Arrays;
import java.util.Comparator;
public class ChainPairs {
    public static void main(String[] args) {
        int pairs[][]  = {{5, 24}, {15, 25}, {27, 40}, {50, 90}};
        int n = pairs.length;
        Arrays.sort(pairs,Comparator.comparingInt(a -> a[0]));
        int cnt = 1;
        int pairEnd = pairs[0][1];
        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                cnt+=1;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("longest chain length: "+cnt);
    }
}