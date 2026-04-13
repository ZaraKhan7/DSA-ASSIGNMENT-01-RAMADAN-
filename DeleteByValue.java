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

public class DeleteByValue{
    public static void main(String[] args) {

        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        String value = "Quetta";

        // Delete by value
        if (head.data.equals(value)) {
            head = head.next;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                if (temp.next.data.equals(value)) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }

        // Print list after deletion
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
