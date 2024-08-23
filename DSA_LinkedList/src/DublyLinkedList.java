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
        //I am providing head of node when node is created
        //or assign next value in node, on node creation time.
        Node node=new Node(element,null,head);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        head.prives=node;
        head=node;
        size++;
    }
    public void insertLast(T element){
        if(head==null){
            insertFirst(element);
            return;
        }
        //I am providing tail of node when node is created
        //or assign prives value of node is node creation time.
        Node node = new Node(element,tail,null);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAt(int index,T element){
        if(index>size){
            throw new IndexOutOfBoundsException("index "+index+" Linked List size "+size);
        }
        if(index==0){
            insertFirst(element);
            return;
        }
        if(index==size){
            insertLast(element);
            return;
        }
        Node tempHead=treversUsingIndex(index);
        Node node =new Node(element,tempHead.prives,tempHead);
        tempHead.prives.next=node;
        tempHead.prives=node;
        size++;
    }
    public T removeFirst(){
        if(head==null){
            return null;
        }
        T element= head.element;
        if(head==tail){
            head=head.next;
            tail= head;
            return element;
        }
        head=head.next;
        head.prives=null;
        return element;
    }

    public T removeLast(){
        if(head==tail){
            return removeFirst();
        }
        T element=tail.element;
        tail=tail.prives;
        tail.next=null;
        return element;
    }

    public T removeAtIndex(int index){
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node tempHead=treversUsingIndex(index);
        T element = tempHead.element;
        tempHead.prives.next=tempHead.next;
        tempHead.next.prives=tempHead.prives;
        tempHead.prives=null;
        tempHead.next=null;
        return element;
    }
    public boolean removeElement(T element){
        Node tempHead=searchElement(element);
        if(tempHead==null){
            return false;
        }
        tempHead.prives.next=tempHead.next;
        tempHead.next.prives=tempHead.prives;
        tempHead.prives=null;
        tempHead.next=null;
        return true;
    }
    private Node searchElement(T element){
        Node temphead=head;
        while ((temphead!=null)&&(temphead.element!=element)){
            temphead=temphead.next;
        }
        return temphead;
    }
    private Node treversUsingIndex(int index){
        Node tempHead=head;
        for (int i=0;i<index;i++){
            tempHead=tempHead.next;
        }
        return tempHead;
    }

    public void printElement(){
        Node tempNode=head;
        while (tempNode!=null){
            System.out.print(tempNode.element+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println("END");
    }

    public void printRevers(){
        printReversElement(head);
        System.out.println("END");
    }
    private void printReversElement(Node tempHead){
        if(tempHead.next==null){
            System.out.print(tempHead.element+" -> ");
            return;
        }
        printReversElement(tempHead.next);
        System.out.print(tempHead.element+" -> ");
    }
    private class Node{
        final private T element;
        private Node prives;
        private Node next;

        Node(T element,Node prives,Node next){
            this.element=element;
            this.prives=prives;
            this.next=next;
        }
    }
}
