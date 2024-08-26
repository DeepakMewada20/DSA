public class CircularLinkedListMainFunction {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list=new CircularLinkedList<>();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(14);
        list.display();

        list.insertLast(56);
        list.display();

        list.insertAfter(8,76);
        list.display();

        list.insertBefor(14,90);
        list.display();

        list.removeFirst();
        list.display();

        list.removeElement(8);
        list.display();
    }
}
