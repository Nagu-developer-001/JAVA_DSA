import java.util.*;

public class CopyConstructer{
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        LearningCopy L1 = new LearningCopy();
        L1.marks[0] = 100;
        L1.marks[1] = 98;
        L1.marks[2] = 91;
        L1.name = "Ritik";
        LearningCopy L2 = new LearningCopy(L1);
        L1.name = "Nagabhushana N";
        for(int i = 0;i<marks.length;i++){
            System.out.println(L1.marks[i]+"= L1"+L2.marks[i]+"= L2");
        }
        System.out.println(L1.name+"= L1"+L2.name+"= L2");
    }
}

class LearningCopy{
    int marks[];
    String name;
    LearningCopy(){
        marks = new int[3];
        System.out.println("Constructor called");
    }
    //TODO SHALLOW COPY - STORE ONLY REFERENCES 
    // LearningCopy(LearningCopy l1){
    //     marks= new int[3];
    //     this.marks = l1.marks;
    //     this.name = l1.name;
    // }
    //TODO DEEP COPY - STORE THE NESTED OBJECTS <<IT BECOMES INDEPENDENT>>
    LearningCopy(LearningCopy l1){
        marks = new int[3];
        this.name = l1.name;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = l1.marks[i]; 
        }
    }
}