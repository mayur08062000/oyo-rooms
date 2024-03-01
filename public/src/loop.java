import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("print Eveen Number And odd Number");
        int number = input.nextInt();
        Object nums= OddNumber(number);
        System.out.println(nums);
    }
    public static int OddNumber(int num){
        int i = 0;
        while (i<num-1){

            System.out.print(i);
            i+=2;
        }
        return i;
    }
}