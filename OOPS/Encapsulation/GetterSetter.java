package Encapsulation;
public class GetterSetter {
    public static void main(String[] args) {
        Pen p1= new Pen(); //created Pen object p1
        p1.setColor("pink");
        System.out.println(p1.getColor());
        p1.setColor("green");
        System.out.println(p1.getColor());
    }
}
//write classes other than public {downwards}
class Pen{
    private String color;  //this
    int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){  //parameters
        // this.color=newColor;
        color=newColor;
    }
    void setTip(int newTip){ //setter
        tip=newTip;
    }

}
