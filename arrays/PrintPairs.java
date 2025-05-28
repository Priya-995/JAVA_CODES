// formula to cal. tp=> (n(n-1))/2
public class PrintPairs {
    public static void pairs(int[] arr){
        int tp=0;
        //using nested loops => time complexity: O(n^2)
        for(int i=0;i<arr.length;i++){
            int current= arr[i]; // [2,4,5,6,7]
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+ arr[j]+")");
                tp++;

            }
            System.out.println();

        }
        System.out.println(tp);

    }
    public static void main(String[] args) {
        int[] arr= {2,4,5,6,7};
        pairs(arr);

        
    }
}
