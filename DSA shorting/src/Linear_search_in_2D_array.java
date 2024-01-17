import java.util.Arrays;

public class Linear_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,2},
                {6,8,23,90},
                {12,32,6,7,23}
        };
        int target=7;
        System.out.println(search(arr,target));
        System.out.println(Arrays.toString(search2(arr,target)));

        //we can store this index like this
        int[] ans=search2(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static boolean search(int[][] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int row = 0; row<arr.length; row++){
            for (int colum=0;colum<arr[row].length;colum++){
                if (arr[row][colum]==target){
                    return true;
                }
            }
        }
        return false;
    }
    // we can return index of target element, it is show below
    static int[] search2(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row=0;row<arr.length;row++){
            for (int colum=0;colum<arr[row].length;colum++){
                if (arr[row][colum]==target){
                    return new int[]{row,colum};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
