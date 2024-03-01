import java.util.Scanner;

public class tableusingforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number number u can create a table :  ");
        int num = input.nextInt();
        table(num);
    }
    public static void table(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println( num+"  x " + i +" = "+(i*num));
        }
    }
}
