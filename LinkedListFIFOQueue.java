class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListFIFOQueue {

    Node front;
    Node rear;

    // Enqueue
    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    public void dequeue() {

        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println(front.data + " removed.");

        front = front.next;

        if (front == null)
            rear = null;
    }

    // Peek
    public void peek() {

        if (front == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Front : " + front.data);
        }
    }

    // Display
    public void display() {

        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}
