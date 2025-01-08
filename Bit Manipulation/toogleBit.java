//Toggle  => X-OR operation

public class toogleBit {
    public static void main(String[] args) {
        int n=7; //0111
       int pos=3;
        int BitMask=1<<pos;
        System.out.println(n^BitMask);

    }
    
}
