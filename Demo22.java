import java.time.LocalDateTime;

public class Demo22 {
    public static void main(String[] args) {
        User adminUser1 = new AdminUser("Prasad", "12345");
        User adminUser2 = new AdminUser("Kasun", "1234768");
        User guestUser3 = new GuestUsser("Nadun", "16459");

          adminUser1.Login();
          adminUser2.Login();
          guestUser3.Login();
        
    }
}
 class User{
    String username;
    String password;
    String role;
    boolean Logged;

    public void Login(){
        System.out.printf("%s logged in \n",username);
        Logged = true;

    }

    public void Logout(){
        if(Logged){
            System.out.printf("%s logged out \n",username);
        }else{
            System.out.println("user hs not logged in ");
        }
    }

    public void printUserDetails(){
        System.out.printf("username =%s,password = %s, role= %s \n",username,password,role);
    }

 }

 class AdminUser extends User{

    private String[] passwords = {"IJSE_12345","IJSE_1234768"};
    
    public AdminUser(String username,String password){
        this.username= username;
        this.password = password;
        this.role = "ROLE_ADMIN";
    }
    public void Login(){
       for(String password : passwords){
        if(password.equals(this.password)){
            System.out.printf("%s logged in at: %s \n",username,LocalDateTime.now());
            return;
        }
       }
    }

 }

 class GuestUsser extends User{
    private static final String  GUEST_PASSWORD = "GUEST_16459";

public GuestUsser(String username,String password){
        this.username= username;
        this.password = password;
        this.role = "ROLE_GUEST";
    }
    @Override

    public void Login(){
      
        if(password.equals(GUEST_PASSWORD)){
            System.out.printf("%s logged in at: %s \n",username,LocalDateTime.now());
            return;
        }else {
            System.out.println("Inavalid Login");
        }
       

    }


 }