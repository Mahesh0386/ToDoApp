import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AccountMaker accountMaker = new AccountMaker();
        AccountLogger accountLogger = new AccountLogger();

        System.out.println("What do you wanna to do?");
        System.out.println("1. Add Account 2. Log into my account");

        boolean loopIsTrue = true;
        while (loopIsTrue) {
            try {
                int option = input.nextInt();
                if (option >= 1 && option <= 2) {
                    switch (option) {
                        case 1:
                            accountMaker.inputLoginAndPassword();
                            accountMaker.createAccount();
                            loopIsTrue = false;
                            System.out.println("Now let's log into you account.");
                        case 2:
                            loopIsTrue = true;
                            while (loopIsTrue) {
                                accountLogger.inputLoginAndPassword();
                                if (!accountLogger.checkIfLoginDataIsIncorrect()) {
                                    loopIsTrue = false;
                                } else {
                                    loopIsTrue = true;
                                }
                            }
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You've inputed something wrong!");
                System.out.println("What do you wanna to do?");
                System.out.println("1. Add Account 2. Log into my account");
                input.next();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
