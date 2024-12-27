import java.util.*;
public class convert_bTod_dTob {
   public static String decimalToBinary(int decimal){
     return Integer.toBinaryString(decimal);
   }
   public static int binaryToDecimal(String binStr){
    return Integer.parseInt(binStr,2);
  }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int decimal=12;
       String binary=decimalToBinary(decimal);
       System.out.println("Decimal "+decimal+" Binary"+binary);
       String binStr="1011";
       int decimalVal=binaryToDecimal(binStr);
       System.out.println("binary "+binStr+" decimal "+decimalVal);



    }
}
