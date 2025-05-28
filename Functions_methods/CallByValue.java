// for objects  , for primitive => already wrote in notebook
public class CallByValue {
    public static void changeArray(int[] arr) {
        arr[0] = 99;
    }
    
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3};
        changeArray(myArr);
        System.out.println(myArr[0]);  // Output: 99 (value inside object changed)
    }
}
