public class UnboundedArrayStack {

    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2]; // initial size
        top = -1;
    }

    // PUSH (grow dynamically)
    public void push(int value) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }
        stack[++top] = value;
    }

    // POP (safe shrink version)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top--];

        // SAFE SHRINKING RULE (very conservative)
        // shrink only when size is large enough AND half empty
        if (stack.length > 4 && top + 1 <= stack.length / 2) {
            resize(stack.length / 2);
        }

        return value;
    }

    // Resize array
    private void resize(int newSize) {
        int[] newStack = new int[newSize];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack
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
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.display();
    }
}
