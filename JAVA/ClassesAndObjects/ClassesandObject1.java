public class ClassesandObject1{

    public static void main(String args[]){
        Pen obj1 = new Pen();
        //System.out.print(obj1);
        obj1.setColor("green");
        obj1.setTip(8);
        System.out.println(obj1.getColor());
        System.out.println(obj1.getTip());
    }
} 

class Pen{
    //TODO THIS COMBO IS CALLED ENCAPSULATION ,IT ALSO ENSURES DATA HIDING(PRIVATE/PROTECTED,DEFAULT - DATA);
    private String color;
    private int Tip;

    //TODO SETTERS() TO SET PRIVATE PROPERTIES VALUE OF A CLASS;
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setTip(int newTip){
        this.Tip = newTip;
    }
    //TODO GETTERS() TO ACCESS PRIVATE PROPERTIES OF A CLASS; 
    public int getTip(){
        return this.Tip;
    }
    public String getColor(){
        return this.color;
    }
}
