import java.util.*;
public class Intersection {
    public static int printIntersectionEle(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> intersection=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
               count++;
               intersection.add(arr2[j]);
               set.remove(arr2[j]);
            }
        }
        System.out.println(intersection);
        return count;

    }
    public static void main(String[] args) {
        int arr1[]={7,3,9,4,6};
        int arr2[]={6,3,9,2,9,4};
       System.out.println(printIntersectionEle(arr1, arr2));

    }
}
