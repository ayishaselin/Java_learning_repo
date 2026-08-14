abstract class Shape{
    abstract void draw();
}

abstract class Circle extends Shape{}

class Square extends Shape{
 void draw(){
    System.out.println("square shape");
 }
}

public class AbstractionConcept {
    public static void main( String [] args ){
        Shape s = new Square();
        s.draw();
    }
    
}
