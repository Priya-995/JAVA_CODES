public class inv_half_pyr {
    // 1 1 1 1
    //  2 2 2
    //   3 3
    //    4
    public static void main(String[] args) {
        int n= 1;
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
            System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
}
