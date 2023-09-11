public class Demo14 {
    public static void main(String[] args) {
        
        
        A ref2 = new C();
        System.out.println(ref2.x);
        ref2.myMethod();
        C ref = new C();
        System.out.println(ref.x);
        ref.myMethod();
        // B ref = new C();
        // System.out.println(ref.x);
        
    }
}
class A {
 int x = 10;
 {
    System.out.println("A instance initializer");
 }
 public A(){
    System.out.println("A's constructor");
 }
 static{
    System.out.println("A initializzed");
 }
 void myMethod(){
     System.out.println("A's myMethod()");
 }
}




class B extends A {
    int x = 20;
     public B(){
    System.out.println("B's constructor");
 }
     static{
    System.out.println("B initializzed");
 }
 {
    System.out.println("B instance initializer");
 }
protected void myMethod(){
    System.out.println("B's myMethod()");

 }



}
class C extends B {
    int x = 30;
     public C(){
    System.out.println("C's constructor");
 }
     static{
    System.out.println("C initializzed");
 }
 {
    System.out.println("C instance initializer");
 }
public void myMethod(){
     System.out.println("C's myMethod()");
 }

}

class Super{

}

class Sub extends Super{
    
}