public class Parten1 {
    public static void main(String[] args) {
        parten1(6);
    }
    public static void parten1(int n){
        for (int row=0;row<n;row++){
            for (int coloum=0;coloum<=row;coloum++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
