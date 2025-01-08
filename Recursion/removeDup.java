// Time complexity => O(n)
public class removeDup {
    public static boolean map[]= new boolean[26];
    public static void removeDuplicates(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }
      char current=str.charAt(idx);
      if(map[current-'a']){
        removeDuplicates(str, idx+1, newStr);
      }
      else{
        newStr+=current;
        map[current-'a']=true;
        removeDuplicates(str, idx+1, newStr);
      }
    }
    public static void main(String[] args) {
        String str="aabzccdzee";
        removeDuplicates(str, 0, "");
    }
}
