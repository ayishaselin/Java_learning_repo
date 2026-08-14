

class Animal{
   void sound(){
       System.out.println("Animal Sounds");
    }
}

class Dog extends Animal{
    void sound(){
       System.out.println("dog--bark");
    }
}

class Cat extends Animal{
    void sound(){
       System.out.println("cat--meow");
    }
}
public class AnimalSound {
    public static void main(String [] args){
        Animal a ;
        a = new Dog();
          a.sound();
        a = new Cat();
        a.sound();
    } 
}
