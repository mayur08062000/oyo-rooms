public class sumOftwodiagonald2D {
    public static void main(String[] args) {
        System.out.println("Welcome ..................");
        int [][]newArr =ArrayUtility.Input2DArray();
       long sunofall = SumofDiagonal(newArr);
         System.out.println(sunofall);
    }
    public static long SumofDiagonal(int[][]arr){
        long left = SumofLeftDiagnol(arr);
        long rigth = SumofRightDiagnol(arr);
        long sum = left+rigth;
        if (arr.length%2 != 0) {
            int index = arr.length/2;
            sum = sum-arr[index][index];
        }
        return sum;
    }
    public static int SumofRightDiagnol(int [][]arr){
        int i = 0;
        int sum = 0;
        while (i< arr.length){
            int j =0;
            while (j<arr[i].length){
                if (arr[i]==arr[j]) {
                    sum+=arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
    public static int SumofLeftDiagnol(int [][]arr){
      int sum = 0;
      int i = 0;
      while (i< arr.length){
          int col = arr.length-1-i;
          sum = sum+arr[i][col];
          i++;
      }
      return sum;
    }
}
