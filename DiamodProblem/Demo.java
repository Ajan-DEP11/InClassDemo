package DiamodProblem;

public class Demo {
    public static void main(String[] args) {
        
    }
}

interface AwesomeIdea{
    //void execute();
    public static void doSomething(){}
}

interface MySuperAwesomeIdea extends AwesomeIdea{
    // default void execute(){
    //     //System.out.println("My Super awesome");
    // }

    public static void doSomething(){}

}

interface MyCrazyIdea extends AwesomeIdea{
    // default void execute(){

    // }
    public static void doSomething(){}

}
class DreamComeTrue implements MySuperAwesomeIdea,MyCrazyIdea{

  //public void execute(){

}
  
}
