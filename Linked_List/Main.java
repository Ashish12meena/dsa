


public class Main {
    public static void main(String[] args) {
                DoublyLinkedList linkedList = new DoublyLinkedList();
                // CustomLinkedList linkedList = new CustomLinkedList();
                linkedList.add(34);
                linkedList.add(45);
                linkedList.add(56);
                linkedList.add(67);
                linkedList.add(78);
                // linkedList.addAtIndex(20, 6);
                // linkedList.addAtStart(889);   
                // linkedList.addAtIndex(12, 3 ); 
                System.out.println("Size of linked list is  "+linkedList.size());
                linkedList.reverse();
                
                linkedList.display();
        
    }
}
