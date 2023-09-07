public class Max_value_in_2D_array {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,2},
                {6,8,23,90},
                {12,32,6,7,23}
        };
        int mex=Integer.MIN_VALUE;
        for (int[] row:arr){
            for (int element:row){
                if (mex<element){
                    mex=element;
                }
            }
        }
        System.out.println(mex);
    }
}
