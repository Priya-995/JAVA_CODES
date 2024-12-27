// move all x to last 
//Time complexity => O(n+count)   ; count=n
// O(n+n)=> O(2n)  =>  O(n)
public class moveX {
    public static void movX(String str,int idx,int count,String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.print(newStr);
            return;
        }
         char current =str.charAt(idx);
        if(current=='x'){
            count++;
            movX(str,idx+1,count,newStr);
        }
        else{
             newStr+=current;
             movX(str,idx+1,count,newStr);
        }

    }
    public static void main(String[] args) {
        String str="abxcdxxo";
        movX(str,0,0,"");
    }
}
