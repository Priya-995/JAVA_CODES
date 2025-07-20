// Using ArrayList 
import java.util.ArrayList;

// Similar to trapping rainwater

public class ContainerWithMostWater {
    // Brute force approach
    // Time complexity: O(n^2)
    public static void storeWater_BruteForce(ArrayList<Integer> height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(currWater,maxWater);

            }

        }
        System.out.println(maxWater);
    }
    // 2 pointer approach
    // Time complexity: O(n)
    public static void storeWater_2PointerForce(ArrayList<Integer> height){
        int lp=0;
        int rp=height.size()-1;
        int maxWater=0;

        while(lp<rp){
            // calculate water area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);
            // update pntr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }



        }
        System.out.println(maxWater);

    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Brute Force approach :");
        storeWater_BruteForce(height);
        System.out.println("Optimized : Using 2 pointer approach");
        storeWater_2PointerForce(height);

        
    }

    
}
