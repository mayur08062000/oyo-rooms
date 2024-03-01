import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number : ");
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.print(Fibonaci(i)+" ");
        }

    }

    public static int Fibonaci(int num ){
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return Fibonaci(num-1)+Fibonaci(num-2);
    }
}
