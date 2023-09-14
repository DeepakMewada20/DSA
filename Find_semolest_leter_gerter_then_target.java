public class Find_semolest_leter_gerter_then_target {
    public static void main(String[] args) {
        char[] arr={'a','c','f','g','i','k','l','o','r','s','v','y'};
        char target='m';
        System.out.println(semolest_element(arr,target));
        System.out.println(arr[semolest_element(arr,target)]);
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
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid+1; 
            }
        }while (start<=end);
        return start;
    }
}
