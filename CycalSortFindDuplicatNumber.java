import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class FindDuplicatNumber{
    public HashSet duplicatNumber(int[] arr){
        HashSet<Integer> number=new HashSet<>();
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct] && (i!=correct)){
                number.add(arr[i]);
                i++;
            }
            else if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        return number;
    }
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
public class CycalSortFindDuplicatNumber {
    public static void main(String[] args) {
        FindDuplicatNumber dn=new FindDuplicatNumber();
        int[] arr={3,4,1,2,3};
        HashSet<Integer> number=dn.duplicatNumber(arr);
        System.out.println(number);
    }
}
