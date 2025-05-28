// complexity =>  O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int key=4;
       for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
           System.out.println("Found at index:"+ i);
           
        }
        
       }

    }
}
