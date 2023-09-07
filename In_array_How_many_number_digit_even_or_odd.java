import java.util.Arrays;

public class In_array_How_many_number_digit_even_or_odd {
    public static void main(String[] args) {
        int[] arr={12,-9087,6,8,9088,123,32,89,0};

        System.out.println(evendigites(arr));
        System.out.println(evendigites2(arr));
    }

    static int evendigites2(int[] arr){
        int even_number=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                arr[i]=arr[i]*(-1);
            }
            //convert arr integer to string
            String str=Integer.toString(arr[i]);
            if((str.length()&1)==0){
                even_number++;
            }
        }
        return even_number;
    }

    static int evendigites(int[] arr){
        int even_number=0;
        for (int i=0;i<arr.length;i++){
            if(numberofdigit(arr[i])%2==0){
                even_number++;
            }
        }
        return even_number;
    }
    static int numberofdigit(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
