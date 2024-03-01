import java.util.Scanner;

public class occrancesinArr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array sarch program");
        int [] numarr = ArrayUtility.InputArray();
        System.out.println("please enter a number u want to saerch in arr : ");
        int sarch = input.nextInt();
        int Max = Maxnumocc(numarr,sarch);
        System.out.println(" num occ is array is "+Max);

    }
    public static int Maxnumocc(int [] arr,int num1){
        int max = 0;
        for (int num:arr){
            if (num1==num) {
                max++;
            }
        }
        return max;
    }
}
