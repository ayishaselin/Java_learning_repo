interface Callable{
    void call();
}

interface Camera{
    void takePhoto();
}

class Phone implements Callable,Camera{
    public void call(){
        System.out.println("calling");
    }
    public void takePhoto(){
          System.out.println("photo processing");
    }
}

public class PhoneAction{
    public static void main (String [] args){
    
       
        Phone p = new Phone();
        Camera c = p ;
        Callable cb = p;
        c.takePhoto();
        cb.call();
    }
}