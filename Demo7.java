import java.util.ArrayList;
import java.util.Scanner;

public class Demo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       

       employee emp1 =new employee(0, null, null, null, null);
       employee emp2 = new employee(0, null, null, null);
        // new employee(0, null, null, null, null);
        // new employee(0, null, null, null, null);
        // new employee(0, null, null, null, null);
        
    }
    
}

class employee{
    int id;
    String first_name;
    String last_name;
    ArrayList<String> contact;
    String spousName;
    static String branch;

    public employee(int id,String first_name,String last_name, ArrayList<String> contact){
        this.id = id;
        this.first_name= first_name;
        this.last_name = last_name;
        this.contact = contact;

    }
      public employee(int id,String first_name,String last_name,ArrayList<String> contact,String spousName ){
        this.id = id;
        this.first_name= first_name;
        this.last_name = last_name;
        this.contact = contact;
        this.spousName = spousName;

    }

}
