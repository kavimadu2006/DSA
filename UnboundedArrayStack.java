public class UnboundedArrayStack {

    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2]; // Initial size
        top = -1;
    }

    // Push operation
    public void push(int data) {

        // Double size if array is full
        if (top == stack.length - 1) {
            resize(stack.length * 2);
            System.out.println("Stack expanded to size: " + stack.length);
        }

        stack[++top] = data;
    }

    // Pop operation
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top--];

        // Reduce size when stack is only 25% full
        if (top + 1 > 0 && (top + 1) <= stack.length / 4) {
            resize(stack.length / 2);
            System.out.println("Stack reduced to size: " + stack.length);
        }

        return value;
    }

    // Resize array
    private void resize(int newSize) {

        int[] temp = new int[newSize];

        for (int i = 0; i <= top; i++) {
            temp[i] = stack[i];
        }

        stack = temp;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        UnboundedArrayStack s = new UnboundedArrayStack();

        s.push(10);
        s.push(20);
        s.push(30); // expand

        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop()); // reduce

        s.display();
    }
}
