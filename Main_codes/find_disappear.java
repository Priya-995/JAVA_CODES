// 448. FInd All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
import java.util.ArrayList;
import java.util.List;

public class find_disappear {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list =new ArrayList<>();
            int i=0;
            int n=nums.length;
            while(i<n){
            int element=nums[i];
            int idx=element-1;
            if(nums[i]!=nums[idx]){
                //swap
               int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;  
            }
            else{
                i++;
            }
            }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }

        return list;
        
    }
    
}
