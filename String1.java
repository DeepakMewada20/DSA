public class String1 {
    public static void main(String[] args) {

        System.out.println((3%2==0) ? "even" : "odd");

        Integer num=new Integer(67);
        System.out.println(num.toString());
        
        //String array
        String[] arr={"deepak","Deepak"};
        System.out.println(arr[0].charAt(0));

        String a="deepak";
        String b="deepak";
        // it is give true because a and b both refreance veriable point same object "deepak"
        System.out.println(a==b);

        String c=new String("mewada");
        String d=new String("mewada");

        //it is give flase because a and b both refreance veriable point differante object "mewada" 
        System.out.println(c==d);
        //it is give flase because == is a opreater

        //it is give true bacause c.equals are method  
        System.out.println(c.equals(d));
    }
}
