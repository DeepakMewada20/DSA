public class DublyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;
    DublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(T element){
        Node node=new Node(element,null,head);
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        head.prives=node;
        head=node;
    }
    public void display(){
        Node tempNode=head;
        while (tempNode!=null){
            System.out.print(tempNode.element+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println("END");
    }
    private class Node{
        private T element;
        private Node prives;
        private Node next;

        Node(T element,Node prives,Node next){
            this.element=element;
            this.prives=prives;
            this.next=next;
        }
    }
}
