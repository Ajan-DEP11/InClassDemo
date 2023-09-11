public class Demo17 {
    public static void main(String[] args) {
        
    }
}
class Parent2{
    int x =10;
    void print(){
        System.out.println(x);
        System.out.println(this.x);
        
    }
}
 class Sub2 extends Parent2{
    int x = 20;
 }
