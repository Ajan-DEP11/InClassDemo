public class Demo5 {

    int x;

    public Demo5(int x){
        this.x = x;
    }

    
    void print(){
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        Demo5 ref1 = new Demo5(5);
        Demo5 ref2 = new Demo5(10);
        Demo5 ref3 = new Demo5(-8);
        ref1.print();
        ref2.print();
        ref3.print();

    }
}
