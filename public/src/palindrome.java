import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please inter a value :  ");
        String str = input.next();
        System.out.println((Palindrome(str)));
    }
    public static String Palindrome(String str){
        if (str.length() <= 1) {
            return "This is Palindrome";
        }
int lastPosition = str.length()-1;
        if (str.charAt(0) != str.charAt(lastPosition)) {
            return "this is not palindrome";
        }
        String newstr = str.substring(1,lastPosition);

        return Palindrome(newstr);
    }


}
