import java.util.*;

public class FractionalKnapsack{
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int capacity = 50;
        int n = value.length;
        //double ratio[] = new double[n][2];
        double ratio[][] = new double[n][2]; 
        for(int i = 0; i < n; i++) { 
            ratio[i][0] = (double)i; 
            ratio[i][1] = (double)value[i] / weight[i]; 
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int currentWeight = 0;
        double totalValue = 0.0;
        for(int i=n-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity -=weight[idx];
                totalValue += value[idx];
            }else{
                totalValue = totalValue + ratio[i][1]*capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value in Knapsack = "+totalValue);
    }
}