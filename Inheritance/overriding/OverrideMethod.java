




class Person{
 String name;
 int age;

 void display(){
  System.out.println(" im person " );
 }
}


class Student extends Person {
   String department;

   void display(){
          super.display();
       System.out.println(" im student " );
   }
}

public class OverrideMethod{
 public static void main(String [] args){
  
   Student s = new Student();

   

   s.display();
 }
}



