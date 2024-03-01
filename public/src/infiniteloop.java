import java.util.Scanner;

public class infiniteloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plaese inter a password of exit loop :  ");
        while (true){
            System.out.print("enter A password  : ");
            String str = input.next();
            if (str.equals("exit")) {
                break;
            }
            System.out.println("try again and .......");
        }
        System.out.println("u guess the write password");
    }

}
