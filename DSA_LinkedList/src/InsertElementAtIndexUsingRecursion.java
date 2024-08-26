import org.w3c.dom.Node;

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
        T compairElement= head.element;
        while (tempHead2!=null){
            if(tempHead2.element==compairElement){
                tempHead1.next=tempHead2.next;
            }
            if(compairElement.compareTo(tempHead2.element)>0){
                compairElement=tempHead2.element;
                tempHead1=tempHead2;
            }
            tempHead2=tempHead2.next;
        }
    }

    private class Node{
        private T element;
        private Node next;
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
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();

        list.removeDuplicat();
        list.display();
    }
}

