
interface Payment{
  void pay();
}
class UPI implements Payment{
   public  void pay(){
         System.out.println("Payment through UPI");
    }
}

class Card implements Payment{
   public  void pay(){
         System.out.println("Payment through Card");
    }
}
class Cash implements Payment{
   public  void pay(){
         System.out.println("Payment by cach");
    }
}

public class PaymentsInfo{
  public static void main(String [] args){
     Payment p ;
     p = new Cash();
     p.pay();
     p= new UPI();
     p.pay();
     p = new Card();
     p.pay();
  }
}