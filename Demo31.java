public interface Demo31 {
    public static void main(String[] args) {

        //we can have static methods in interface - java 8
        //we can have default methods -j8
        //private methods in interface -j9

        System.out.println("Hello world");
    }
    private void myMethod(){

    }
    private static void myMethod2(){

    }
    default void myMethod3(){
        //cant use private , protected with default 
        //default methods are just like abstract methods when it comes to access modifers
        //defaults are still instance metods

    }
    int x =10; //---> implicitly public static final
    // no private or protected with constants in interfaces.
}


