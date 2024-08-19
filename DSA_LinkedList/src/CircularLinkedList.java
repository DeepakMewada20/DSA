public class CircularLinkedList <T>{
    private Node head;
    private Node tail;
    private int size;
    CircularLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void insertFirst(T element){
        Node node=new Node(element,null);
        node.next = head;
        head = node;
        if (head.next==null){
            node.next=head;
        }
        if(tail==null){
            tail=head;
        }
        size++;
    }

    private class Node{
        private T element;
        private Node next;
        Node(T element,Node next){
            this.element=element;
            this.next=next;
        }
    }
}
