class InheritanceLearn{
    void eat(){
        System.out.print("It Can Eat...");
    }
    void breath(){
        System.out.print("It Can Breath...");
    }
}

class SingleLevel extends InheritanceLearn{
    void legs(){
        System.out.print("One leg animal....");
    }
}

public class Inheritance{
    public static void main(String args[]){
        InheritanceLearn ne = new InheritanceLearn();
        ne.eat();
        ne.breath();
        //ne.legs();
    }
}