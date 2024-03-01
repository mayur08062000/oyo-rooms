public class revareseArray {
    public static void main(String[] args) {
        System.out.println("Wlc to Reverse Array Program : ");
        int [] newArr = ArrayUtility.InputArray();
        ReverseArr(newArr);
        System.out.println("your reverse arr is here : ");
        ArrayUtility.DisplayArr(newArr);
    }
    public static void ReverseArr(int [] arr){
int i =0;
while (i< arr.length/2){
    int swap = arr[i];//1,
    arr[i]=arr[(arr.length-1)-i];//i =5
    arr[(arr.length-1)-i] =swap;//i[5]==i[1]
    i++;
}
    }
}
