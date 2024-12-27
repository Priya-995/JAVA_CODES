public class print_sum_uptoN {
    public static void printSum(int n,int sum,int i){
        if(i==n){
        sum+=i;
       System.out.print(sum);
       return;
        }
       sum+=i;
       printSum(n,sum,i+1);
    }
    public static void main(String[] args) {
        printSum(5,0,1);
    }
}
