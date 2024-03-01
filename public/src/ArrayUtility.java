import java.util.Scanner;


public class ArrayUtility {
    public static int[] InputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of elements : ");
        int size = input.nextInt();
        int [] nums = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("please enter the number "+ (i+1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums  ;
    }

    public static void DisplayArr(int [] arr){
        int i = 0;
        while (i< arr.length){
            System.out.print(arr[i]  +"  ");

            i++;
        }
    }

    public static int[][] Input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("please enter the number of coloums : ");
        int coloums = input.nextInt();
        int [][] nums = new int[rows][coloums];
        int i = 0;
        while (i<rows){
            int j=0;
            while (j<coloums){
                System.out.print("Plese enter a element of row "+(i+1)+" of "+
                        (j+1)+" :");
                nums[i][j]=input.nextInt();
                j++;
            }

        i++;
        }
        return nums;
    }



}
