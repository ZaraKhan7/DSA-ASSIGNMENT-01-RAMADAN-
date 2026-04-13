// ZARA ARIF
// EB25210006109

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteByPosition {
    public static void main(String[] args) {

        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        int pos = 4; // position to delete

        // Delete at position
        if (pos == 1) {
            head = head.next;
        } 
        else {
            Node temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        // Print list after deletion
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
