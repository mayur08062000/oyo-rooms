import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Wlecome to User");
        int[] newarr = ArrayUtility.InputArray();
        long sum = sum(newarr);
        long avarage = Avarage(newarr);
        System.out.println("sum Of array is : "+sum);
        System.out.println("sum Of array is : "+avarage);

    }
    public static long sum(int[] arr){
        int i = 0;
        int sum = 0;
        while (i< arr.length){
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }
    public static long Avarage(int[] arr){
        long sum = sum(arr);
        return sum/ arr.length;
    }
}