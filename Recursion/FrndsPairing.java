public class FrndsPairing {
    public static int total_ways(int n){
        if(n==1||n==2) return n;
        // choice
        // single
        // int fnm1=total_ways(n-1);
        // pair
        // int fnm2=total_ways(n-2);
        // int pairing_ways=(n-1)*fnm2;
        // return fnm1+pairing_ways;
        return total_ways(n-1)+(n-1)*total_ways(n-2);
         
    }
    public static void main(String[] args) {
        System.out.println(total_ways(3));
        
    }
}
