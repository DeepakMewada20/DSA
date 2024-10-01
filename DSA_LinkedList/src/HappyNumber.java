import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber h=new HappyNumber();
        int n=5;
        System.out.println(h.happyNumber(n));
        System.out.println(h.happyNumberKunalKuswah(n));
    }
    private int findSqure(int n){
        int squireSum=0;
        while (n!=0){
            int unitNum=n%10;
            n=n/10;
            squireSum=squireSum+(unitNum*unitNum);
        }
        return squireSum;
    }
    private boolean happyNumber(int n){
        HashSet<Integer> squreSum=new HashSet<>();
        do {
            squreSum.add(n);
            n = findSqure(n);
            if(squreSum.contains(n)){
                return false;
            }
        }while (n!=1);
        return true;
    }
    private boolean happyNumberKunalKuswah(int n){
        int slow=n;
        int fast=n;
        do {
            slow=findSqure(slow);
            fast=findSqure(findSqure(fast));
        }while (slow!=fast);
        return slow == 1;
    }
}