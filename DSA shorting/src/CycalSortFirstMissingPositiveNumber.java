public class CycalSortFirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(firstMissingPositiveNumber(arr));
    }
    static int firstMissingPositiveNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if((arr[i]>0)&&(arr[i]<arr.length)){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        int j;
        for(j=0;j<arr.length;j++){
         if(arr[j]-1!=j){
            return j+1;
         }   
        }
        return j+1;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
