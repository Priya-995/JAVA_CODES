//Width of each bar is 1 , compute how much water it can trap after raining. 
// Time complexity => O(n)
public class TrappingRainWater {
    public static int trappedWater(int[] height){
        int n=height.length;
        int[] leftMax = new int[height.length] ;
        int[] rightMax = new int[height.length] ;
        //calculate left max boundary -array
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary -array
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater= 0;
        //loop
        for(int i=0;i<n;i++){
            //waterLevel=min(leftmax bound, rightmax bound)
           int waterLevel=Math.min(leftMax[i],rightMax[i]);
           //trappedWater= waterlevel- height[i]
           trappedWater+=waterLevel-height[i];
        }
        return trappedWater;



    }
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
        
    }
}
