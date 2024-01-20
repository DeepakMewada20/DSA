public class Parten7 {
    public static void main(String[] args) {
        parten7(5);
    }
    public static void parten7(int n){
        for(int row=0;row<n;row++){
            for (int column=0;column<n;column++){
                if(column<=n-(row+2)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
