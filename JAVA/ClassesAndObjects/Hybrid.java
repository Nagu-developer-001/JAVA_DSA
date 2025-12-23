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
        System.out.print("These can swim...");
    }
}
class Tuna extends Fish{
    void breed1(){
        System.out.println("This is one of the breed in Fish  =  Tuna");
    }
}
class Shark extends Fish{
    void breed2(){
        System.out.print("This is one of the breed in Fish  =  Shark");
    }
}
public class Hybrid{
    public static void main(String x[]){
        Shark sh = new Shark();
        Tuna tu = new Tuna();
        sh.breed2();
        sh.swim();
        sh.eat();
        sh.Breath();

        tu.breed1();
        tu.swim();
        tu.eat();
        tu.Breath();
        tu.breed2();
    }
}