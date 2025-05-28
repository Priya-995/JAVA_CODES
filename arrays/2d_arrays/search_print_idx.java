import java.util.*;
public class search_print_idx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int cols= sc.nextInt();
        int number[][]= new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
        //print matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
               System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        // search element
        System.out.println("enter no. to search");
        //key to found
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
              if(number[i][j]==x)
              System.out.print(i+" "+j);
            }
        }

        
    }
    
}
