import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number  :  ");
        int num = input.nextInt();
        System.out.println("your number is "+ ((Isprime(num))?"prime":"not prime"));

    }

    public static boolean Isprime(int num ){
        if (num==2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
            return true;
        }


        return true;
    }
}
