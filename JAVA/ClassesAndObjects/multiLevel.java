class Animal{
    String color;
    Animal(){
        color = "Dark Orange";
    }
    void Eat(){
        System.out.println("This Animal Can Eat...");
    }
    void Breath(){
        System.out.println("This can Breath...");
    }
}
class Legs extends Animal{
    void ChangeColor(){
        color = "Light Brown";
    }
    void leg(){
        System.out.println("This has 4 Legs...");
    }
}
class Dog extends Legs{
    void breed(){
        System.out.println("The dog is Husky breed");
    }
}
public class multiLevel{
    public static void main(String args[]){
        Dog dg = new Dog();
        dg.Eat();
        dg.Breath();
        dg.leg();
        dg.breed();
        System.out.print(dg.color);
        dg.ChangeColor();
        System.out.print(dg.color);
    }
}