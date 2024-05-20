public class Parten10 {
    public static void main(String[] args) {
        parten10(5);
    }
    public static void parten10(int n){
        for (int i=1;i<=n;i++){
            //this for loop for space
            for (int j=0;j<n-i;j++) {
                System.out.print("  ");
            }
            //then we call recursion for print like '1 2 3 4 3 2 1'.
            recursion(i,1);
            System.out.println();
        }
    }
    public static void recursion(int n,int i){
        if (i==n){
            System.out.print(n+" ");
            return;
        }
        System.out.print(i%n+" ");
        recursion(n,i+1);
        System.out.print(i+" ");
    }
}
