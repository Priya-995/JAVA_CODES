import java.util.*;
public class by_cf {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("this");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("he");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.remove(2);
        System.out.println(list);    
    }
    
}
