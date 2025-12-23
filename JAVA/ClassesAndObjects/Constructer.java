public class Constructer{
    public static void main(String args[]){
        Student s2 = new Student("Nagabhushana N",21);
        Student s1 = new Student(s2);
        Student s3 = new Student();

    }
}
class Student{
    int age;
    String name = null;
    Student(){
        System.out.println("No Parameterized Constructor");
    }
    Student(String name,int age){//TODO PARAMETERIZED CONSTRUCTER
        this.age = age;
        this.name = name;
        System.out.println(name+" "+age);
    }
    Student(Student s2){
        this.name = s2.name;
        this.age  = s2.age;
        System.out.println(name+" "+age);
    }
}