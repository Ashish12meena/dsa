public class DoublyLinkedList {
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = null;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;
    private Node tail;
    private int size = 0;

    public void add(int data){
        if (head==null) {
            addAtStart(data);
        } else {
            tail.next = new Node(data, null, tail);
            tail = tail.next;
            size++;
        }
    }
    public void addAtStart(int data){
        if (head == null) {
            head= new Node(data);
            tail = head;
        }else{
            Node newNode = new Node(data,head);
            head.prev = newNode;
            head= newNode;
        }
        size++;
    }
    public void addAtIndex(int data, int index){
        Node currNode = head;
        if (index==0) {
            addAtStart(data);
        }else{
            Node newNode = new Node(data);
            if (index>size-1) {
                add(data);
            } else{
                while (currNode!=null && index>0) {
                    currNode = currNode.next;
                    index--;
                }
                currNode.prev.next=newNode;
                newNode.prev = currNode.prev;
                newNode.next = currNode;
                currNode.prev = newNode;
                size++;
            }
        }
    }

    public void reverse(){
        Node current = head;
        Node temp = null;
        while (current!=null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
    
            // Move to next node in original sequence, which is current.prev now
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public int size(){
        return size;
    }
}


