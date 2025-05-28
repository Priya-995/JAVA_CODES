import java.util.*;
// Regardless of whether the matrix is square (like 4×4) or rectangular (like 2×3), your code still visits each element once.
// Time complexity => O(n*m) n:row m:column
//Space complexity => O(1) 
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                        {7,1,4,9},
                        {9,7,5,2},
                        {2,3,1,4}};
        int row_end=matrix.length-1;
        int row_start=0;
        int col_end=matrix[0].length-1;
        int col_start=0;
        while(row_start<=row_end&&col_start<=col_end){
            //top
            for(int i= col_start;i<=col_end;i++){
                System.out.print(matrix[row_start][i]+" ");
            }
            //right
            for(int i= row_start+1;i<=row_end;i++){
                System.out.print(matrix[i][col_end]+" ");
            }
            //bottom
            for(int i= col_end-1;i>=col_start;i--){
                if(row_end==row_start){
                    break;
                }
                System.out.print(matrix[row_end][i]+" ");
            }
            //left
            for(int i= row_end-1;i>=row_start+1;i--){
                if(col_start==col_end){
                    break;
                }
                System.out.print(matrix[i][col_start] +" ");
            }
            row_start++;
            row_end--;
            col_start++;
            col_end--;



        }
    }
    
}
