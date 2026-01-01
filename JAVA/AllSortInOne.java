import java.util.*;
public class AllSortInOne{
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev-=1;
            }
            arr[prev+1] = curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void CountSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int CountArr[] = new int[max+1];
        for(int i=0;i<max+1;i++){
            CountArr[arr[i]]++;
        }
        int incrementor = 0;
        for(int i=0;i<arr.length;i++){
            // for(int j=0;j<CountArr[i];j++){
            //     arr[incrementor] = i;
            //     incrementor+=1;
            // }
            while(CountArr[i]>0){
                arr[incrementor] = i;
                incrementor+=1;
                CountArr[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        int cnt = 0;
        //TODO CHECK AND SORTING ARRAY 
        while(i<=mid && j<=ei){
            //TODO SORTING LEFT ARRAY
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }
            //TODO SORTING RIGHT ARRAY
            else{
                cnt =cnt + (mid - i + 1);
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //TODO SORTING REMAINING ELEMENTS OF LEFT ARRAY 
        while(i<=mid){
            temp[k++] = arr[i++]; 
        }
        //TODO SORTING REMAINING ELEMENTS OF RIGHT ARRAY
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k = 0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k]; 
        }
    }
    public static void mergeSortString(String[] arr,int si,int ei){
        if(si>ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSortString(arr,si,mid);
        mergeSortString(arr, mid+1, ei);
        mergeString(arr,si,mid,ei);
    }
    public static void mergeString(String arr[],int si,int mid,int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        String[] temp = new String[si+(ei-si)+1];
        while(si<=i && j<=ei){
            int comparison = arr[i].compareTo(arr[j]);
            if(comparison<=0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k+=1;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(int ptr1 =0 , ptr2 = si;k<arr.length;ptr1++,ptr2++){
            arr[ptr2] = temp[ptr1];
        }
    }
    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int partition = partFunction(arr,si,ei);
        QuickSort(arr,si,partition-1);
        QuickSort(arr,partition+1,ei);
    }
    public static int partFunction(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i+=1;
        int temp =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static int SearchInSortedArray(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
            }
            int mid = si + (ei - si)/2;
            if(arr[mid] == target){
                return mid
            }
            if(arr[si]<=arr[mid]){
                if(arr[si]<=target && target<=arr[mid]){
                    return SearchInSortedArray(arr, si, mid-1, target);
                }else{
                    return SearchInSortedArray(arr, mid+1, ei, target);
                }
            }else{
                if(arr[mid]<=target && target<=arr[ei]){
                    return SearchInSortedArray(arr, mid+1,ei,target);
                }else{
                    return SearchInSortedArray(arr, si, mid-1, target);
                }
            }
    }
    public static void Inversion(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count+=1;
                    System.out.print(count+"."+(arr[i]));
                    System.out.println((arr[j]));
                }
            }
        }
    }
    public static int mejorityElement(int arr[]){
        int mejority = arr[0];
        int cnt = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == mejority){
                cnt+=1;
            }else{
                cnt-=1;
                if(cnt==0){
                    mejority = arr[i];
                    cnt = 1;
                }
            }
        }
        return mejority;
    }
    public static  int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sm =0, count =0;
        for(int i=0;i<costs.length;i++){
            sm+=costs[i];
            if(sm<=coins){
                count+=1;
            }
        }
        return count;
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            System.out.print(nums[i]+" -"+i);
            result += nums[i];
        }
        return result; 
    }
    public static void Subset(String str,String newStr,int i){
        if(i == str.length()){
            if(newStr.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(newStr);
            }
            return;
        }
        Subset(str, newStr+str.charAt(i), i+1);
        Subset(str,newStr,i+1);
    }
    public static void Permutaion(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr= str.substring(0,i) + str.substring(i+1);
            Permutaion(newStr, ans+curr);
        }
    }
    public static boolean isKnightSafe(char board[][],int row,int col){
        int moves[][] = {
            {-1,-2},{1,-2},{-1,2},{1,2}
            ,{1,2},{-2,-1},{-2,1},{2,1}
        };
        for(int[] move : moves){
            int newCol =  col+move[1];
            int newRow = row+move[0];
            if(newCol>=0 && newCol<board.length && newRow>=0 && newRow<board.length && board[newRow][newCol]=='K'){
                return false;
            }
        }
        return true;
    }
    // public static boolean isSafe(char board[][],int row,int col){
        //VERTICAL UP
        // for (int i = row-1;i>=0;i--) {
        //     if(board[i][col] == 'Q'){
        //         return false;
        //     }
        // }
        // for(int i = row-1,j = col-2;i>=0 && j>=0;i--,j=j-2){
        //         if(board[i][j]== 'K'){
        //             return false;
        //         }
        // }
        // for(int i = row-2,j = col-1;i>=0 && j>=0;i=i-2,j--){
        //         if(board[i][j]== 'K'){
        //             return false;
        //         }
        //     }
        // for(int i = row-2,j = col+1;i>=0 && j<board.length;i=i-2,j++){
        //         if(board[i][j]== 'K'){
        //             return false;
        //         }
        //     }
        // for(int i = row-1,j = col+2;i>=0 && j<board.length;i--,j=j+2){
        //         if(board[i][j]== 'K'){
        //             return false;
        //         }
        //     }
        // return true;
        
        
    public static void printArr(char board[][]){
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static int cnt = 0;
    public static void nKnights(char board[][],int row){
        if(board.length==row){
            cnt+=1;
            printArr(board);
            System.out.println();
            return;
        }
        for(int j = 0;j<board.length;j++){
            if(isKnightSafe(board,row,j)){
                board[row][j] = 'K';
                nKnights(board,row+1);
                board[row][j] = '*';
            }
        }
    }
    public static boolean isSafeSudoku(int arr[][],int row,int col,int digit){
        //TODO Check the given digit is already exist in the sudoku or not in the row
        for(int i=0;i<9;i++){
            if(arr[row][i] == digit){
                return false;
            }
        }
        //TODO Check the given digit is already exist in the sudoku or not in the column
        for(int j=0;j<9;j++){
            if(arr[j][col] == digit){
                return false;
            }
        }
        //TODO Check the given digit is already exist in the sudoku or not in each grid 3X3
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i<sr+3;i++){
            for(int j = sc;j<sc+3;j++){
                if(arr[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean AddNumToSudoku(int arr[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextRow = row;int nextCol = col+1;
        if((col+1)==9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(arr[row][col] != 0){
            return AddNumToSudoku(arr, nextRow, nextCol);
        }
        for(int digit = 1;digit<=9;digit++){
            if(isSafeSudoku(arr, row, col, digit)){
                arr[row][col] = digit;
                if(AddNumToSudoku(arr, nextRow, nextCol)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }
    public static void Print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //int arr[] = {6,2,6,5,1,2};
        //BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        //CountSort(arr);
        //int iceCream = maxIceCream(arr,7);
        //System.out.print(iceCream);
        //int a = arrayPairSum(arr);
        //String[] arr = {"array","zeebra","chetu"};
        //System.out.println(Arrays.toString(arr));
        //System.out.print("hello");
        //mergeSortString(arr,0, arr.length-1);
        //mergeSort(arr, 0, arr.length-1);
        //int mejor = mejorityElement(arr);
        //System.out.print(mejor);
        //QuickSort(arr, 0, arr.length-1);
        //System.out.println(Arrays.toString(arr));
        //Subset("abc","",0);
        //Permutaion("abc","");
        // char board[][] = new char[4][4];
        // Scanner sc = new Scanner(System.in);
        // for(int i =0;i<board.length;i++){
        //     for(int j=0;j<board.length;j++){
        //         board[i][j] = '*';
        //     }
        // }
        // nKnights(board,0);
        // System.out.println("Total conuts"+cnt);
        //int target = 8;
        //int val = SearchInSortedArray(arr, 0, arr.length-1, target);
        //Inversion(arr);
        //System.out.print(max);
        int sudoku[][] = {
            {5 ,3 ,0 ,0 ,7 ,0 ,0 ,0 ,0},
            {6 ,0 ,0 ,1 ,9 ,5 ,0 ,0, 0},
            {0 ,9, 8, 0, 0, 0, 0, 6, 0},
            {8 ,0 ,0 ,0 ,6 ,0 ,0 ,0 ,3},
            {4 ,0, 0, 8, 0, 3, 0, 0, 1},
            {7 ,0 ,0 ,0 ,2 ,0 ,0 ,0 ,6},
            {0 ,6, 0, 0, 0, 0, 2, 8, 0},
            {0 ,0 ,0 ,4 ,1 ,9 ,0 ,0 ,5},
            {0 ,0, 0, 0, 8, 0, 0, 7, 9},
        };
        boolean find = AddNumToSudoku(sudoku, 0, 0);
        if(find){
            System.out.println("Solution is possible");
            Print2DArray(sudoku);}
        else{
            System.out.println("Solution is not possible"); }
    }    
}