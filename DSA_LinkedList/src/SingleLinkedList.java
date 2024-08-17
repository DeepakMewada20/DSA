public class SingleLinkedList <T>{

    private Node head=null;
    private Node tail=null;
    private int size;

    public SingleLinkedList(){
        this.size=0;
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
        Node node=new Node(value,null);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtPossition(int index,T value){
        if(index>size){
            throw new IndexOutOfBoundsException("index "+index+" out of bound Linked List size "+size);
        }
        else {
            if(index==size){
                insertLast(value);
            }
            else if(index==0){
                insertFirst(value);
            }
            else {
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
