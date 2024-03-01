import java.util.Scanner;

public class CheckNumIsPende {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("enter your Number : ");
        int num = input.nextInt();
        int num2=  Reversenum(num);
        if (num2 == num) {
            System.out.println("number is pendroriliam");
        }else System.out.println("number are not Pendoriliam");

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