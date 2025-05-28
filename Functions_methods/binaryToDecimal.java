public class binaryToDecimal {
    public static void BinaryToDecimal(int binNum){
        int dec=0;
        int pow=0;
        int ld;
            while(binNum>0){
                ld=binNum%10;
                dec=dec + ld *(int)Math.pow(2,pow);
                pow++;
                binNum=binNum/10;
            }
            System.out.println("Decimal="+dec);
    }
    public static void main(String[] args) {
        BinaryToDecimal(101);
        
    }
}
