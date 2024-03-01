public class IsSorted {
    public static void main(String[] args) {
        System.out.println("please enter to array check post");
        int []number =ArrayUtility.InputArray();
        boolean Assen = IsAnscresing(number);
        boolean Desen = IsDecrising(number);
        if (Desen == true || Assen==true) {
            System.out.println("array is sorted ");
        }else System.out.println("Array is not sorted ");
    }

    public static boolean IsDecrising(int []arr){
        int i = 1;
        while (i< arr.length){
            if (arr[i]<arr[i-1]) {
                return false;
            }
            i++;
        }return true;
    }
    public static boolean IsAnscresing(int []arr){
        int i = 1;
        while (i< arr.length){
            if (arr[i]>arr[i-1]) {
                return false;
            }
            i++;
        }return true;
    }
}
