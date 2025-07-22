public class ClearRangeOfBits {
    public static int clearRange(int n, int i, int j){
        int a=(1<<i)-1;
        int b=~0<<j+1;
         int bitMask=a|b;
         return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearRange(15,0,2));
    }
}
