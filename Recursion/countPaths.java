public class countPaths {
    public static int findPaths(int i, int j,int n, int m){
        if(i==n||j==m) return 0;
        if(i==n-1&&j==m-1) return 1;
         //move down
         int downPaths=findPaths(i+1,j,n,m);
         //move right
         int rightpaths=findPaths(i,j+1,n,m);
         return downPaths+rightpaths;
         
    }
    public static void main(String[] args) {
        System.out.println(findPaths(0,0,3,3));
    }
    
}
