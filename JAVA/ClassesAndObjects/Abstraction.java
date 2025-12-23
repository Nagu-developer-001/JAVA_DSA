public class Abstraction{
    public static void main(String x[]){
        Dog dg = new Dog();
        dg.walk();
    }
}

abstract class Animal{
    Animal(){
        System.out.print("Animal Constructor called...");
    }
    void eat(){
        System.out.println("Animal Eats...");
    }
    abstract void walk(); 
} 

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructer is called...");
    }
    void walk(){
        System.out.print("Horse walks on four legs");
    }
}
class Dog extends Horse{
    Dog(){
        System.out.println("Dog Constructor called...");
    }
    
    void walk(){
        System.out.print("Dog walks on 4 legs");
    }
}