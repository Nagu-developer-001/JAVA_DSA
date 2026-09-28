import java.util.*;
public class MinAbsoluteDiff{
    public static void main(String[] x){
        int A[] = {1, 2, 5, 6, 2};
        int B[] = {4, 6, 1, 3, 8};
        int n = A.length;
        int minDiff = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<n;i++){
            minDiff = Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute difference: "+minDiff);
    } 
}