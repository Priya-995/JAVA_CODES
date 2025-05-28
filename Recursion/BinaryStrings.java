public class BinaryStrings {
    public static void print_binString(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        print_binString(n-1, 0, str+"0");
         // Add "1" only if lastPlace was 0
        if(lastPlace==0){
            print_binString(n-1, 0, str+"1");
        }
       

    }
    public static void main(String[] args) {
        int n=3;  // Change this to generate strings of different lengths
        print_binString(n,1,"");
    }

}
