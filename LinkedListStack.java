class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListStack {

    Node top;

    // Push
    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed.");
    }

    // Pop
    public void pop() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " popped.");
        top = top.next;
    }

    // Peek
    public void peek() {

        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element : " + top.data);
        }
    }

    // Display
    public void display() {

        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
