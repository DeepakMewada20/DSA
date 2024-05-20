package DSA_Recursion;

public class Binary_search_recursion {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8,12,45,67,89};
        int index=binarySearch(arr,2,0,arr.length-1);
        System.out.println(index);

    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        int mid=(start+end)/2;
        if(start>end){
            return -1;      //element not found
        }
        else if (target==arr[mid]) {
            return mid;     //element found
        }
        else {
            if (target < arr[mid]) {
                return binarySearch(arr,target,start,mid-1);   //if element is less then mid element
            }
            else {
                return binarySearch(arr,target,mid+1,end);  //if element is gratter then mid element
            }
        }
    }
}
