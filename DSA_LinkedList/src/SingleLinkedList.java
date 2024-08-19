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
            throw new IndexOutOfBoundsException("index "+index+" size "+size);
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
            Node temphead1 = head;
            for (int i=1;i<index;i++){
                temphead1=temphead1.next;
            }
            Node node = new Node(value, temphead1.next);
            temphead1.next=node;
            size++;

        }
    }

    public T deletFirst(){
        if (head==null){
            return null;
        }
        T element=head.value;
        head=head.next;
        if(head==null){
            tail= null;
        }
        size--;
        return element;
    }
    public T deletLast(){
        if(head==null){
            return null;
        }
        T element=tail.value;
        if((head==tail) && (size==1)){
            return deletFirst();
        }
        Node temphead=head;
        while (temphead.next.next != null){
            temphead=temphead.next;
        }
        temphead.next=null;
        tail=temphead;
        size--;
        return element;
    }
    public boolean detetElement(T element){
        if(head==null){
            return false;
        }
        Node temphead1=head;
        Node temphead2=head;
        while (temphead1!=null && temphead1.value!=element  ){
            temphead2=temphead1;
            temphead1=temphead1.next;
        }
        if(temphead1==null){
            return false;
        }
        else if (head == tail){
            head=temphead1.next;
            tail=temphead1.next;
            size--;
            return true;
        }
        else if(head==temphead1){
            head=temphead1.next;
            size--;
            return true;
        }
        else if(tail==temphead1){
            tail=temphead1.next;
            size--;
            return true;
        }
        temphead2.next = temphead1.next;
        size--;
        return true;

    }

    public T find(T element){
        Node tempHead=head;
        while (tempHead!=null){
            if(tempHead.value==element){
                return tempHead.value;
            }
            tempHead=tempHead.next;
        }
        return null;
    }
    public void display(){
        Node temphead=head;
        while (temphead!=null){
            System.out.print(temphead.value+" -> ");
            temphead=temphead.next;
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
