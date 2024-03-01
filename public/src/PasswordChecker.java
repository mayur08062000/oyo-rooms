import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password ;
        do {
            System.out.println("please enter a paasword : ");
            password = input.next();
        }while (password.length()<8);
        System.out.print("your password is "+password);
    }

}
