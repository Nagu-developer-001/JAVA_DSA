import java.util.*;

public class Activity_Selection{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int n = start.length;
        int activity[][] = new int[n][3];
        for(int i=0;i<n;i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));
        int maxAct = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for(int i=1;i<n;i++){
            
            if(activity[i][1]>=lastEnd){
                maxAct++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(activity[i][0]+" "+activity[i][1]+" "+activity[i][2]+"\n");
        }
        System.out.println("Maximum activities: "+maxAct);
        System.out.println("Selected activities: "+ans);
    }
}