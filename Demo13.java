import java.lang.reflect.Field;
import java.util.Vector;

public class Demo13 {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
      System.out.println("Y : " + MyChild.y);
    //    ClassLoader classLoader = Demo13.class.getClassLoader();
    //    Field hiddenField = ClassLoader.class.getDeclaredField("classes");
    //    hiddenField.setAccessible(true);
    //    Vector<Class<?>> loadedClasses = (Vector<Class<?>>)hiddenField.get(classLoader);
    //    System.out.println(loadedClasses);
       System.out.println("x : " + MyChild.x);

        
    }
}

class MyParent{
    static int x = 10;
    static{
        System.out.println("parent class initialized");
    }
}

class MyChild extends MyParent{
    static int y = 110;
    static{
        System.out.println("MyChild initializzed");
    }
}
