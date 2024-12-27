public class subSeqOfStr {
    public static void subSequences(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        //to be 
        subSequences(str, idx+1, newStr+currChar);
        //not to be
        subSequences(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        subSequences(str, 0, "");
    }
    
}
