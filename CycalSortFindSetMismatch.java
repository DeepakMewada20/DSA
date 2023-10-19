import java.util.Arrays;

public class CycalSortFindSetMismatch {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,2,5};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }
    static int[] setMismatch(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{j,j+1};
            }
        }
        return new int[]{-1};
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
