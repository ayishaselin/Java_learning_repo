import java.util.Scanner;

public class Grade_calculator {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        double total = 0;
        double mark;
        double avg;
        double percentage;
        String grade;
        System.out.print("enter student name  :");
        String name = s.nextLine();
        for(int i=1;i<=5;i++)
        {    System.out.print("enter the mark of subject" + i + " out of 100  : \n " );
             mark = s.nextDouble();
              total= total + mark ;
        }
         

          avg= total/5;
          percentage = (total/500)* 100;

        if ( percentage >= 90){
            grade = "A+" ;
        }
        else if( percentage >= 80){
            grade = "A" ;
        }
        else if( percentage >= 70){
            grade = "B" ;
        }
        else if( percentage >= 60){
            grade = "C" ;
        }
        else if( percentage >= 50){
            grade = "D" ;
        }
        else  {
            grade = "fail" ;
        }
        
         System.out.println("======student Result======= " ); 
         System.out.println("student name = " + name); 
         System.out.println("total mark  = " + total); 
         System.out.println("average mark  = " + avg); 
         System.out.println("percentage  = " + percentage);
         System.out.println("Grade  = " + grade); 
         
         s.close();
    }
    
}
