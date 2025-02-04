import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int createStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of List: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Invalid Length");
            scanner.close();
            return length;
        }

        // Push elements in reverse order (length to 1)
        for (int i = length; i >= 1; i--) {
            push(i);
        }
        scanner.close();
        return length;
    }

    public void displayStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void stackReverse() {
        if (top == null) {
            System.out.println("Stack is empty, cannot reverse.");
            return;
        }
        top = reverseRecursively(top);
    }

    private Node reverseRecursively(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
}

public class StackDriver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int length = stack.createStack();
        if (length > 0) {
            System.out.println("Elements in Stack:");
            stack.displayStack();
            stack.stackReverse();
            System.out.println("Elements in the stack after reversal");
            stack.displayStack();
        }
    }
}

