import java.lang.String;
import java.util.*;
public class Two_D_array {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,89},
                {7,8,9}
        };
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr[1]));
    }
}
