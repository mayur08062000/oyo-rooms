import java.util.Scanner;

public class Switchcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.print("please enter a our first number :");
        int firstnum = input.nextInt();
        System.out.print("please enter yiur second number : ");
        int secondnum = input.nextInt();
        System.out.print("please enter a operation name  : ");
        String operation = input.next();

        int result = switch (operation){
            case "+"-> firstnum+secondnum;
            case "-"-> firstnum-secondnum;
            case "*"-> firstnum*secondnum;
            case "/"-> firstnum/secondnum;
            case "%"-> firstnum%secondnum;
            default -> -1;
        };
        System.out.println(result);
    }
}
