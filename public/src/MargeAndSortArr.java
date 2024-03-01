public class MargeAndSortArr {
    public static void main(String[] args) {
        System.out.println("Welcome to sort Arr and marge arr program");
        int []arr1=ArrayUtility.InputArray();
        int[]arr2 = ArrayUtility.InputArray();
        int []result = margr(arr1,arr2);
        System.out.println("your marger array is ready :");
        ArrayUtility.DisplayArr(result);

    }
public static int[]margr(int[]arr1,int[]arr2){
        int size = arr1.length+ arr2.length;
        int[] result = new int [size];
        int i = 0, j=0,k=0;
        while (i < arr1.length||j < arr2.length){
            if (j==arr2.length || (i < arr1.length && arr1[i]<arr2[j])) {
                result[k]=arr1[i];
                i++;
                k++;
            }else {
                result [k] = arr2[j];
                j++;
                k++;
            }
        }

        return result;
}



}
