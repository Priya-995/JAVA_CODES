
public class LengthOfString {
    public static int getLength(String str){
        if(str==""){
            return 0;
        }
        return 1+getLength(str.substring(1));
      
    }
    public static void main(String[] args) {
        String str="priya";
        System.out.println(getLength(str));
    }
    
}
