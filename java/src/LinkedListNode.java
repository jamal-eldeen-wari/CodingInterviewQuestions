public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    //                                      Constructor
    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode() {
    }

    //                                   Setters and Getters
    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    //                                        toString
    @Override
    public String toString() {
        return "{"+ data +"}" ;
    }
}
