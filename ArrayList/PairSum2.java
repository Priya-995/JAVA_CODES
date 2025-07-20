import java.util.ArrayList;

public class PairSum2 {
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
        // time complexity : O(n)
        // 2 pointer approach
        int n=list.size();
        int bp=-1;   // breakpoint or pivot
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;  // left pointer
        int rp=bp;  // right pointer
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                 lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;

            }
        }
      return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // sorted and rotated  list 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(bruteForceApproach(list,15));
        System.out.println(PointerApproach(list, 15));


        
    }
}
