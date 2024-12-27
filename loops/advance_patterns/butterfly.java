public class butterfly{
    // *             *    // 6 spaces   // 2*(n-i) //n=4
    // * *         * *    // 4 spaces
    // * * *     * * *    // 2 spaces
    // * * * * * * * *    // 0 spaces
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}