public class Demo19 {
    public static void main(String[] args) {
        new myChildClass();
        new myChildClass(10);
        new myChildClass(10, "IJSE");
        
    }
}
class parentClass{

}

class myChildClass extends parentClass{
    public myChildClass(){
        super();
    }
    public myChildClass(int id){
        super();
    }
    public myChildClass(int id,String name){
        super();
    }
}
