import java.util.HashMap;
import java.util.Scanner;

public class AccountLogger {
    private AccountMaker accountMaker = new AccountMaker();
    private Scanner input = new Scanner(System.in);
    HashMap<String, String> loginDetails = accountMaker.getLoginDetails();
    private String login, password;



    void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    boolean checkIfLoginDataIsIncorrect(HashMap<String, String> loginDetails) {
        System.out.println("You have entered login = "+login);
        System.out.println("You have entered password = "+password);
        if (this.loginDetails.containsKey(login) && this.loginDetails.get(login).equals(password)) {
            System.out.println("You've logged in.");
            return false;
        }
        else
            System.err.println("Bad login or password");
        return true;
    }
}