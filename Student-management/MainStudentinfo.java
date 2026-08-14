import java.util.Scanner;

class StudentInfo{
    private String name;
    private int age;
    private  String department;

    StudentInfo(String name, int age, String department){

      this.name = name;
      this.age = age;
      this.department = department;
    }

    void display(){
        System.out.println(" name : " + name);
        System.out.println(" age: " + age);
        System.out.println(" department : " + department);
    }

     void setName(String name,int age){
        this.name = name;
        this.age = age;
     }

     String getName(){
        return name;
     }
}

public class MainStudentinfo{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("enter the name : ");
        String name = s.nextLine();

        System.out.println("enter the age : ");
        int age = s.nextInt();

        s.nextLine();

        System.out.println("enter the department : ");
        String department = s.nextLine(); 


        StudentInfo si = new StudentInfo(name,age,department);
        si.setName("pooja",25);

        si.display();
        System.out.println(si.getName());
    }
}