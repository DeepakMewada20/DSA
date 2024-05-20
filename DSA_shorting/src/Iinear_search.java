public class Iinear_search {
    static int search(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 98, 90, -4, -6, 56};
        int target= 5;
        System.out.println(search(arr,target));
    }
}
