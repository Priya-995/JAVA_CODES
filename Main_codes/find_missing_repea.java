// 2965. Find Missing and Repeated Values
public class find_missing_repea {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int[] count=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                count[num]++;
            }
        }
        int repeated=-1;
        int missing=-1;
        for(int i=1;i<=size;i++){
            if(count[i]>=2) repeated=i;
             if(count[i]==0) missing=i;
        }
        return new int[] {repeated,missing};


    }
    
}
