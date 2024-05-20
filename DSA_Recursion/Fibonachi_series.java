package DSA_Recursion;

public class Fibonachi_series {
    public static void main(String[] args) {
        System.out.println(fibonachi(4));
    } 
    public static int fibonachi(int n){
        if(n<2){
            return n;
        }
//        int ans=fibonachi(n-1)+fibonachi(n-2);
//        //System.out.println(ans);
//        return ans;
        return fibonachi(n-1)+fibonachi(n-2);
    }
}
