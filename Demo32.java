public class Demo32 {
    public static void main(String[] args) {
        MyawesomeClass myawesomeClass = new MyawesomeClass();
        System.out.println(myawesomeClass);

        myFun myFun = x -> x*x +2*x +1;
        System.out.println(myFun.Ajan(2));
        System.out.println(myFun.Ajan(-2));
        System.out.println(myFun.Ajan(20));
        System.out.println(myFun.Ajan(5));
        System.out.println(myFun.Ajan(0));

        System.out.println("---------------------------");

        myMaths myMaths =( x,y)-> x*x +y*y;
        System.out.println(myMaths.Don(2, 5));

        System.out.println("-------------");
    
        
    }
    
}

interface myFun{
    int Ajan(int x);
}

interface myMaths{
    int Don(int x, int y);
    static void doSomething(){} //no any downs coz there is void so thts not retun anything
}


interface MyMarkerInterface{
//empty
}

class MyawesomeClass implements MyMarkerInterface{

}

@FunctionalInterface
interface myFunctionalInterface{
    void myOnalyAbstraction();

    static void myStatic(){

    }
}
