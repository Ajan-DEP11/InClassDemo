public class Demo20 {
    public static void main(String[] args) {
        
    }
}

abstract class myLeafClass{
    void print(){
        System.out.println("Over ride print ");
    }
     final void execute(){ //leaf methods

    }
    final static void execute2(){}//leaf methods

}
class MyChildClass2 extends myLeafClass{
    void print(){
        System.out.println("bla bla ");
    }
    //void execute(){} 

    

}
