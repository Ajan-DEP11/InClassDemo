public class Demo33 {
    public static void main(String[] args) {
        MyCrazyClass myCrazyClass1 = new MyCrazyClass();
        System.gc();
        System.out.println("--------------");
        
        myCrazyClass1 = null;
        System.gc();

        System.out.println("------------------");
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();

        // System.gc();

        MyCrazyClassWrapper Wrapper = new MyCrazyClassWrapper(new MyCrazyClass());
        System.gc();
        Wrapper.crazyClass = null;
        System.gc();

        
    }
}
class MyCrazyClassWrapper{
    MyCrazyClass crazyClass;
    public MyCrazyClassWrapper(MyCrazyClass crazyClass){
        this.crazyClass = crazyClass;
    }

}

class MyCrazyClass{
    public MyCrazyClass(){
        System.out.println("I am being constructed");
    }
@Override
    protected void finalize()throws Throwable{

        System.out.println(Thread.currentThread().getName());
        System.out.println("***********");
        System.out.println("dismissed");
    }
}
