public class Find_semolest_leter_gerter_then_target {
    public static void main(String[] args) {
        char[] arr={'a','c','f','g','i','k','l','o','r','s','v','y'};
        char target='l';
        //first method
        System.out.println(arr[semolest_element(arr,target)]);

        //second method
        System.out.println(semolest_element2(arr,target));

        //using recorsion
        System.out.println(semolest_element3(arr,target,0,arr.length-1));
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

    //other solution
    static char semolest_element2(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        int mid;
        do {
            mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }while (start<=end);
        return arr[start%arr.length];
    }

    //using recortion
    static char semolest_element3(char[] arr,char target,int start,int end){
        if(start>end){
            return arr[start%arr.length];
        }
        int mid=(start+end)/2;
        if(target<arr[mid]){
            return semolest_element3(arr,target,start,mid-1);
        }
        else {
            return semolest_element3(arr,target,mid+1,end);
        }
    }
}
