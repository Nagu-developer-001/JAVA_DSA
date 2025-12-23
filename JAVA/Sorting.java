import java.util.*;

public class Sorting{
    public static void threeSum(int[] nums) {
        int n = nums.length;
        //int sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> Result = new ArrayList<>();
        Set<List<Integer>> uniqueSum = new HashSet<>(); 
    for(int i=0;i<n-2;i++){
        int low = i+1;
        int high = n-1;
        while(low<high){
            System.out.println("["+nums[i]+","+nums[low]+","+nums[high]+"] and n="+n+" low="+low+" high="+high+" i="+i);
        int sum = nums[i]+nums[low]+nums[high];
        if(sum==0){
            List<Integer> triplet = Arrays.asList(nums[i],nums[low],nums[high]);
                    //System.out.print(triplet);
            Collections.sort(triplet);
                    //System.out.print(triplet);
            uniqueSum.add(triplet);
            while(low<high && nums[low]==nums[low+1]){
                low+=1;
            }
            while(low<high && nums[high]==nums[high-1]){
                high-=1;
            }
            low+=1;
            high-=1;
                }
        else if(sum<0){
            low+=1;
        }
        else if(sum>0){
            high-=1;
        }
        }
        
    }
        //i+=1;
    Result.addAll(uniqueSum);
    System.out.print(Result);
    }
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap+=1;
                
            }
            }
            
            if(swap==0){
                break;
            } 
            System.out.print("Total swap - "+swap);
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int isAsc = 0;
        int isDec = 0;
        int isArray[] = {1,2,3,4,5};
        //threeSum(isArray);
        BubbleSort(isArray);
        printArr(isArray);
        // for(int i =1;i<isArray.length;i++){
        // if(!(isArray[i]>=isArray[i-1])){
        //         isAsc+=1;
        // }
        // if(!(isArray[i]<=isArray[i-1])){
        //     isDec+=1;
        // }
        // }
        // if(isAsc==0){
        //     System.out.print("The Given array is Ascending Array");
        // }else if(isDec==0){
        //     System.out.print("The Given array is Decending Array");
        // }else{
        //     System.out.println("The Given array is Not Even ASC/DSC Array");
        //     System.out.println(isAsc);
        //     System.out.print(isDec);
        // }
    }
}