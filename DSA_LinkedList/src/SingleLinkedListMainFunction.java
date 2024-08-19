
public class SingleLinkedListMainFunction {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.insertFirst("Deepak");
        list.insertFirst("Deepak1");
        list.insertFirst("Deepak2");
        list.insertFirst("Deepak3");
        list.display();
        System.out.println(list.find("Deepak"));
        System.out.println(list.deletFirst());


    }
}
