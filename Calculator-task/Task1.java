import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         String nextcalcu;
        
   do{
        
        System.out.println("===== SIMPLE CALCULATOR =====\n" + //
                        "1. Addition\n" +
                        "2. Subtraction\n"  +
                        "3. Multiplication\n"  +
                        "4. Division\n"  +
                        "5. Exit");
        
        System.out.println("Enter your choice: ");
        int choice=s.nextInt();
        System.out.println("Enter first number: ");
        double num1=s.nextDouble();
        System.out.println("Enter second number: ");
        double num2=s.nextDouble();

        switch(choice){
            case 1:
               System.out.println("Result = " + (num1 + num2));
               break;
            case 2:
               System.out.println("result=" +( num1 - num2));
               break;
            case 3:
               System.out.println(num1 * num2);
               break;
            case 4:
               if(num2 == 0){
                System.out.println("not divisible");
               }
               else{
               System.out.println(num1 / num2);
               }
               break;
            default:
                 System.out.println("not operations");

        }
        
             System.out.println("do you want to continue: Y/N: ");
             nextcalcu = s.next();
        } while(nextcalcu.equals("Y") || nextcalcu.equals("y"));

    }
}
