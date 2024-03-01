import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class DeleteOneNumber {
    public static void main(String[] args) {
        System.out.println("Wlc to Delete Arr Fn : ");
        Scanner input = new Scanner(System.in);
        int [] newarr = ArrayUtility.InputArray();
        System.out.println("enter which number is delete");
        int deletenum = input.nextInt();
        int [] Result = DeleteNum(newarr,deletenum);
        System.out.println("new array is here");
        ArrayUtility.DisplayArr(Result);

    }
    public static int [] DeleteNum(int[] arr,int num){
        int Occ =checkNumber.Counter(arr, num);
        if (Occ == 0) {
            return arr;
        }
        int newSize = arr.length-Occ;
        int[] newArr = new int[newSize];
        int i = 0, newArrayindex =0;
        while (i < arr.length){
            if (arr[i] != num) {
             newArr[newArrayindex]=arr[i];
                newArrayindex++;
            }
            i++;
        }
        return newArr;
    }

}
