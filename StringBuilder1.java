public class StringBuilder1 {
    public static void main(String[] args) {
        //String create every time new object
        //because string is unmutebal
        String builder="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder+=ch;
        }
        System.out.println(builder);
        stringBuilder();
    }

    //StringBuilder does not create every time new object, it's modify current object.
    //StringBuilder is use less memory
    public static void stringBuilder(){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.delete(5,9));   //delet char in specific range
        System.out.println(builder.appendCodePoint(97)); //es method se hum string ke end me koi bhi chareter add kar sacte hai using ASCII value
        System.out.println(builder.indexOf("t",3));

    }
}