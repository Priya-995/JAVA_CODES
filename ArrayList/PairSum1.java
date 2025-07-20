import java.util.*;
// FInd if any pair in a sorted arraylist has a target sum
public class PairSum1 {
    // time complexity : O(n^2)
    public static boolean bruteForceApproach(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;

    }
     public static boolean PointerApproach(ArrayList<Integer> list,int target){
        // 2 pointer approach
        int lp=0;  // left pointer
        int rp=list.size()-1;  // right pointer
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                 lp++;
            }
            else{
                rp--;

            }
        }
      return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // sorted list 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(bruteForceApproach(list,5));
        System.out.println(PointerApproach(list, 45));


        
    }
}
