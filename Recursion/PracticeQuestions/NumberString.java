
public class NumberString {
    public static void printString(int num,String str[]){
      if(num==0){
        return;
      }
      printString(num/10, str);
      System.out.print(str[num%10]+" ");


    }
    public static void main(String[] args) {
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num=2019;
        printString(num,str);
    }
    
}
