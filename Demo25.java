public class Demo25 {
    private static Weekdays day;

    public static void main(String[] args) {

        //String -> enum
        Weekdays days = Weekdays.valueOf("FRIDAY");
        System.out.println(days);

        System.out.println("-----------------------------------");

        Weekdays[] cons = Weekdays.values();
        for(Weekdays constant : cons){
            System.out.println(constant);
        }

        System.out.println("-----------------------------------");

       day =  Weekdays.WEDNESDAY;
       System.out.println(day.name());
       System.out.println(day.ordinal());

       System.out.println("--------------------------");

       switch(days){
        case MONDAY:
            System.out.println("A");
            break;

        case TUESDAY:
            System.out.println("B");
            break;
       }
        
    }
}
enum Weekdays{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,STURDAY,SUNDAY;

}
