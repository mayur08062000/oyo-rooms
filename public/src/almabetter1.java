import java.util.Scanner;

public class almabetter1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int fun = input.nextInt();
        System.out.println(climbStairs(fun));
    }

    public static int  climbStairs(int n) {
        if (n ==1) return 1;
        if (n == 2) return 2;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
