public class CallByValue2 {
    public static void changeReference(int[] arr) {
        arr = new int[]{4, 5, 6};  // new object created
    }
    
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3};
        changeReference(myArr);
        System.out.println(myArr[0]);  // Output: 1 (original object not changed)
    }
    
}
