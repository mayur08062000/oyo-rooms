public class MaxandMin {
    public static void main(String[] args) {
        System.out.println("Check Minimun And Maximun numbers in array");
        int []newarr = ArrayUtility.InputArray();
        int max =Max(newarr);
        int Min = Min(newarr);
        System.out.println("max "+max);
        System.out.print("min "+Min);
    }
    public static int Max(int[]arr){
        int max = arr[0];
        int i = 0;
        while (i< arr.length){
            if (arr[i]>max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int Min(int[]arr){
        int min = arr[0];
        int i = 0;
        while (i< arr.length){
            if (arr[i]<min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}