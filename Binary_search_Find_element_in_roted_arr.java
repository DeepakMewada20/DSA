public class Binary_search_Find_element_in_roted_arr {
    public static void main(String[] args) {
        int[] arr={12,13,15,17,1,3,5,6,7,9,10,11};
        int target=3;
        System.out.println(search_element(arr,target));
    }
    static int search_element(int[] arr,int target){
        int indexOfpeackelement=largest_element(arr);
        if(arr[indexOfpeackelement]==target){
            return indexOfpeackelement;
        }
        else {
            int index = binary_search(arr, target, 0, indexOfpeackelement-1);
            if (index == -1) {
                index = binary_search(arr, target, indexOfpeackelement+1, arr.length - 1);
            }
            return index;
        }
    }
    static int largest_element(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            //hamar roted arr me peack element ke tono side assending order me sorted array, like this [12,13,15,17,1,3,5,6,8,9,10]
            //par peack element or uske jest bad ka element hi desending order me hai,
            //isliye ager hum mid element nikale or uske jest baad vale element se compare kare to yani [mid +1] se.
            //to [mid] element bada hoga or [mid+1] element chota hoga isliye mid hi hamare array ka peack element ya sabse bada element hoga.
            if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    static int binary_search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]<target){
            return binary_search(arr,target,mid+1,end);
        }
        else if(arr[mid]>target){
            return binary_search(arr,target,start,mid-1);
        }
        else {
            return mid;
        }
    }
}
