public class Demo12 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.x);
        System.out.println(child.y);
        System.out.println(child.a);
        child.myInstanceMethod();
        System.out.println(child.toString());
        child.myMethod1();
        
    }
}
class Parent{
    static int x;

    static{
        System.out.println("Parent class is being initialized");
    }

    {
        System.out.println("parent instsnce");
    }
    int y;

    static void myMethod(){

    }
    void myInstanceMethod(){

    }

}

class Child extends Parent{
    static{
        System.out.println(" chiled class is being loaded");
    }
    {
        System.out.println("chiled class instance");
    }
    int a;
    void myMethod1(){}

}
