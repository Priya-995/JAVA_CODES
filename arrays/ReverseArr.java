//optimize approach => use o(1) space complexity , time complexity=> O(n)
public class ReverseArr {
    public static void reverse(int[] ar){ 
        int first=0;
        int last= ar.length-1;
        while(first<last){
            //swap
            int temp=ar[first];
            ar[first]=ar[last];
            ar[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int ar[]={23,3,8,9,10};  // passing array as argument=> changes always reflect in original
        reverse(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }


    }
}
