import java.util.*;
public class check_sorted {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num[]= new int[5];
    for(int i=0;i<5;i++){
        num[i]= sc.nextInt();
    }
    boolean isAscending=true;
    for(int i=0;i<4;i++){
        if(num[i]>num[i+1]){
           isAscending = false;
        }
    }
    if(isAscending) System.out.println("array is sorted in ascending order");
    else System.out.println("not sorted");
}

    
}
