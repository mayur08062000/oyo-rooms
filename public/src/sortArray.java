public class sortArray {
    public static void main(String[] args) {
        System.out.println("Welcome to User : ");
        int [] newarr = ArrayUtility.InputArray();
        boolean Sorted1 = Asending(newarr);
        boolean Sorted2 = Desending(newarr);
        if (Sorted2 == false && Sorted1== false) {
            System.out.println("your array is not sorted");
        } else if (Sorted2==true) {
            System.out.println(Sorted2 + " Array is Assending");
        }else  System.out.println(Sorted1 +"  Array IS Desending");
    }

    public static boolean Desending(int[]arr){
        int i = 1;
        while (i< arr.length){
            if (arr[i]<arr[i-1]) {
                return false ;
            }
            i++;
        }
        return true;
    }
    public static boolean Asending(int[]arr){
        int i =1;
        while (i< arr.length){
            if (arr[i]>arr[i-1]) {
                return false;
            }
            i++;
        }

  return true;  }
}