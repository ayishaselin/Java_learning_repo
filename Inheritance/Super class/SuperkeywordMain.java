import java.util.*;

class Person{
 String name;
 int age;

 Person(String name,int age ){
  this.name = name;
  this.age = age;
 }
}


class Student extends Person {
   String department;

   Student(String name,int age ,String department){
    super(name,age);
    this.department = department;
   }

   void display(){
    System.out.println(" name : " + name);
        System.out.println(" age: " + age);
        System.out.println(" department : " + department);
   }
}

public class SuperkeywordMain{
 public static void main(String [] args){
  
   Student s = new Student("ayisha",21,"scince");

  
   
   s.display();
 }
}
