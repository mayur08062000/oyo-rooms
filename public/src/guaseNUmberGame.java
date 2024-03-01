import java.util.Scanner;

public class guaseNUmberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        double num= Math.random()*5;
        int newnum = (int) Math.floor(num);
        System.out.println(newnum);

        System.out.println("welcome to a game For fun");
        do {
            System.out.print("Please enter Guess number : 0 -5 : ");
            number=input.nextInt();

        }while (newnum!=number);
        System.out.println("You are won the game");
    }
}
