public class Demo17 {
    public static void main(String[] args) {
        Sub2 s1 = new Sub2();
        s1.print();
    }
}
class Parent2{
    int x =10;
    void print(){
        System.out.println(x);
        System.out.println(this.x);
        Sub2 ref = (Sub2)this;
        System.out.println(ref.x);
        
    }
}
 class Sub2 extends Parent2{
    int x = 20;
 }
