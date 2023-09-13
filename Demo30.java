public class Demo30 {
    public static void main(String[] args) {
        
    }
}

abstract class MyabstractCalss{
    protected abstract void myMethod();
    abstract void myMethod2(); //----> package private are also allowed
}

interface IMyInterface{ 
 /**
 * 
 */
void myMethod3();
}
//IMyinterface convention of industry starting with "I"

    //public abstract void myMethod();
    void myMethod();
    //abstract void myMethod --> public
   // protected void myMethod1(); --> not allow to make protected

}







interface IMyInterface2 extends IMyInterface/*ImyInterface4,ImyInterface5*/{

    void myMethod5();

}
class MyConcreatClass implements IMyInterface2{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {

        super.finalize();
    }

    @Override
    public void myMethod5() {
        
        
    }

    @Override
    public void myMethod3() {
      
        
    }
   

    @Override
    public void myMethod() {
        
        throw new UnsupportedOperationException("Unimplemented method 'myMethod'");
    }


}
