public class Parten2 {
    public static void main(String[] args) {
        parten2(5);
    }
    public static void parten2(int n){
        for (int row=0;row<n;row++){
            for (int coloum=0;coloum<n;coloum++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
