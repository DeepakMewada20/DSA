public class Parten4 {
    public static void main(String[] args) {
        parten4(5);
    }
    public static void parten4(int n){
        if(n==0){
            return;
        }
        parten4(n-1);
        for (int coloum=1;coloum<=n;coloum++){
            System.out.print(coloum+" ");
        }
        System.out.println();
    }
}
