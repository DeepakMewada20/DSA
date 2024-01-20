public class Parten9 {
    public static void main(String[] args) {
        parten8(5);
    }
    public static void parten8(int n){
        for(int row=0;row<(2*n-1);row++){
            for (int column=0;column<n;column++){
                if((column<=n-(row+2))||(row-n>=column)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
