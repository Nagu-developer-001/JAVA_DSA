import java.util.ArrayList;
public class IndianCoins{
    public static void main(String []x){
        int coins[] = {1,2,5,10,20,50,100,500};
        int coins2[] = {10,20,50,100,500};
        ArrayList<Integer> ansAns = new ArrayList<>();
        int amt=120;
        int ans = 0;
        for(int i=coins2.length-1;i>=0;i--){
            if(coins2[i]<=amt){
                while(coins2[i]<=amt){
                    ansAns.add(coins2[i]);
                    amt -= coins2[i];
                    ans+=1;
                }
            }
        }
        System.out.println("Total = " + ans);
        System.out.println("Coins used: " + ansAns);
    }
}