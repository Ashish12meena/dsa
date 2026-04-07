

/**
 * Implements a custom singly linked list with basic operations.
 */
public class CustomLinkedList {

    /**
     * Represents a node in the linked list.
     */
    private class Node {
        /**
         * The data stored in the node.
         */
          int data;
    
        /**
         * The reference to the next node in the list.
         */
        Node next;
    
        /**
         * Constructs a new node with the specified data and sets the next reference to null.
         *
         * @param data the data to store in the node
         */
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    
        /**
         * Constructs a new node with the specified data and a reference to the next node.
         *
         * @param data the data to store in the node
         * @param next the reference to the next node
         */
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    /**
     * The reference to the last node in the list.
     * 
     */
    private Node tail;

    /**
     * The reference to the first node in the list.
     */
    private Node head;

    /*
     * The size of the linked list.
     */
    private int size = 0;

    /**
     * Adds a new node with the specified data to the end of the linked list.
     *
     * @param data the data to add to the list
     */
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        size++;
    }

    /*
     * remove the last node from the linked list
     */
    public void remove(){
        Node currNode = head;
        while (currNode.next.next !=null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        tail = currNode;
        size--; 
    }

    /**
     * Adds a new node with the specified data to the start of the linked list.
     *
     * @param data the data to add to the list
     */
    public void addAtStart(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data, head);
            head = newNode;
        }
        size++;
    }

    /**
     * Adds a new node with the specified data at the specified index in the linked list.
     *
     * @param data  the data to add to the list
     * @param index the position at which to insert the new node
     */
    public void addAtIndex(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            addAtStart(data);
        } else {
            Node currNode = head;
            while (currNode != null && index > 2) {
                currNode = currNode.next;
                index--;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        size++;
    }

    /*
     * get the size of Linked list
     */
    public int size() {
        return size;
    }

    /*
     * Reverse the linked list
     */
    public void reverse(){
        Node prevNode = null;
        Node nextNode = null;
        Node currNode = head;
        while (currNode!=null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head= prevNode;
    }

    /**
     * Displays all the elements in the linked list.
     */
    public void display() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
}

