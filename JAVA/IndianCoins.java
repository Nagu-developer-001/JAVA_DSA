import java.util.ArrayList;
public class IndianCoins{
    public static void main(String []x){
        int coins[] = {1,2,5,10,20,50,100,500,500};
        ArrayList<Integer> ansAns = new ArrayList<>();
        int amt=129;
        int ans = 0;
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amt){
                while(coins[i]<=amt){
                    ansAns.add(coins[i]);
                    amt -= coins[i];
                    ans+=1;
                }
            }
        }
        System.out.println("Total = " + ans);
        System.out.println("Coins used: " + ansAns);
    }
}