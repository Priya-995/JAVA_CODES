
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(.5*l*b);
    }
}
class Equilateral_trian extends Triangle{
    int side;
} 
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        
    }
}
