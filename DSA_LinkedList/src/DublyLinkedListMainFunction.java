public class DublyLinkedListMainFunction {
    public static void main(String[] args) {
        DublyLinkedList<Integer> list=new DublyLinkedList<>();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.display();
    }
}
