public class Find_semolest_element_in_array_his_equeal_and_greter_then_target {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13,15,17,19};
        int target=20;
        System.out.println(semolest_element(arr,target));
        //System.out.println(arr[semolest_element(arr,target)]);
    }
    static int semolest_element(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
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
        return mid;
    }
}
