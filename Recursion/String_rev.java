//Time complexity => O(n)
public class String_rev {
    public static void revStr(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        } 
        System.out.print(str.charAt(idx));
        revStr(str,idx-1);
    }
    public static void main(String[] args) {
        String str="priya";
        int idx=str.length()-1;
        revStr(str,idx);
    }
}
