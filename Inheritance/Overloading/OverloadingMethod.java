class Calculator{
 
    void add( int a, int b ){
        System.out.println("sum=" + (a+b));
    }
    
    void add( double a,  double b, double c){
        System.out.println("sum=" + (a+b+c));
    }

}

public class OverloadingMethod{
    public static void main(String [] args){
        Calculator c = new Calculator();
        c.add(12,23);
        c.add(12.5,24.4,23.2);
    }
}