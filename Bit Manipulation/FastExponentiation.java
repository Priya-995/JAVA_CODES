public class FastExponentiation {
    public static void fastExpo(int a, int n){
        int ans=1;
       while(n>0){
          if((n&1)!=0){ //check LSB
              ans=ans*a;
          }
          a=a*a;
          n=n>>1;
          
       }
       System.out.println(ans);
    }
    public static void main(String[] args) {
        fastExpo(3,3);
    }
}
