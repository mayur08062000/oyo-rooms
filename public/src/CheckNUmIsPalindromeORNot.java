public class CheckNUmIsPalindromeORNot {
    public static void main(String[] args) {
        System.out.println("welcome to  Check number is palindrome or not");
        int [] newArr = ArrayUtility.InputArray();
        boolean Palindrome=CheckNumArr(newArr);
        if (Palindrome) {
            System.out.println("your number is palindrome");
        }else System.out.println("Your Number is not palindrome");
    }

    public static boolean CheckNumArr (int [] arr){
        int i = 0;
        while (i < arr.length/2){
            if (arr[i] == arr[(arr.length-1)-1]){
                return true;
            }
            i++;
        }
        return false;
    }
}
