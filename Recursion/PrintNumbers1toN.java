public class  PrintNumbers1toN {
    public static void printNum(int n){
        if(n==0) return;
         printNum(n-1);
          System.out.println(n);
    }
    public static void main(String[] args) {
        printNum(20);
    }
}
