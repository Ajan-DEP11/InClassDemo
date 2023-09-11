package myPackage;

public class Demo {
    public static void main(String[] args) {
        customer customer = new customer();
       // customer.id --private
       customer.address = "Matale";
       customer.contact = "34567";
       customer.name = "Ajan";
       customer.print();
    }
}
