import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push: O(n)
    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop: O(1)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return q1.remove();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly s = new QueueStackPopFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Popped: " + s.pop());
    }
}
