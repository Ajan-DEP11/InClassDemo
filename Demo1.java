public class Demo1 {
    public static void main(String[] args) throws Exception{
        
        //Explicitly load

        Class.forName("Custormer");

        //Implicitly
        //1. Accessing static members
        //System.out.println(Custormer.something);
        Custormer.doSomething();

        //2. Creating New Instances
        new Custormer();
        
    }
}