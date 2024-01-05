public class StringBuilder1 {
    public static void main(String[] args) {
        String builder="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder+=ch;
        }
        System.out.println(builder);
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
    }
}