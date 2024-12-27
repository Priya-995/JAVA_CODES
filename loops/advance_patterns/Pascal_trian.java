public class Pascal_trian {
    //      1
    //     1 1
    //    1 2 1
    //   1 3 3 1
    //  1 4 6 4 1
    public static void main(String[] args) {
        int num= 1;
        for(int i=1;i<=6;i++){
            for(int k=1;k<=6-i;k++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num= (num*(i-j))/(j);
            }
            System.out.println();
            num=1;
        }
    }
}
