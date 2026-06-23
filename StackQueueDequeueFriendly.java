import java.util.Stack;

public class StackQueueDequeueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int dequeue() {

        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return s1.pop();
    }

    public static void main(String[] args) {

        StackQueueDequeueFriendly q = new StackQueueDequeueFriendly();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
    }
}
