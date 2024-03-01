import java.util.Scanner;

public class PrintReversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = input.nextInt();
        int reversenum = Reversenum(num);
        System.out.println(reversenum);

    }
    public static int Reversenum(int num){
        int result = 0;
        while (num>0){
            int lastdigit = num%10;
            result = result*10+lastdigit;
            num=num/10;
        }
        return result;
    }
}