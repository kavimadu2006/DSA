import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push: O(1)
    public void push(int x) {
        q1.add(x);
    }

    // Pop: O(n)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();

        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public static void main(String[] args) {
        QueueStackPushFriendly s = new QueueStackPushFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Popped: " + s.pop());
    }
}
