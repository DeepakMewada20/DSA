public class Parten6 {
    public static void main(String[] args) {
        parten6(5);
    }
    public static void parten6(int n){
        for (int totalRow=0;totalRow<n*2;totalRow++){
            int rowColumn = totalRow<n ? totalRow : 2*n-totalRow-2;
//            other solution of identify row column
//            int rowColumn;
//            if(totalRow<n){
//                rowColumn=totalRow;
//            }
//            else {
//                rowColumn=n-((totalRow%n)+2);
//            }
            for (int column=0;column<=rowColumn;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
