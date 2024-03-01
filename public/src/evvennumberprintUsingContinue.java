import java.util.Scanner;

public class evvennumberprintUsingContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please ennter a number  : ");
        int [][] nearr = ArrayUtility.Input2DArray();
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
