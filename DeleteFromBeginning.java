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

public class DeleteFromBeginning {
    public static void main(String[] args) {

        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        // Delete from beginning
        head = head.next;

        // print
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
