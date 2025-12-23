public class LearnStatic{
    public static void main(String args[]){
        Student sc1 = new Student();
        sc1.SchollName = "SURANA AUTONOUMOUS";
        Student sc2 = new Student();
        System.out.println(sc2.SchollName);
        Student sc3 = new Student();
        System.out.println(sc3.SchollName);
    }
}

class Student{
    String name;
    int RollNo;
    static String SchollName;
    static int marks(int math,int phy,int che){
        return (math+phy+che)/3;
    } 
}