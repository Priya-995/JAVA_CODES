import java.util.*;
public class update_bit {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       int oper=sc.nextInt();
       int pos=1;
       int n=7;//0111
       int bitMask=1<<pos;
       if(oper==1){
         int newNum=bitMask|n;
         System.out.println(newNum);
       }
       else{
         int  newBitmask=~(bitMask);
         int newNum=newBitmask&n;
         System.out.println(newNum);
       }
    }
}
