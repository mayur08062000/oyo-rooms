import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score ");
        int marks = input.nextInt();
        String category = marks>=80?"high":(marks>=50 ? "modarate": "low");
        System.out.println(category);
    }
}
