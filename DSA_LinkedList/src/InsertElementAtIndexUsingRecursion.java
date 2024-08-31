import java.util.HashSet;

public class InsertElementAtIndexUsingRecursion<T extends Comparable<T>>{
    private Node head;
    private int size;
    InsertElementAtIndexUsingRecursion(){
        head=null;
        size=0;
    }
    public void insertFirst(T value){
        Node node=new Node(value,head);
        head=node;
        size++;
    }
    public void insertLast(T element){
        if(head==null){
            insertFirst(element);
            return;
        }
        Node tempHead=head;
        while (tempHead.next!=null){
            tempHead=tempHead.next;
        }
        tempHead.next = new Node(element, null);
        size++;
    }
    public void display(){
        Node temphead=head;
        while (temphead!=null){
            System.out.print(temphead.element+" -> ");
            temphead=temphead.next;
        }
        System.out.println("END");
    }
    public void insetUsingRecursion(int index,T element){
        //this line call kunal kuswal recursion function
        head=insertRecursion(index,element,head);

        //this line call my recursion function
        //insertElementRecursion(element,index,0,head);
    }
    //this function is created by kunal kushwa
    //for insert element at possition (index)
    private Node insertRecursion(int index,T element,Node tempHead){
        if(tempHead==null){
            throw new IndexOutOfBoundsException("List size is "+size+" index is "+(size+index));
        }
        if(index==0){
            Node node=new Node(element,tempHead);
            size++;
            return node;
        }
        tempHead.next=insertRecursion(index-1,element,tempHead.next);
        return tempHead;
    }
    //this recursion function created by me
    //for insert element at possition (index)
    private void insertElementRecursion(T element, int index, int tempIndex,Node tempHead){
        if(tempHead==null){
            throw new IndexOutOfBoundsException("index "+index+" List size "+tempIndex);
            //return;
        }
        if(index==0){
            head=new Node(element,head);
            return;
        }
        if(tempIndex==index){
            tempHead.next=new Node(element,tempHead.next);
            return;
        }
        insertElementRecursion(element,index,tempIndex+1,tempHead.next);
    }

    //remove duplicates in List Method
    public void removeDuplicat(){
        Node tempHead1=head;
        Node tempHead2=head.next;
        while (tempHead2!=null){
            if(tempHead2.element==tempHead1.element){
                tempHead1.next=tempHead2.next;
                size--;
            }
            if(tempHead1.element.compareTo(tempHead2.element)>0){
                tempHead1=tempHead2;
            }
            tempHead2=tempHead2.next;
        }
    }
    public InsertElementAtIndexUsingRecursion<T> margeList(InsertElementAtIndexUsingRecursion<T> list1,InsertElementAtIndexUsingRecursion<T> list2){
        Node list1Head=list1.head;
        Node list2Head=list2.head;
        InsertElementAtIndexUsingRecursion<T> list=new InsertElementAtIndexUsingRecursion<>();
        while (list1Head!=null && list2Head!=null){
            if(list1Head.element.compareTo(list2Head.element)>=0){
                //list.insertFirst(list1Head.element);
                list.insertLast(list1Head.element);
                list1Head=list1Head.next;
            }
            else {
                //list.insertFirst(list2Head.element);
                list.insertLast(list2Head.element);
                list2Head=list2Head.next;
            }
        }
        while (list1Head!=null){
//            list.insertFirst(list1Head.element);
            list.insertLast(list1Head.element);
            list1Head=list1Head.next;
        }
        while (list2Head!=null){
//            list.insertFirst(list2Head.element);
            list.insertLast(list2Head.element);
            list2Head=list2Head.next;
        }
        return list;
    }
    public boolean linkedListCycle(){
        CheckCycalInLinkedList<T> cycle=new CheckCycalInLinkedList<>();
        return cycle.checkCycle(head);
    }
    private boolean linkedListCycleChech(Node head){
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
    class Node{
        final T element;
        Node next;
        Node(T element,Node next){
            this.element=element;
            this.next=next;
        }

        public T getElement() {
            return element;
        }
    }
}
class InsertUsingRecursion{
    public static void main(String[] args) {
        InsertElementAtIndexUsingRecursion<Integer> list=new InsertElementAtIndexUsingRecursion<>();
        InsertElementAtIndexUsingRecursion<Integer> list1=new InsertElementAtIndexUsingRecursion<>();
        InsertElementAtIndexUsingRecursion<Integer> list2=new InsertElementAtIndexUsingRecursion<>();
        list1.insertFirst(1);
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(3);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(12);
        list1.insertFirst(12);
        list1.display();

        list2.insertFirst(6);
        list2.insertFirst(7);
        list2.insertFirst(8);
        list2.insertFirst(9);
        list2.insertFirst(13);
        //list1.removeDuplicat();
        list1.display();

        list= list.margeList(list1,list2);
        list.display();

        System.out.println(list.linkedListCycle());

    }
}

