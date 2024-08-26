

public class RemoveDuplicatesFromShoredList <T>{
    public void display(Node temphead){
        while (temphead!=null){
            System.out.print(temphead.value+" -> ");
            temphead=temphead.next;
        }
        System.out.println("END");
    }
    private class Node{
        private T value;
        private Node next;

        public Node(T value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
