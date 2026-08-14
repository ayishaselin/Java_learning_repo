package intro;
import java.util.*;



class Person{
 String name;
 int age;
}


class Student extends Person {
   String department;

   void Display(){
    System.out.println(" name : " + name);
        System.out.println(" age: " + age);
        System.out.println(" department : " + department);
   }
}

public class Main{
 public static void main(String [] args){
  
   Student s = new Student();

   s.name = "ayisha";
   s.age = 21;
   s.department = "scince";
   
   s.Display();
 }
}