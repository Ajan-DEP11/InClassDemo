public class Demo2 {

    static int x = 10; //this is in the class object in heap method area. 
    public static void main(String[] args) {

        int x = 20; // this is in the stack so if we run the programme out put is 20. never print the 10 thats because of the shadowing.

        System.out.println(x);
        System.out.println(Demo2.x); //calls to x withe Demo2's memory location
    }
    
}
