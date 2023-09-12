public class Demo22 {
    public static void main(String[] args) {
        
    }
}
 class User{
    String username;
    String password;
    String role;
    boolean isLogged;

    public void Login(){
        System.out.printf("%s logged in \n",username);
        isLogged = true;

    }

    public void Logout(){
        if(isLogged){
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
    public AdminUser(String username,String password){
        this.username= username;
        this.password = password;
        this.role = "ROLE_ADMIN";
    }

 }

 class GuestUsser extends User{
public GuestUsser(String username,String password){
        this.username= username;
        this.password = password;
        this.role = "ROLE_GUEST";
    }


 }