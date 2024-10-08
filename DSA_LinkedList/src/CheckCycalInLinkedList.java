
public class CheckCycalInLinkedList<T extends Comparable<T>>{
    public boolean checkCycle(InsertElementAtIndexUsingRecursion<T>.Node head){
        InsertElementAtIndexUsingRecursion<T>.Node slowPointer=head;
        InsertElementAtIndexUsingRecursion<T>.Node fastPointer=head;
        while (fastPointer!=null&& fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer){
                return true;
            }
        }
        return false;
    }
    public int howManyElementInCycle(InsertElementAtIndexUsingRecursion<T>.Node head){
        int numberOfElement=0;
        InsertElementAtIndexUsingRecursion<T>.Node slowPointer=head;
        InsertElementAtIndexUsingRecursion<T>.Node fastPointer=head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if (fastPointer==slowPointer){
                slowPointer=slowPointer.next;
                do{
                    numberOfElement++;
                    slowPointer=slowPointer.next;
                }while (slowPointer!=fastPointer);
                return numberOfElement;
            }
        }
        return 0;
    }
    public InsertElementAtIndexUsingRecursion<T>.Node returnNodeWhereCycleStart(InsertElementAtIndexUsingRecursion<T>.Node head){
        int numberOfElement=howManyElementInCycle(head);
        InsertElementAtIndexUsingRecursion<T>.Node fisrtPointer=head;
        InsertElementAtIndexUsingRecursion<T>.Node secondPointer=head;
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
}
