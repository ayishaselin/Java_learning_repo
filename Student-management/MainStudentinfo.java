import java.util.Scanner;

class StudentInfo{
    String name;
    int age;
    String department;

    StudentInfo(String a, int b, String c){

      name = a;
      age = b;
     department = c;
    }

    void display(){
        System.out.println(" name : " + name);
        System.out.println(" age: " + age);
        System.out.println(" department : " + department);
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

        si.display();
    }
}