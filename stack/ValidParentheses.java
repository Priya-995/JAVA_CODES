import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                else if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }

        }
        if(!s.isEmpty()){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String str="([]{}())";
        System.out.println(isValid(str));

    }
}
