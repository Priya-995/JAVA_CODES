import java.util.Stack;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s,int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int tp=s.pop();
        pushAtBottom(s, top);
        s.push(tp);
    }
    public static void reverseStk(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStk(s);
        pushAtBottom( s,top);
    }



    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStk(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
}
