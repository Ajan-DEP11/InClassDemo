public class Demo23 {
    public static void main(String[] args) {
       // Months jan = Months.MAY;
        MonthsClone jan2 = MonthsClone.JAN;
        
    }
}

enum Months{
    JAN,FEB,MAR,APR,MAY,JUNE;

    int id;
    String name;

    Months(){
        System.out.println("Months constructor");
    }

    // void myMethod(){

    // }

    // static void myMethod2(){

    // }

}

class MonthsClone{
    public static final MonthsClone JAN = new MonthsClone();
    public static final MonthsClone FEB = new MonthsClone();
    public static final MonthsClone MAR = new MonthsClone();
    public static final MonthsClone APR = new MonthsClone();
    public static final MonthsClone MAY = new MonthsClone();
    public static final MonthsClone JUNE = new MonthsClone();

    private String fieldname;
    private static int count;

    {
        fieldname = MonthsClone.class.getDeclaredFields()[count++].getName();
    }

    // private MonthsClone(){
    //     System.out.println("MonthsClone");
    // }

    @Override
    public String toString(){
       return fieldname;
    }
    
    
}
