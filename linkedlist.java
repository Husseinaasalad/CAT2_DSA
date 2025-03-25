public class LinkedList {
    
    private class Node {
        int data;       
        Node next;      
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Head reference to the first node in the list
    private Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void insertAtBeginning(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Set the next of new node to current head
        newNode.next = head;
        
        // Update the head to point to the new node
        head = newNode;
    }
    
    public void insertAtEnd(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Set the next of the last node to the new node
        current.next = newNode;
    }
    
    public int deleteFromBeginning() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return -1;
        }
        
        // Save the data from the current head node
        int deletedData = head.data;
        
        // Update the head to point to the next node
        head = head.next;
        
        // Return the data from the deleted node
        return deletedData;
    }
    
    public void display() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        // Traverse the list and print each node's data
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList list = new LinkedList();
        
        // Test inserting at the beginning
        System.out.println("Inserting elements at the beginning:");
        list.insertAtBeginning(30);
        list.display();
        list.insertAtBeginning(20);
        list.display();
        list.insertAtBeginning(10);
        list.display();
        
        // Test inserting at the end
        System.out.println("\nInserting elements at the end:");
        list.insertAtEnd(40);
        list.display();
        list.insertAtEnd(50);
        list.display();
        
        // Test deleting from the beginning
        System.out.println("\nDeleting elements from the beginning:");
        int deleted = list.deleteFromBeginning();
        System.out.println("Deleted: " + deleted);
        list.display();
        
        deleted = list.deleteFromBeginning();
        System.out.println("Deleted: " + deleted);
        list.display();
    }
}
