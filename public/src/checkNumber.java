import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        System.out.println("this Is check number problem");
        Scanner input = new Scanner(System.in);
        int []newArray = ArrayUtility.InputArray();
        System.out.print("which NUMber Found in Array : ");
        int num = input.nextInt();
        int occura = Counter(newArray,num);
        System.out.println("your element was found  "+occura+" time in the array");
    }
    public static int Counter(int[] arr,int num){
        int count = 0;
        int i = 0;
        while (i< arr.length){
            if (arr[i]==num ){
count++;
            }

            i++;
        }
        return count;
    }
}