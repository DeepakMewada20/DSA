import java.util.ArrayList;
import java.util.List;

class FindDisappeareaNumber{
    public static void main(String[] args) {
        int[] arr={1,1};
        ArrayList<Integer> list=disappeareaNumber(arr);
        System.out.println(list);
    }
    static ArrayList disappeareaNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct] && (i!=correct)){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]-1==i){
                        swap(arr, i, j);
                        i++;
                        break;
                    }
                }
                if((i>correct)&&(arr[i]==arr[correct])){
                    i++;
                }
            }
            else if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int nums=0;nums<arr.length;nums++) {
            if(arr[nums]-1!=nums){
                list.add(nums+1);
            }
        }
        return list;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}