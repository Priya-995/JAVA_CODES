// that starts and end with with same character

public class CountSubStrings { 
    public static int print_count(String str,int start, int end){
        if(start==str.length()){
            return 0;
        }
        if(end==str.length()){
          return print_count(str, start+1, start+1);
        }
        int count=(str.charAt(start)==str.charAt(end))?1:0;
        return count+print_count(str, start, end+1);
    }
    public static void main(String[] args) {
        String str="abcab";
        System.out.println(print_count(str,0,0));

    }

    
}
