public class Demo18 {
    public static void main(String[] args) {
        myChild mc = new myChild("ABC");
        mc.doSomething(20);
        
    }
}
class mySuper{
    int x = 10;
   

}

class myChild extends mySuper{
    static String x;
    myChild(String x){
        this.x = x;
    }
     void doSomething(double x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
        System.out.println(myChild.this.x);
        System.out.println(myChild.super.x);
        mySuper newRef = this;
        System.out.println(newRef.x);
        System.out.println(((myChild)newRef).x);
    }



}
