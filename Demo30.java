public class Demo30 {
    public static void main(String[] args) {
        
    }
}

abstract class MyabstractCalss{
    protected abstract void myMethod();
    abstract void myMethod2(); //----> package private are also allowed
}

interface IMyInterface{ //IMyinterface convention of industry starting with "I"

    //public abstract void myMethod();
    void myMethod();
    //abstract void myMethod --> public
   // protected void myMethod1(); --> not allow to make protected

}

interface IMyInterface2 extends IMyInterface/*ImyInterface4,ImyInterface5*/{

    void myMethod5();

}

//class MyConcreatClass implements IMyInterface2{
   // public void myMethod5();

  //  public void myMethod();


}
