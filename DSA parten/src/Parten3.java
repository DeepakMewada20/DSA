public class Parten3 {
    public static void main(String[] args) {
        parten3(5);
    }
    public static void parten3(int n){
        if(n==0){
            return;
        }
        for (int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        parten3(n - 1);
    }
}
