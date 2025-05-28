public class DiagonalSum {
    // Primary Diagonal: Elements from top-left to bottom-right
    //Secondary Diagonal: Elements from top-right to bottom-left
    public static int DiagonalSum_BruteForce(int[][] matrix){ //O(n^2)
        // Brute force Approach
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //PD: Primary diagonal
                if(i==j){
                   sum+=matrix[i][j];
                }
                //SD: Secondary diagonal
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
       
    }
    public static int DiagonalSumApproach2(int[][] matrix){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){   // O(n)

            //PD
            sum+=matrix[i][i];

            //SD
            // for SD i+j==n-1  ; j=n-1-i
            if(i!=n-1-i)// for overrlap condition
              sum+=matrix[i][n-1-i];


        }
        return sum;
        
    }
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,0},
                         {7,8,9,0},
                         {8,1,3,2},
                         {6,7,9,1}};
    //   System.out.println(DiagonalSum_BruteForce(matrix));
       System.out.println(DiagonalSumApproach2(matrix));

    }
}
