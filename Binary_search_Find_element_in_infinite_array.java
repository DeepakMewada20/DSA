class Find_element_in_infinite_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,9,11,13,15,17,18,19,19,19,20,21,23,25,27,29,30};
        int target=27;
        System.out.println(search_element(arr,target));
    }
    static int search_element(int[] arr,int target){
        //first find the range
        //first start size of box 2
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while (target>arr[end]){
            int temp=start;
            //double the range of box
            //end =previous end + sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return applybinarysearch(arr,target,start,end);
    }
    static int applybinarysearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
