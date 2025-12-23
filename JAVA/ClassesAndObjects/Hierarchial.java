class Animal{
    void eat(){
        System.out.println("These Animal Can Eat...");
    }
    void Breath(){
        System.out.println("These animal Breath");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("These swims with the wings..");
        super.eat();
        super.Breath();
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("These flys in Sky");
    }
}
class mammels extends Animal{
    void walk(){
        System.out.println("These can Walk...");
    }
}

public class Hierarchial{
    public static void main(String args[]){
        mammels mm = new mammels();
        Birds bd = new Birds();
        Fish fs = new Fish();
        mm.eat();
        bd.eat();
        fs.eat();
        mm.Breath();
        bd.Breath();
        fs.Breath();
        mm.walk();
        fs.swim();
        bd.fly();
    }
}