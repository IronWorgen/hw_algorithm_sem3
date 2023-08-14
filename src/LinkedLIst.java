public class LinkedLIst<T extends Comparable> {
    private int size;
    private Node root;

    public void add(T value) {
        if (root == null) {
            root = new Node(value);
            size++;
            return;
        }

        Node currentNode = root;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
        size++;
    }

    public void printList() {
        if (root == null) {
            System.out.println("список пуст");
            return;
        }
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode);
            currentNode = currentNode.next;
        }
    }

    public void revers() {

        if (size < 2) {
            return;
        }

        Node currentNode = root.next;
        Node previousNode = root;
        Node nextNode = currentNode.next;

        while (currentNode != null) {

            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            if (nextNode != null) {
                nextNode = currentNode.next;
            }
        }

        root.next = null;
        root = previousNode;
    }


    private class Node {

        T value;
        Node next;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();

        }
    }
}
