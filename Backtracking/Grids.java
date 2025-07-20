public class Grids {
    public static int total_ways(int i, int j, int n,int m){
        // Base case
        if(i==n-1&&j==m-1){
            return 1;
        }
        else{
            if(i==n||j==m){
                return 0;

            }
        }
        int w1=total_ways(i+1, j, n, m);
        int w2=total_ways(i, j+1, n, m); 
        return w1+w2;
// After exploring total_ways(i+1, j, n, m), control returns → backtracking

//Then it explores total_ways(i, j+1, n, m)
         

    }
    public static void main(String[] args){
        int n=3,m=4;
        System.out.println(total_ways(0,0,n,m));
    }
}
