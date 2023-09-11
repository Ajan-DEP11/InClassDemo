public class Demo6 {
    public static void main(String[] args) {

        student s1 =new student(1, "Kasun");
        student s2 =new student(2, "Nadun");
        s2.name= s1.name;
        student s3 = s1;
        s3.id = s2.id;

        System.out.printf("S1: id=%s, name = %s \n",s1.id,s1.name);
        System.out.printf("S2: id=%s, name = %s \n",s2.id,s2.name);
        System.out.printf("S3: id=%s, name = %s \n",s3.id,s3.name);
        
    }
}

class student{
    int id;
    String name;

    public student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
