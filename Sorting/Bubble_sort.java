public interface Bubble_sort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,1,2,3};
        //bubble sort
        //time complexity=> O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }

        }
        printArr(arr);

    }
}