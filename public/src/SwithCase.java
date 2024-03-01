import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please inter A month : ");
        int month = input.nextInt();
        String msg = getMonth(month);
        System.out.println(msg);
    }
    public static String getMonth(int month){
       String monthName = switch (month){
            case 1 -> "january";
           case 2 -> "fab";
           case 3 -> "march";
           case 4 -> "april";
           case 5 -> "may";
           case 6 -> "june";
           case 7 -> "july";
           case 8 -> "aug";
           case 9 -> "sep";
           case 10 -> "oct";
           case 11 -> "nov";
           case 12 -> "dec";
           default -> "Our out of planet";
        };
       return monthName;
    }
}
