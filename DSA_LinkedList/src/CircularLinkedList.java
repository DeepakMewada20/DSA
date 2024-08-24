public class CircularLinkedList <T>{
    private Node head;
    private Node tail;
    private int size;
    CircularLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(T element){
        head=new Node(element,head);
        if(tail==null){
            tail=head;
        }
        tail.next=head;
        size++;
    }
    public void insertLast(T element){
        if(head==null){
            insertFirst(element);
            return;
        }
        Node node=new Node(element,head);
        tail.next=node;
        tail=node;
        size++;

    }
    public void insertAfter(T after,T element){
        Node tempHead=findElement(after);
        if(tempHead==null){
            System.out.println("Element not found");
            return;
        }
        tempHead.next=new Node(element,tempHead.next);
        size++;
    }
    public void insertBefor(T before,T element){
        if(head.element==before){
            insertFirst(element);
            return;
        }
        Node tempHed=head.next;
        while (tempHed!=head && tempHed.next.element!=before){
            tempHed=tempHed.next;
        }
        if(tempHed.next==head){
            System.out.println("Element not found");
            return;
        }
        tempHed.next =new Node(element,tempHed.next);
        size++;
    }

    public T removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return null;
        }
        T element=head.element;
        if (head==tail){
            head=null;
            tail=null;
            return element;
        }
        head=head.next;
        tail.next=head;
        size--;
        return element;
    }
    private Node findElement(T element){
        if(head.element==element){
            return head;
        }

        Node tempHead=head.next;
        while (tempHead!=head && tempHead.element!=element){
            tempHead=tempHead.next;
        }
        if(tempHead==head){
            return null;
        }
        return tempHead;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
       Node tempHead=head.next;
        System.out.print(head.element+" -> ");
       while (tempHead!=head){
           System.out.print(tempHead.element+" -> ");
           tempHead=tempHead.next;
       }
        System.out.println("END");
    }
    private class Node{
        final private T element;
        private Node next;
        Node(T element,Node next){
            this.element=element;
            this.next=next;
        }
    }
}
