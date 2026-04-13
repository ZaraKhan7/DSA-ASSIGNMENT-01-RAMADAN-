class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtSpecificPosition {
    public static void main(String[] args) {

        // Linked list (5 cities)
        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        int pos = 3; // insert position
        Node newNode = new Node("Multan");

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        // print list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
