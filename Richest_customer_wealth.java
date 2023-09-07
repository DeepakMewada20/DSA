public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] customer_welth={
                {1,4,2},
                {16,12,8},
                {8,0,23}
        };
        System.out.println(highest_wealth(customer_welth));
    }
    static int highest_wealth(int[][] customer_wealth){
        int highest_wealth=0;
        for (int i=0;i<customer_wealth.length;i++){
            int single_customer_wealth=0;
            for (int j=0;j<customer_wealth[i].length;j++){
                single_customer_wealth+=customer_wealth[i][j];
            }
            if(highest_wealth<single_customer_wealth){
                highest_wealth=single_customer_wealth;
            }
        }
        return highest_wealth;
    }
}
