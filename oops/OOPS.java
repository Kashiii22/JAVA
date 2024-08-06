package oops;
import java.util.*;
public class OOPS {
   public static void main(String[] args) {
    Student s1=new Student("Kashi");
    System.out.println(s1.name);
   }
    
}
class Student{
    String name;
    int roll;
    Student(String name){// Constructor Called
        this.name=name;
    }

}