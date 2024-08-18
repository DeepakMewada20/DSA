public class SingleLinkedList <T>{

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(T value){
        Node node=new Node(value,null);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(T value){
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value, null);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPossition(int index,T value){
        if(index>size){
            throw new IndexOutOfBoundsException("index "+index+" out of bound Linked List size "+size);
        }
        else {
            if(index==0){
                insertFirst(value);
                return;
            }
            else if ((index==size)&&(head==null)){
                insertLast(value);
                return;
            }
            Node node = new Node(value, null);
            Node tempNode1 = head;
            Node tempNode2=tempNode1;
            int tempIndex = 0;
            while (tempIndex != index) {
                tempNode2=tempNode1;
                tempNode1=tempNode1.next;
                tempIndex++;
            }
            node.next=tempNode1;
            tempNode2.next=node;
            size++;

        }
    }

    public boolean deletAtFirst(){
        //boolean flage = false;
        if (head==null){
            System.out.println("List is empty");
            return false;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return true;
    }

    public boolean deletAtLast(){
        if(head==null){
            System.out.println("List is empty");
            return false;
        }
        if((head==tail) && (size==1)){
            head=head.next;
            tail=head;
            size--;
            return true;
        }
        Node tempNode=head;
        while (tempNode.next.next != null){
            tempNode=tempNode.next;
        }
        tempNode.next=null;
        size--;
        return true;
    }
    public boolean detetElement(T element){
        if(head==null){
            return false;
        }
        Node tempNode1=head;
        Node tempNode2=head;
        while (tempNode1!=null && tempNode1.value!=element  ){
            tempNode2=tempNode1;
            tempNode1=tempNode1.next;
        }
        if(tempNode1==null){
            return false;
        }
        else if (head == tail){
            head=tempNode1.next;
            tail=tempNode1.next;
            size--;
            return true;
        }
        else if(head==tempNode1){
            head=tempNode1.next;
            size--;
            return true;
        }
        else if(tail==tempNode1){
            tail=tempNode1.next;
            size--;
            return true;
        }
        tempNode2.next = tempNode1.next;
        size--;
        return true;

    }
    public void display(){
        Node tempNode=head;
        while (tempNode!=null){
            System.out.print(tempNode.value+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println("END");
    }


    private class Node{
        private T value;
        private Node next;

        public Node(T value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
