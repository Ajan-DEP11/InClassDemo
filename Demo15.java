public class Demo15 {
    public static void main(String[] args) {
        myB ref = new myC();
        System.out.println(ref.x);
        ref.myMethod();
    }
    
}

class myA{
   int x = 20;
   void myMethod(){
    System.out.println(x);
   }
   static void myFun(){
    System.out.println("A function");
   }
}

class myB extends myA{
    static int x = 10;
    static void myFun(){
    System.out.println("B function");
   }

}

class myC extends myB{
     static int x = 30;
      void myMethod(){
    System.out.println(x);
   }
   static void myFun(){
    System.out.println("C function");
   }
}