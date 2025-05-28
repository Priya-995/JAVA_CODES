
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b= new Bear();
        b.eatGrass();
        b.eatMeat();

    }
    
}
interface Herbivores{   // always public ,100% abstract:-means that no implementation
   void eatGrass();
}
interface Carnivores{
    void eatMeat();
}
class Bear implements Herbivores, Carnivores{
     public void eatGrass(){ //In Java, when a class implements an interface, the methods must be explicitly declared as public. This is because all methods in an interface are implicitly public and abstract by default.
        System.out.println(" eats grass");
    }
    public void eatMeat(){
      System.out.println("eats meat");
    }

    
}
