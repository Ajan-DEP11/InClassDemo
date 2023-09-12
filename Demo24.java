import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Demo24 {
    public static void main(String[] args) {
        ServiceType cart = ServiceType.CART;

        Scanner scanner = new Scanner(System.in);
        
            System.out.println("1. Item Service");
            System.out.println("2. Cart Service");
            System.out.println("3. Report Service");

            int choice;
            do{
                System.out.print("Enter service type: ");
                 choice = scanner.nextInt();
                scanner.nextLine();
                if(choice > 0 && choice < 4)break;

        }while(true);

     
        
        ServiceType serviceType = ServiceType.getService(choice);
        System.out.printf("%s \n",serviceType);
        
    }
}

enum ServiceType{

    ITEM(1),CART(2),REPORT(3);

    private int index;

    ServiceType(int index){
        this.index = index;

    }
    public static ServiceType getService(int index){
        for(ServiceType type : ServiceType.values()){
            if(type.index == index) return type;
        } 
        throw new RuntimeErrorException(null, "Invalid service type");
    }
}
