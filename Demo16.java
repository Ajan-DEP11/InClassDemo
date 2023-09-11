public class Demo16 {
    public static void main(String[] args) {
        Animal pet = new Dog("Boola");
        pet.eat();
        
    }
}

class Animal{
    String name = "Animal";
    void eat(){
        System.out.printf("%is eating \n",name);
    }
}

class Dog extends Animal{
    String name;
    
    public Dog (String name){
        this.name = name;
    }
    void eat(){
        super.eat();
        System.out.printf("% is eating\n",name);
        System.out.println(super.name);
    }
}
