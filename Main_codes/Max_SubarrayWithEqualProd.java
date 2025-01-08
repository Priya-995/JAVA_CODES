public class Max_SubarrayWithEqualProd {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int gcd=nums[i];
            int lcm=nums[i];
            int prod=nums[i];
            for(int j=i;j<n;j++){
                if(j>i){
                    gcd=findGCD(gcd,nums[j]);
                    lcm=findLCM(lcm,nums[j]);
                        prod*=nums[j];
                }
                if(prod== (long)lcm * gcd)
                     maxLength=Math.max(maxLength,j-i+1);
                
                
            }
        }
        return maxLength;
        
          
        
    }
    private int findLCM(int a,int b){
        return (a*b)/findGCD(a,b);
    }
    private int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
