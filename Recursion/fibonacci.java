
public class fibonacci {
    public static void printFib(int n1,int n2,int n){
        if(n==0) return;
        int n3=n1+n2;
        System.out.print(n3+" ");
       printFib(n2,n3,n-1);
    }
    public static void main(String[] args) {
        
        int n = 7;
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        printFib(n1,n2,n-2);
    }
}
