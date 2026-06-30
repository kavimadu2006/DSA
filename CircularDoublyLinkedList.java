public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at Beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }
    }

    // Insert at End
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }
    }

    // Delete Beginning
    public void deleteBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Delete End
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    // Display Forward
    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Original List:");
        list.display();

        list.deleteBeginning();

        System.out.println("After Delete Beginning:");
        list.display();

        list.deleteEnd();

        System.out.println("After Delete End:");
        list.display();
    }
}
