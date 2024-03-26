public class oops_02 {

    /// This is the example of Access Modifiers
    public static void main(String[] args) {
        Bank myAcc = new Bank();
        myAcc.username = "Sushil";
        myAcc.setPassword("23231321");
        // System.out.println(myAcc.pwd);
        System.out.println(myAcc.username);
        
    }
    
}
class Bank{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}
