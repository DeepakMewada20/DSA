public class Parten12 {
    public static void main(String[] args) {
        parten12(4);
    }
    public static void parten12(int n){
        for (int row =1;row<2*n;row++){
            int column=row>n ? row%n+1 : (n-row)+1;
            recursionParten12(n,column);
            System.out.println();
        }
    }
    public static void recursionParten12(int n,int i){
        if (n==0){
            return;
        }
        if(n>=i){
            System.out.print(n+" ");
        }
        else {
            System.out.print(i+" ");
        }
        recursionParten12(n-1,i);
        if(n>1) {
            if (n >= i) {
                System.out.print(n + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    // using loop

    public static void loopPattern12(int n){
        for (int row=0;row<2*n-1;row++){
            for (int column=0;column<2*n-1;column++){

            }
        }
    }
}
