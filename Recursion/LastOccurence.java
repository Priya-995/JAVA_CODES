public class LastOccurence {
    public static int last_occ(int[] arr, int key,int i){
      if(i==arr.length){
        return -1;
      }
      int isFound=last_occ(arr, key, i+1);// looking forward :first
      //after all calls complete
      if(isFound==-1&&arr[i]==key){
        return i;
      }
      return isFound;


    }

    public static void main(String[] args){
        int arr[]={1,2,8,3,4,5,8,9};
        int key=8;
       System.out.println("Last occurence of the element "+key+" is at index :"+last_occ(arr,key,0));
    }
}
