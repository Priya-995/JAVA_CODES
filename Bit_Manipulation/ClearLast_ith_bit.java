
import java.io.Console;

public class ClearLast_ith_bit {
    public static int clearLastBit(int n,int i){
        int bitMask=~0<<i;
        return n&bitMask;

      
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15,3));
    }
}
