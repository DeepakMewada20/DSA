public class Binary_search {
    private static int[] arr;
    private static int target;

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=56;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        Binary_search.arr = arr;
        Binary_search.target = target;
        int start=0;
        int end=arr.length-1;
        int mid;
        do {
             mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }while (start<=end);
        return -1;
    }
}
