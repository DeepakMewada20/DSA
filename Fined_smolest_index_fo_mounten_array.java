public class Fined_smolest_index_fo_mounten_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,7,4,3,0};
        int target=3;
        System.out.println(smolestindex(arr,target));
    }
    static int smolestindex(int[] arr,int target){
        //first we find peack element.
        //and store peack element index. kayoki uske baad ham uski madad se peack element ke right and left me target emement ke index ko search karege.
        int peackelementindex=peackelement(arr);

        //then we find right side of target of peack element
        //ager element nahi milta hai to binarysearch function -1 return karega.
        int index=binarysearch(arr,target,0,peackelementindex);

        //ager binarysearch function -1 return karege to fir hum peack element ke lift hend side me target ko search karege
        if(index==-1){
            index=binarysearch(arr,target,peackelementindex,arr.length-1);
        }
        return index;
    }
    static int peackelement(int[] arr){
        if (arr.length<2){
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<end){
            mid=(start+end)/2;
            //out hava mid of array
            //may be possible it is answer.
            //par hum mid element ke ek mid+1 ke element se compair karte hai.
            //ager mid element mid+1 se bada hai to hamar peack element mid element ke right side me hi hoga or hum end=mid kardege.
            if (arr[mid] > arr[mid+1]) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        //jab loop break hoga to start or end dono hi ek hi jagah par hoge
        //or hum dono me se kisi ko bhi return karva sakte hai
        return start;
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(target<arr[mid]){
            return binarysearch(arr,target,start,mid-1);
        }
        else if(target>arr[mid]) {
            return binarysearch(arr,target,mid+1,end);
        }
        else {
            return mid;
        }
    }
}
