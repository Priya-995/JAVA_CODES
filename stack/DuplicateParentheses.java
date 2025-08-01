import java.util.Stack;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str){ // TC=> O(n)
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);

           // closing
           if(ch==')'){
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;

            }
            if(count<1){
                return true; // duplicate
            }
            else{
                s.pop();
            }
           }
           else{
            s.push(ch);
           }
           
        }
        return false;

    }
    public static void main(String[] args) {
        String str="(((a+(b)))+(c+d))";
        String str1="(a+b)(a+b)";
        System.out.println(isDuplicate(str));
    }
}
