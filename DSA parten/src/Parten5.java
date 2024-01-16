public class Parten5 {
    public static void main(String[] args) {
        parten5(5);
    }
    public static void parten5(int n){
        //final int noOfRow=n;
        if(n==0){
            return;
        }
        for (int i=n;i>=0;i--){
            System.out.print("* ");
        }
        System.out.println();
        parten5(n - 1);
        for (int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
