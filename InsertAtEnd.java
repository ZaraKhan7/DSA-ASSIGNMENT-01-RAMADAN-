// ZARA ARIF
// EB25210006109

class Node {
    String data;
    Node next;

    Node(String new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class InsertAtEnd {
    public static void main(String[] args) {

        //  linked list
        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        //  Insert at End
        Node newNode = new Node("Multan");

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        //  Print list
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
