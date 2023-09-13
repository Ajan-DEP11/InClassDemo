package DiamodProblem;

public class Demo {
    public static void main(String[] args) {
        
    }
}

interface AwesomeIdea{
    void execute();
}

interface MySuperAwesomeIdea extends AwesomeIdea{

}

interface MyCrazyIdea extends AwesomeIdea{

}
class DreamComeTrue implements MySuperAwesomeIdea,MyCrazyIdea{

@Override
    public void execute(){

    }
}
