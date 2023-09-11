public class Find_semolest_leter_gerter_then_target {
    public static void main(String[] args) {
        char[] arr={'a','c','g','y'};
        char target='b';
        System.out.println(semolest_element(arr,target));
    }
    static int semolest_element(char[] arr,int target){
        if(target>=arr[arr.length-1]){
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        int mid;
        do {
            mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }while ((arr[mid]!=target)&&(start<=end));
        return return_index(arr,mid,target);
    }
    static int return_index(char[] arr,int mid,int target){
        if(arr[mid]==target){
            return mid+1;
        }
        else {
            return mid;
        }
    }
}
