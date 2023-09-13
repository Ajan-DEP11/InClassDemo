package Hiding;

public class Demo {
    public static void main(String[] args) {

        Dream.execute();

        
    }
}
class SuperClass{
    public static void execute(){
        System.out.println("Super class");
    }
    static{
        System.out.println("super class is being initia:");
    }

}

 class Dream extends SuperClass implements Idea1,Idea2{
    static{
        System.out.println("Dream class initializing");
    }

 }


interface SuperIdea{
   public static void execute(){
        System.out.println("super idea");
    }
}

interface Idea1 extends SuperIdea{
    public static void execute(){
        System.out.println("idea1 is an extention of the super idea");
    }

}

interface Idea2 {
   public static void execute(){
        System.out.println("idea2");
    }
}
