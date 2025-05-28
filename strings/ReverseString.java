

public class ReverseString {
    public static void reverse_UsingcharArray(char ch[]){
      int fp=0;
      int lp=ch.length-1;
      while(fp<lp){
        //swap
        char temp=ch[fp];
        ch[fp]=ch[lp];
        ch[lp]=temp;
        fp++;
        lp--;
      }
      String reversed= new String(ch);
      System.out.println(reversed);
      

    }
    public static void reverseString_StringBuilder(String str){
        StringBuilder sb= new StringBuilder(str);
        
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        String str="priy";
        // using string builder
        // reverseString_StringBuilder(str);
        // using character array
        char ch[]= str.toCharArray();
        reverse_UsingcharArray(ch);
    }
}
