public class TillingProblem {
    public static int calculateNoOfWays(int n){   //floor : 2*n;
       if(n==0||n==1) return 1;
       //kaam
       //verically choice
       int fnm1=calculateNoOfWays(n-1);
       //horizontally choice
       int fnm2=calculateNoOfWays(n-2);
       int total_ways=fnm1+fnm2;
       return total_ways;

    }
    public static void main(String args[]){
        System.out.println(calculateNoOfWays(4));
    }
}
