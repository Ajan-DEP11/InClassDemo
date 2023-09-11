public class Demo18 {
    public static void main(String[] args) {
        
    }
}
class mySuper{
    int x = 10;
    void doSomething(){
        System.out.println(x);
    }

}

class myChild extends mySuper{
    static String x;
    myChild(String x){
        this.x = x;
    }

}
