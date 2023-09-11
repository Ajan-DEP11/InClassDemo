public class Demo19 {
    public static void main(String[] args) {
        new myChildClass();
        // new myChildClass(10);
        // new myChildClass(10, "IJSE");
        
    }
}
class parentClass{

}

class myChildClass extends parentClass{
    {
        System.out.println("Initialize");
    }
    public myChildClass(){
        this(10,"Ajan");
        System.out.println("myClass1");
        //super();
    }
    public myChildClass(int id){
       // super();
       
        System.out.println("myClass2");
    }
    public myChildClass(int id,String name){
       // super();
        System.out.println("myClass3");
    }
}
