import java.util.Scanner;

class node {
    int value;
    Node next;
}

class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public int createStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of List: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Invalid Length");
            return length;
        }

        for (int i = 1; i <= length; i++) {
            Node newNode = new Node();
            newNode.value = i;
            newNode.next = top;
            top = newNode;
        }
        return length;
    }

    public void displayStack() {
        Node current = top;
        System.out.println("Elements in Stack");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void stackReverse() {
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

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int length = stack.createStack();
        if (length > 0) {
            stack.displayStack();
            stack.stackReverse();
            System.out.println("Elements in the stack after reversal");
            stack.displayStack();
        }
    }
}
