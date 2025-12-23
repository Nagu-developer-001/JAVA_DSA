class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}
public class Polymorphism{
    public  static void main(String args[]){
        Calculator cl = new Calculator();
        float x = cl.sum((float)1,(float)44);
        System.out.print(x);
    }
}