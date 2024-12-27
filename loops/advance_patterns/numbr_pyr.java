public class numbr_pyr {
    //       1     // 4spaces
    //     2 _ 2   // 3spaces
    //   3 _ 3 _ 3  // 2spaces
    //  4 _ 4 _ 4 _ 4   // 1 spaces
    // 5 _ 5 _ 5 _ 5 _ 5   // 0 spaces
    // *****************************************************************
    //     1    //1 row (1 times)
    //    2  2
    //   3  3  3
    //  4  4  4  4
    // 5  5  5  5  5
  public static void main(String[] args) {
      for(int i=1;i<=5;i++){
          for(int j=1;j<=5-i;j++){
              System.out.print(" ");
            }
          for(int k=1;k<=i;k++){
            System.out.print(i+" ");
          }
          System.out.println();
        }
      
    }
    
}
