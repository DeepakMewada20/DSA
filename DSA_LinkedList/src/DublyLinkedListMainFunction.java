public class DublyLinkedListMainFunction {
    public static void main(String[] args) {
        DublyLinkedList<Integer> list=new DublyLinkedList<>();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.printElement();

        list.insertLast(5);
        list.insertLast(55);
        list.printElement();

        list.insertAt(5,90);
        list.insertAt(0,0);
        list.insertAt(1,90);
        list.printElement();

        System.out.println("Size of list = "+list.getSize());

        list.removeFirst();
        list.printElement();

        list.removeLast();
        list.printElement();

        list.removeAtIndex(4);
        list.printElement();

        list.removeElement(6);
        list.printElement();

        list.printRevers();
    }
}
