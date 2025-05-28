
public class largestNumber {
    public static void main(String[] args) {
        int arr[]= {2,3,5,7,70,9};
        int largest= Integer.MIN_VALUE;
        for(int e:arr){
            if(largest<e){
                 largest=e;
            }
        }
        System.out.println(largest);


    }
}
