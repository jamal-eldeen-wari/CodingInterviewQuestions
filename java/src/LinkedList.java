//public class LinkedList extends LinkedListNode{
//    // this is only used for reference on the actual nodes (It is not a node)
//    private LinkedListNode head;
//    int size;
//
//
//    public void insertNode(String data){
//        if (head == null){
//            LinkedListNode linkedListNode = new LinkedListNode(data);
//            head = linkedListNode;
//        }else{
////            Current here is only a reference for the node
//            LinkedListNode current;
//            current = head;
////            This loop will check if the there is any next nodes or not
//            while(current.getNext()!= null){
//                current = current.getNext();
//            }
////            Here we will create new node and set the current to the next element.
//            LinkedListNode linkedListNode = new LinkedListNode(data);
//            current.setNext(linkedListNode);
//
//
//            size++;
//        }
//    }
//
//    public boolean includes(String data) throws Exception {
//        LinkedListNode current = head;
//
//        while (current != null){
//            if (current.getData().equals(data)){
//                return true;
//            }else{
//                current = current.getNext();
//            }
//        }
//        return false;
//    }
//
//    public void printList() {
//        if (head == null) {
//            System.out.println("List is empty");
//        } else {
//            LinkedListNode current;
//            current = head;
//
//            while (current != null) {
//                // moves the current reference along the list
//                System.out.print(current + " -> ");
//                current = current.getNext();
//            }
//
//            System.out.println("NULL");
//        }
//    }
//
//    public void removeNode(String data){
//        LinkedListNode current;
//        if (head == null){
//            return;
//        }else{
//
//            current = head;
//            while (current.getNext()!= null){
//                if (current.getNext().getData().equals(data)){
//                    current.setNext(current.getNext().getNext());
//                    return;
//                }
//                current = current.getNext();
//            }
//
//
//        }
//
//
//    }
//
//    public void insertAfter(String data, String newData){
//        LinkedListNode current = head;
//
//        while (current.getNext()!=null){
//            if (current.getNext().getData().equals(data)){
//                LinkedListNode linkedListNode = new LinkedListNode(newData);
//                linkedListNode.setNext(current.getNext());
//                current.setNext(linkedListNode);
//
//            }
//            current= current.getNext();
//        }
//
//    }
//
//    public void insertBefore(String data, String newData){
//        LinkedListNode current = head;
//        LinkedListNode previous = current;
//
//        while (current!=null){
//            if (current.getData().equals(data)){
//                LinkedListNode lln = new LinkedListNode(newData);
//                lln.setNext(current);
//                previous.setNext(lln);
//                break;
//
//            }
//            previous = current;
//            current = current.getNext();
//
//        }
//    }
//
//
//    public String kth(int position){
//        int count = 0;
//
//        LinkedListNode current = head;
//
//        while (current.getNext()!=null){
//            current = current.getNext();
//            count++;
//        }
//        if (count<position){
//            return "Nothing found";
//        }
//        current = head;
//        for (int i = 1; i<count-position+1; i++){
//            current = current.getNext();
//        }
////        System.out.println(current.getData());
//        return current.getData();
//    }
//
//    public  String mergeLists(LinkedList linkedList1, LinkedList linkedList2){
//
//        LinkedListNode n1 = linkedList1.head;
//        LinkedListNode n2 = linkedList2.head;
//        LinkedList zipLinkedList = new LinkedList();
//        int fullSize = linkedList1.size+ linkedList2.size;
//
//        while (fullSize > 0){
//
//            if(n1 != null){
//                zipLinkedList.insertNode(n1.getData());
//                n1 = n1.getNext();
//            }
//
//            if(n2 != null){
//                zipLinkedList.insertNode(n2.getData());
//                n2 = n2.getNext();
//            }
//
//            fullSize--;
//
//        }
//        return zipLinkedList.toString();
//    }
//    public java.util.LinkedList reverse(java.util.LinkedList linkedList2) {
//
//        LinkedListNode prev = null;
//        LinkedListNode current = head;
//
//        LinkedListNode next = null;
//        while (current != null) {
//
//            next = current.getNext();
//            current.setNext(prev);
//            prev = current;
//            current = next;
//
//        }
//        head = prev;
//        return linkedList2;
//    }
//
//    public String presentData(){
//        String list = "Head -->  ";
//        LinkedListNode data = head;
//        while (data!=null){
//            list = list + data.getData() +" --> ";
//            data =data.getNext();
//        }
//        return list;
//    }
//
////    public void sortList()
////    {
////
////        // Node current will point to head
////        LinkedListNode current = head;
////               LinkedListNode index = null;
////
////        int temp;
////
////        if (head == null) {
////            return;
////        }
////        else {
////            while (current != null) {
////
////                index = current.getNext();
////
////                while (index != null) {
////                    // If current node's data is greater
////                    // than index's node data, swap the data
////                    // between them
////                    if (current.getData() > index.getData()) {
////                        temp = current.getData();
////                        current.getData() = index.getData();
////                        index.getData() = temp;
////                    }
////
////                    index = index.getNext();
////                }
////                current = current.getNext();
////            }
////        }
////    }
//
//    public LinkedList deleteDuplicated (LinkedList linkedList)
//    {
//        LinkedListNode current = head ;
//        LinkedListNode prev = current ;
//
//        while (linkedList != null )
//        {
//            if (prev.getData().equals(current.getData())) {
//                prev.setNext(prev.getNext().getNext());
//                current = current.getNext();
//            }
//            current = current.getNext();
//
//        }
//
//        return linkedList;
//
//    }
//
////    public LinkedList deleteDublicated (LinkedList linkedList)
////    {
////
////        LinkedListNode current = head ;
////        LinkedListNode prev = current ;
////
////        while (linkedList != null )
////        {
////            if (prev.getData() == current.getData()) {
////                prev.setNext(prev.getNext().getNext());
////                current = current.getNext();
////            }else {
////
////                prev = current.getNext();
////            }
////            current = current.getNext();
////
////        }
////
////        return linkedList;
////
////    }
//
//    public LinkedList deleteDublicated (LinkedList linkedList) {
//
//        LinkedListNode current = head ;
//        LinkedListNode prev = head ;
//
//
//        while (current != null ) {
//            if (prev.getData() == current.getData()){
//                prev.setNext(prev.getNext().getNext());
//                current = current.getNext();
//            }
//            prev = current;
//            current = current.getNext();
//        }
//
//        return linkedList;
//
//    }
//
//    @Override
//    public String toString() {
//        return "LinkedList"+"{ "+presentData()+" }";
//    }
//}
