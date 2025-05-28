public class FirstOccurence {
    public static int first_occur(int[] arr,int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return first_occur(arr, key, i+1);
      

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};
        System.out.println(first_occur(arr,4,0));
        
    }
}
