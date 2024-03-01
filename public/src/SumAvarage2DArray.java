public class SumAvarage2DArray {
    public static void main(String[] args) {
        System.out.println("Wlc to User : ");
        int  [][] newArr=ArrayUtility.Input2DArray();
        int sum = Sum(newArr);
        double Avg = Avarege(newArr);
        System.out.println("Sum Of the array is "+sum);
     System.out.print("avarage Of the array is "+Avg);

    }

    public static int Sum(int [][]arr){
        int sum = 0;
        int i = 0;
        while (i< arr.length){
            int j = 0;
            while (j<arr[i].length){
                    sum = sum+arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double Avarege(int [][]arr){
        if (arr.length==0) {
            return 0;
        }
        int col = arr.length;
        int rows = arr[0].length;
        int size = col*rows;
        return Sum(arr)/size ;
    }
}
