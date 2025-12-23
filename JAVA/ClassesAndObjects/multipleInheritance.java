public class multipleInheritance{
    public static void main(String[] args) {
        Human H = new Human();
        H.eatNon_Veg();
        H.eatVeg();
    }
}

interface Herbivor{
    public void eatNon_Veg();
}
interface Cornivore{
    public void eatVeg();
}

class Human implements Herbivor,Cornivore{
    public void eatVeg(){
        System.out.println("Most of the Human Eats Both Herbivor");
    }
    public void eatNon_Veg(){
        System.out.println("Most of the Human Eats Both Cornivore");
    }
}
