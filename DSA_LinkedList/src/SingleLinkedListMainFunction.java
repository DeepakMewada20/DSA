import java.util.LinkedList;
import java.util.List;

public class SingleLinkedListMainFunction {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.insertFirst("Deepak");
        list.insertFirst("Deepak1");
        list.insertFirst("Deepak2");
        list.insertFirst("Deepak3");
        list.insertFirst("Deepak4");
        list.display();

        list.insertLast("Deepak5");
        list.display();

        list.insertAtPossition(4,"sf");
        list.display();

        System.out.println(list.getSize());

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
