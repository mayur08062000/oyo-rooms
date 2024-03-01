public class sumofpositiveNum {
    public static void main(String[] args) {
        int [] numarr = ArrayUtility.InputArray();
        int sum = Sumof(numarr);
        System.out.println(sum);
    }
    public static int Sumof(int []arr ){
        int sum = 0;
        for (int num:arr){
            if (num<0) {
                continue;
            }
            sum+=num;
        }
        return sum;
    }
}
