import java.util.*;
public class max_min_num{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num[]= new int[5];
        for(int i=0;i<5;i++){
            num[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(num[i]<min){
                min=num[i];
            }
             if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Max number:"+ max);
        System.out.println("Min number"+min);



    }
}
