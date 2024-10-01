import java.util.HashSet;

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
        Node tempHead= returnElementCurrentNode(after);
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
    public  void removeElement(T element){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.element==element){
            removeFirst();
            return;
        }
        Node tempHead= returnElementPrivesNode(element);
        if(tempHead==null){
            System.out.println("Element not found");
            return;
        }
        tempHead.next=head;
        tail=tempHead;
    }
    private Node returnElementPrivesNode(T element){
        Node tempHead=head;
        do {
            if(tempHead.next.element==element){
                return tempHead;
            }
            tempHead=tempHead.next;
        }while (tempHead!=head);
        return null;
    }
    private Node returnElementCurrentNode(T element){
        Node tempHead=head;
        do {
            if(tempHead.element==element){
                return tempHead;
            }
            tempHead=tempHead.next;
        }while (tempHead!=head);
        return null;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
       Node tempHead=head;
       do{
           System.out.print(tempHead.element+" -> ");
           tempHead=tempHead.next;
       }while (tempHead!=head);
        System.out.println("END");
    }
    public boolean linkedListCycal(){
        return linkedListCycalChech(head);
    }
    private boolean linkedListCycalChech(Node head){
        HashSet<Node> refrence=new HashSet<>();
        while (head!=null){
            if(!refrence.contains(head)){
                refrence.add(head);
            }
            else {
                return true;
            }
            head=head.next;
        }
        return false;
    }
    public int howManyElement(){
        return howManyElementInCycle(head);
    }
    public void WheareCycleIsStart(){
        System.out.println(returnNodeWhereCycleStart(head));
        System.out.println(head);
    }

    private int howManyElementInCycle(Node head){
        int numberOfElement=0;
        Node slowPointer=head;
        Node fastPointer=head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if (fastPointer==slowPointer){
                do{
                    numberOfElement++;
                    slowPointer=slowPointer.next;
                }while (slowPointer!=fastPointer);
                return numberOfElement;
            }
        }
        return 0;
    }
    private Node returnNodeWhereCycleStart(Node head){
        int numberOfElement=howManyElementInCycle(head);
        Node fisrtPointer=head;
        Node secondPointer=head;
        while (numberOfElement!=0){
            fisrtPointer=fisrtPointer.next;
            numberOfElement --;
        }
        while (fisrtPointer!=secondPointer){
            fisrtPointer=fisrtPointer.next;
            secondPointer=secondPointer.next;
        }
        return fisrtPointer;
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
