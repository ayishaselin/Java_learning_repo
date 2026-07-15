

class Students {
    String name;
    int age;
    String department;
    
    Students(String n, int a, String d){
      name = n;
      age = a;
      department = d;
    }

    void dispaly(){
      System.out.println("name: " + name);
      System.out.println("age: " + age);
      System.out.println("department: " + department);
      

    }
}
public class Main{
  public static  void main(String [] args){

    Students s1 = new Students("Ayisha", 22, "Computer Science");
    Students s2 = new Students("Ayisha selin", 23, "physics");

    s1.dispaly();
    s2.dispaly();

  }
}
  
