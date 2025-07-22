public class Update_ith_bit {
    public static int clear_ith_bit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
     }
    public static int set_ith_bit(int n, int i){
       int bitMask=1<<i;
       return n|bitMask;
    }
    public static int updateBit(int n, int i,int newBit){
        // method :1
        // if(newBit==1){
        //     return set_ith_bit(n, i);
        // }
        // else{
        //     return clear_ith_bit(n, i);
        // }
        
        //Method:2
        n=clear_ith_bit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;

    }
    
    public static void main(String[] args) {
       System.out.println(updateBit(7,3,1));
    }
}
