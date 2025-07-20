import java.util.Stack;
public class NextGreaterElemnt {
    public static void nextGreater( int[] arr, int[] nextGreaterArr){
        Stack<Integer> s= new Stack<>();   
        // total Time Complexity : O(n+2n) =O(n)
        for(int i=arr.length-1;i>=0;i--){               //O(n)
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){   // O(2n)
                s.pop();
            }
            if(s.isEmpty()){
                nextGreaterArr[i]=-1;

            }
            else{
                 nextGreaterArr[i]=arr[s.peek()];

            }
            s.push(i);

        }
        // Question Forms
        // next Greater RIght
        // next greater left  : reverse for loop direction
        // Next smaller RIght : reverse while condition 
        // Next smaller left  : reverse while condition and reverse for loop direction

    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        int[] nextGreaterArr=new int[arr.length];
        nextGreater(arr,nextGreaterArr);
        for(int i=0;i<nextGreaterArr.length;i++){
            System.out.print(nextGreaterArr[i]+" ");
        }
    }
}
