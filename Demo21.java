import myPackage.customer2;
import myPackage.customer2;

public class Demo21 {
    public static void main(String[] args) {
        customer2 customer = new customer2();
       // customer.id --this is a default package
       //customer.name = "Kasun";
       customer.contact="2347";
       
    }
}

class CrazyCustomer extends customer2{
CrazyCustomer(){
   address = "Matale";
   contact = "07133";

   }
   public void print(){
    super.print();
   }
}
