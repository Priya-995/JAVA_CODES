//leetcode - 1929. concatenation of array
//Approach
//Create a new integer array 'ans' of size '2*len', where 'len' is the length of the input array 'nums'.
//Iterate over the elements of 'nums' using a for loop.
//For each element at index 'i', assign 'nums[i]' to 'ans[i]' (copy the element).
//Assign 'nums[i]' to 'ans[i+len]' (append the element to the end of the array).
//Return the resulting array 'ans'.    
//complexity : O(n)

public class concat {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       int[] arr=new int[2*n];
      
       for(int i=0;i<nums.length;i++){
          arr[i]=nums[i];
          arr[i+n]=nums[i];
       }
       return arr;
   }
}
