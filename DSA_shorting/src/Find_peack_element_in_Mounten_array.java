import java.util.Arrays;

public class Find_peack_element_in_Mounten_array {
    public static void main(String[] args) {
        int[] arr={1,3,1};
        System.out.println(arr[peackelement(arr)]);
    }
    static int peackelement(int[] arr){
        if (arr.length<2){
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<end){
            mid=(start+end)/2;
            //out hava mid of array
            //may be possible it is answer.
            //par hum mid element ke ek mid+1 ke element se compair karte hai.
            //ager mid element mid+1 se bada hai to hamar peack element mid element ke right side me hi hoga or hum end=mid kardege.
            if (arr[mid] > arr[mid+1]) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        //jab loop break hoga to start or end dono hi ek hi jagah par hoge
        //or hum dono me se kisi ko bhi return karva sakte hai
        return start;
    }
}
