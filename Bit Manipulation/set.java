public class set {
    public static void main(String[] args) {
        //set the second bit(pos=1) of a number n.(n=0101)  // 7 -> 0111
        int n=5; //0101
        int pos=1;
        int bitmask=1<<pos;
        int newNum= bitmask|n;
        System.out.println(newNum);
    }
}
