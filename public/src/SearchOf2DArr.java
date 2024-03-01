import java.util.Scanner;

public class SearchOf2DArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to 2D search");
        int [][]numArr = ArrayUtility.Input2DArray();
        System.out.print("Please enter a number to sarch u want");
        int Searchnum= input.nextInt();
        boolean IsFound = Sarch(numArr,Searchnum);
        if (IsFound) {
            System.out.println(Searchnum+"  number is found in Arrays");
        }else System.out.println(Searchnum+"  number is not found All Arrays");
    }

    public static boolean Sarch(int[][]arr,int num){
        int i = 0;
        int count=0;
        while (i< arr.length){
            int j = 0;
            while (j< arr[i].length){
                if (arr[i][j]==num) {
                    count++;
                    return true;

                }
                j++;
            }


            i++;
        }
        return false;
    }
}
