public class ArrayLearn{
    public static void ArrayManipulation(int numbers[],int key){
        boolean isFound = false;
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                isFound = true;
                count+=1;
            }
        }
        if(!isFound){
            System.out.print("The Searching "+key+" Not Found!");
        }else{
            System.out.print("The Searching "+key+" Found At "+count);
        }
    }
    public static void LargestNumberInArray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            if(curr>largest){
                largest = curr;
            }
        }
        System.out.print("The Largest Number in the Array is :- "+largest+"\t\n");
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            if(curr<smallest){
                smallest = curr;
            }
        }
        System.out.print("The Smallest Number in Array is :- "+smallest);
    }
    public static int BinarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        //System.out.print(end);
        while(start<=end){
            int mid = (start+end)/2;
            //System.out.print(mid);
            if(numbers[mid]==key){
                return mid;
            }else if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
                
            }
        }
        return -1;
    }
    public static void ReversingAnArray(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
        System.out.println();
        System.out.print("The list after Reversing - ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    public static void PairsInArrays(int numbers[]){
        System.out.print("Pairs In Array");
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                //System.out.print(numbers[j]);
            }
            System.out.println();
        }
    }
    public static void SubArrayAndMaxSumBruteForce(int numbers[]){
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int sum = 0;
                int end = j;
                //System.out.print(start+" "+end);
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ("+start+","+end+")");
                    sum+=numbers[k];
                }
                System.out.print("Sum of Each sub Array "+sum);
                if(sum>maximum){
                    maximum = sum;
                }
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.print("Maximum Sum in Array:- "+maximum);
    }
    public static void PrefixedArrayForCalculateArray(int numbers[]){
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        // for(int i=0;i<prefix.length;i++){
        //     System.out.print(prefix[i]); 
        // }
        
    }
    public static void NegativeArray(int numbers[]){
        boolean isNegative = false;
        int min = Integer.MIN_VALUE;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                isNegative = true;
                break;
            }
        }
        if(isNegative==false){
            //System.out.print("The Array is Negative"+Math.min(numbers));
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>min){
                    min = numbers[i];
                }
            }
            System.out.print("The Array is Negative"+min);
        }else{
            //System.out.print("The Array is Not Negative");
            for(int i=0;i<numbers.length;i++){
                cs+=numbers[i];
                // if(cs<0){
                //     cs = 0;
                // }
                ms = Math.max(cs,ms);
            }
            System.out.print("The maximum sum of array is :- "+ms);
        }
        
    }
    public static void main(String args[]){
        int numbers[] = {4,5,6,7,0,1,2};
        //NegativeArray(numbers);
        //System.out.print(setFlag);
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]>0){
        //         System.out.print(true);
        //     }
        //     else{
        //         System.out.print(false);
        //     }
        // }
        int val = BinarySearch(numbers,1);
        if(val==-1){
            System.out.print("The key is not found");
        }else{
            System.out.print("The key founded!");
        }
        //ArrayManipulation(numbers,1);
        //LargestNumberInArray(numbers);
        // System.out.print("The list Before Reversing - ");
        // for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]);
        // }
        // ReversingAnArray(numbers);
        //PairsInArrays(numbers);
        //SubArray(numbers);
        //PrefixedArrayForCalculateArray(numbers);
    }
}