public class Demo23 {
    public static void main(String[] args) {
       // Months jan = Months.MAY;
       // MonthsClone jan2 = MonthsClone.JAN;
       Months.JAN.print();
        
    }
}

enum Months{
    JAN(1,"Ajan"),
    FEB(2,"Kasun"),
    MAR(3,"Nadun");

   private int id;
    private String name;

    Months(int id, String name){
       this.id = id;
       this.name = name;
    }
    public void print(){
        System.out.printf("Month:%s - %s\n",id,name);
    }

    // void myMethod(){

    // }

    // static void myMethod2(){

    // }

}

// class MonthsClone{
//     public static final MonthsClone JAN = new MonthsClone();
//     public static final MonthsClone FEB = new MonthsClone();
//     public static final MonthsClone MAR = new MonthsClone();
//     public static final MonthsClone APR = new MonthsClone();
//     public static final MonthsClone MAY = new MonthsClone();
//     public static final MonthsClone JUNE = new MonthsClone();

//     private String fieldname;
//     private static int count;

//     {
//         fieldname = MonthsClone.class.getDeclaredFields()[count++].getName();
//     }

//     // private MonthsClone(){
//     //     System.out.println("MonthsClone");
//     // }

//     @Override
//     public String toString(){
//        return fieldname;
//     }
    
    
// }
