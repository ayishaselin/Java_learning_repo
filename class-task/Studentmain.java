import intro.Student;

class Student {
    String name;
    String department;
    int age;

    void dispaly(){
      System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Department   : " + department);
    }
    void setStudent(String n, int a, String d){
         name = n;
         age = a;
         department = d;
    }
} 
public class Studentmain{
  public static void main (String [] args){
    
   Student s1 = new Student();
   Student s2 = new Student();
   Student s3 = new Student();


   s1.name = "ayisha";
   s1.age = 12;
   s1.department= "science";
  
   s2.name = "ayisha selin";
   s2.age = 14;
   s2.department= "science computer";

   s3.setStudent("Anu", 22, "Computer Science");
   

        s1.dispaly();
        s2.dispaly();
        s3.dispaly();

  }}

    
   
