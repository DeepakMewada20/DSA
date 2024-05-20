public class Parten11 {
    public static void main(String[] args) {
        parten11(5);
    }
    public static void parten11(int n){
        for (int row=1;row<2*n;row++){
            //this for loop for space
            int colum=row>n ? 2*n-row : row;
            for (int space=n;space>colum;space--) {
                System.out.print("  ");
            }
            //then we call recursion for print like '1 2 3 4 3 2 1'.
            recursion(colum);
            System.out.println();
        }
    }
    public static void recursion(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        recursion(n-1);
        System.out.print(n+" ");
    }
}
