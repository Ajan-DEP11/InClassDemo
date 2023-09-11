public class Custormer {

    public static String something = "Hello"; //Static variable
    public int batch = 11;                   // Instance Variable

    //object initializer
    {
        System.out.println("Instance initializzer 1");
    }

    public Custormer(){
        super();
        System.out.println("Customer() constructor");
    } // constructor---> class name equals no return type

    static{
        System.out.println("Customer class is being initialized");
    }

    public static void doSomething(){
        System.out.printf("%s World!",something);
    }
    {
        System.out.println("Instance initializer 2");
    }
    //instance (unless static keyword)
    public void print(){
        System.out.println("Direct Entry Programme" + batch);
    }
    
}
