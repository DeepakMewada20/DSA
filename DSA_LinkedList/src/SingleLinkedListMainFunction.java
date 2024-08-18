import java.util.LinkedList;
import java.util.List;

public class SingleLinkedListMainFunction {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.insertFirst("Deepak");
        list.display();

        System.out.println(list.detetElement("Deepak1"));



//        List<String> l=new LinkedList<>();
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        l.add("1");
//
//        System.out.println(l);
//        l.remove("1");
//        System.out.println(l);


    }
}
