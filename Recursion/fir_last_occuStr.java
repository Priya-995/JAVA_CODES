// find the first and last occurence of an element in string
public class fir_last_occuStr {
    public static int first=-1;
    public static int last=-1;
    public static void findOccu(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        int currentChar=str.charAt(idx);
        if(element==currentChar){
            if(first==-1)
                first=idx; 
            else last=idx;
        }
      findOccu(str,idx+1,element);
    }
    public static void main(String[] args) {
        String str ="aswawjjw";
        findOccu(str,0,'a');

    }
    
}
