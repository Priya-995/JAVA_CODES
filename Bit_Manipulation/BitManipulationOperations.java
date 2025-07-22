public class BitManipulationOperations {
    public static int get_ith_bit(int n,int i){
        int bitMask=1<<i;
       if((n&bitMask)==0) return 0;
       else return 1;

    }
    public static int set_ith_bit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask; // returns decimal value
       

    }
    public static int clear_ith_bit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask; // returns decimal value
       

    }

    public static void main(String[] args) {
        System.out.println("Get bit:\n");
      System.out.println(get_ith_bit(4,2)); // i: index
      System.out.println("Set bit:\n");
      System.out.println(set_ith_bit(4,0)); // i: index
      System.out.println("Clear bit:\n");
      System.out.println(clear_ith_bit(5,2)); // i: index start from 0


        
    }
}
