import java.util.ArrayList;
import java.util.List;

class FindDisappeareaNumber{
    public static void main(String[] args) {
        FindDisappeareaNumber2 fd2=new FindDisappeareaNumber2();
        int[] arr={1,3,5,2,1,3,8,7,1};
        ArrayList<Integer> list=disappeareaNumber(arr);
        ArrayList<Integer> list2=fd2.disappeareaNumber(arr);
        System.out.println(list);
        System.out.println(list2);
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
        ArrayList<Integer> list=howManyNumberIsDisappeare(arr);
        return list;
    }
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static ArrayList howManyNumberIsDisappeare(int[] arr){
          ArrayList<Integer> list=new ArrayList<>();
        for (int nums=0;nums<arr.length;nums++) {
            if(arr[nums]-1!=nums){
                list.add(nums+1);
            }
        }
        return list;
    }
}
class FindDisappeareaNumber2{
    static ArrayList disappeareaNumber(int[] arr){
        FindDisappeareaNumber fd=new FindDisappeareaNumber();
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                fd.swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> list=fd.howManyNumberIsDisappeare(arr);
        return list;
    }
} 