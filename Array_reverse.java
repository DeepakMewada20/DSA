import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        Array_reverse ar=new Array_reverse();
        int[] arr={1,2,3,4,5,6,7};
        revers(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void revers(int[] arr){
        int start=0;
        int end=arr.length-1;
        while ((start!=end)||(start<end)){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
