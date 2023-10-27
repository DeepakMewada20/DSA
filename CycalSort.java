import java.util.Arrays;

public class CycalSort{
    public static void main(String[] args) {
        int[] arr={4,1,2,5,3,7,6};
        System.out.println(Arrays.toString(cycalSort(arr)));
    }
    static int[] cycalSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    } 
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
    }
}