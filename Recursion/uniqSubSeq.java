import java.util.HashSet;
public class uniqSubSeq {
    public static void uniqueSequence(String str,int idx,String newStr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
            return; 
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //to be
        uniqueSequence(str, idx+1, newStr+currChar, set);
        //not to be 
        uniqueSequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniqueSequence(str,0,"", set);
    }
}
