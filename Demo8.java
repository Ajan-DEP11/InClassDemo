import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        dep d1 = new dep();
        //dep d2 = new dep();
        //dep d3 = new dep();
        //dep d4 = new dep();

        d1.push(10);
        d1.push(20);
        d1.push(30);
        d1.push(40);

        d1.print();
        //d2.print();
       // d3.print();
       // d4.print();
        
    }
}
class dep{
    int[] number = new int[0];
    public dep(){

    }
    
    void push(int num){
        
        int[] temp = new int[number.length +1]; 
        for(int i = 0;i<number.length;i++){
            temp[i] = number[i];
        }
        temp[temp.length-1] = num;
        number = temp;
        
        System.out.println();
    } 
    void pop(){}
    int peek(){return 0;}
    void print(){
        System.out.println(Arrays.toString(number));
    }

}
