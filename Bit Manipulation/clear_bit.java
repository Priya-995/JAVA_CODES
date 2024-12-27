
// clear the 3rd bit(pos=2) of a number n(n=0101)
public class clear_bit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int Bitmask=1<<pos;
        int notBitmask= ~(Bitmask);
        int newNum= notBitmask&n;
        System.out.println(newNum);
    }
}
