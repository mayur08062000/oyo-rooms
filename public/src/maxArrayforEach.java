public class maxArrayforEach {
    public static void main(String[] args) {
        System.out.println("welcome to array sarch program");
        int [] numarr = ArrayUtility.InputArray();
        int Max = Maxnum(numarr);
        System.out.println("maximum num is array is "+Max);

    }
    public static int Maxnum(int [] arr){
       int max = arr[0];
        for (int num:arr){
            if (max<num) {
                max = num;
            }
        }
        return max;
    }
}
