public class Parten1 {
    public static void main(String[] args) {
        parten(6);
    }
    public static void parten(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
