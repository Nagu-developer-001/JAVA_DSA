public class SpiralMatrix{
    public static void SpiralMatrix(int matrix[][]){    
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        System.out.println(startRow+" "+startCol+" "+endRow+" "+endCol);
        while(startRow<=endRow && startCol<=endRow){
            //top
            for(int j=startCol;j<endCol;j++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int i=startRow;i<=endRow;i++){
                if(startCol==endCol){
                    break;
                }
                //System.out.println(startRow+"  "+endRow+" ");
                if(endCol>=0){
                    System.out.print(matrix[i][endCol]+" ");
                }else{
                    break;
                }
                
            }
            //Bottom print bottom rows
            for(int j=endCol-1;j>=startRow;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left Printing left columns
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow+=1;
            startCol+=1;
            endRow-=1;
            endCol-=1;
        }
    }
    public static void DiagonalSum(int matrix[][]){
        int sm =0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             System.out.println("i ="+i+", j="+j+", [i,j]="+matrix[i][j]);
        //             sm+=matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             System.out.println("i ="+i+", j="+j+", [i,j]="+matrix[i][j]);
        //             sm+=matrix[i][j];
        //         }
        //     }
        // }
        // System.out.print(sm);
        int i=0;
        int j=0;
        while(i<=matrix.length-1 && j<=matrix[0].length-1){
        sm+=matrix[i][i];
        if(i!=matrix.length-1-i){
        sm+=matrix[i][matrix.length-1-i];
        }
        System.out.println("i ="+i+", j="+j+", [i,j]="+(matrix.length-1-i));
        i+=1;
        j+=1;
        
        }
        System.out.print(sm);
    }
    public static void SortedArraySearch_On2(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at index: "+i+","+j);
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }
    public static int BinaryMainSearch(int matrix[],int key){
        int low = 0;
        int high = matrix.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]==key){
                return mid;
            }else if(matrix[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -999; 
    }
    public static void SortedMatrixIntoSingleRows(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            //if(BinaryMainSearch(matrix[i],key))
            int j = BinaryMainSearch(matrix[i],key);
            if(j!=-999){
                System.out.println("Key found at index: "+i+","+j);
                return;
            // }else{
            //     System.out.println("Key not found at this row = "+i);
            //     continue;
            // }
        }
    }}
    public static void trap(int[] height) {
        int leftMaxArray[] = new int[height.length-1];
        int RightMaxArray[] = new int[height.length-1];
        //int rightMax = height[height.length-1];
        //int leftMax = height[0];
        leftMaxArray[0] = height[0];
        RightMaxArray[height.length-1] = height[height.length-1];
        for(int i = 0;i<height.length-2;i++){
            if(leftMaxArray[i]<height[i+1]){
                //leftMax = height[i];
                 leftMaxArray[i] = height[i+1];
            }// }else{
                
            // }
        }
        // for(int i = height.length-1;i>=0;i--){
        //     if(rightMax<height[i]){
        //          //RightMaxArray[i] = rightMax;
        //             rightMax = height[i];
        //             RightMaxArray[i] = rightMax;
        //     }//else{
                
        //     // }
        // }
        for(int i = 0;i<height.length-1;i++){
           // System.out.println(leftMaxArray[i]+" ");
            System.out.print(RightMaxArray[i]+" ");
        }
        for(int i = 0;i<height.length-1;i++){
            System.out.print(leftMaxArray[i]+" ");
         //   System.out.println(RightMaxArray[i]+" ");
        }
    }
    public static int countNegatives(int[][] grid) {
        int row = grid.length-1,col = 0,cnt = 0;
        while(row>=0 && col<=grid[0].length-1){
            if(grid[row][col] < 0){
                row -= 1;
                cnt +=  grid[0].length-col;
            }else{
                col+=1;
            }
        }
        return cnt;
    }
    public static void rotate(int[] nums, int k) {
        while(k>0){
            int temp = nums[nums.length-1];
        for(int i = nums.length-1;i>=1;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
        k--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};
        //[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]
        //SpiralMatrix(matrix);
        //DiagonalSum(matrix);
        //SortedArraySearch_On2(matrix,5);
        //SortedMatrixIntoSingleRows(matrix,8);
        //trap(matrix);
        // int tat = countNegatives(matrix);
        // System.out.println(tat);
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}