import java.util.*;
public class spiral_order_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int num[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;
        while(row_start<=row_end&&col_start<=col_end){
            
            for(int i=col_start;i<=col_end;i++){
                System.out.print(num[row_start][i]+" ");
            }
            // System.out.println();
            row_start++;
            if(row_start> row_end) break;
            for(int i=row_start;i<=row_end;i++){
                System.out.print(num[i][col_end]+" ");
            }
            // System.out.println();
            col_end--;
            if(col_end<col_start) break;
            for(int i=col_end;i>=col_start;i--){
                System.out.print(num[row_end][i]+" ");
            }
            // System.out.println();
            row_end--;
            if(row_end<row_start) break;
            for(int i=row_end;i>=row_start;i--){
                System.out.print(num[i][col_start]+" ");
            }
            // System.out.println();
            col_start++;
        }

    }
    
}
