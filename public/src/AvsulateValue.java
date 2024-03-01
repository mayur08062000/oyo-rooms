import java.util.Scanner;

public class AvsulateValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your your number : ");
        int num = input.nextInt();
        int result = num>=0?num:-num;
        System.out.println(result);
    }
}
