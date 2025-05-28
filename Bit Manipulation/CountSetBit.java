
public class CountSetBit {
    public static void countSetBits(int n){ // Complexity: log n+1 => O(log n)
        int count=0;
        while(n>0){
            if((n&1)!=0)   // check LSB: least Significant Bit
              count++;
            n=n>>1;
        }
        System.out.println(count);


    }
    public static void main(String[] args) {
        int n=9;
        int ones=Integer.bitCount(n);
        System.out.println(ones);
        countSetBits(9);
    }
    
}
