import java.util.Arrays;
class Find_accrence_method{
        int[] accrence(int[] arr,int target){
            int[] index={-1,-1};
            index[0]=findaccrenc(arr,target,true);
            if (index[0]!=-1) {
                index[1]= findaccrenc(arr, target, false);
            }
            return index;
    }
    static int findaccrenc(int[] arr,int target,boolean findstartindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
public class Find_first_and_last_accrence_of_element_in_array {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,7,7,9,11,13,14,24};
        int target=24;

        Find_accrence_method a2=new Find_accrence_method();
        System.out.println(Arrays.toString(a2.accrence(arr,target)));
    }
}
