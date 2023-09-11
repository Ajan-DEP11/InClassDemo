public class Demo4 {
    static int x = 5;

    public Demo4(){
        super();
        System.out.println("Constructor body");
    }
    {
        System.out.println("Instance initialized");
    }

     void print(){
        int x = 10;
        System.out.println(x);
    }
    {
        System.out.println("Demo4 is initialized");
    }
    public static void main(String[] args) {
        new Demo4().print();
        System.out.println(x);
    }
    
}
