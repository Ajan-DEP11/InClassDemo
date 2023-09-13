package Hiding;

public class Demo {
    public static void main(String[] args) {

        Dream.execute();

        
    }
}
class SuperClass{
    public void execute(){
        
    }

}

 class Dream extends SuperClass implements Idea1,Idea2{

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
