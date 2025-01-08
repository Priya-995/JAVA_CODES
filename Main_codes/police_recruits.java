import java.util.*;
public class police_recruits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a[]=new int[n] ;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int available_officer=0;
        int untreated=0;
        for(int i=0;i<n;i++){
            if(a[i]==-1){
                if(available_officer>0){
                    available_officer--;
                }
                else{
                    untreated++;
                }
            }
            else{
                available_officer+=a[i];
            }
        }
        System.out.println(untreated);
        
        

    }
}
