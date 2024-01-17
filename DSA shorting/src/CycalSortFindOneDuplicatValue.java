public class CycalSortFindOneDuplicatValue {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,2};
        System.out.println(duplicatvalue(arr));
    }
    static int duplicatvalue(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            if(arr[i]==arr[correct] && (i!=correct)){
                return arr[i];
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
