import java.util.Arrays;

public class Linear_search_in_string {
    public static void main(String[] args) {
        String name="Deepak Mewada";
        char target='w';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search(String name,char target){
        if(name.isEmpty()){
            return false;
        }
        //toCharArray method use to divede sering to charter
        for (char ch: name.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
