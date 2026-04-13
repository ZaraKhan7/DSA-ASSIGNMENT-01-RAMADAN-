// ZARA ARIF
// EB25210006109

class Node {
    String data;
    Node next;
    Node prev;

    Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLBackwardTraversal {
    public static void main(String[] args) {

        // Create DLL 
        Node head = new Node("Karachi");
        Node second = new Node("Lahore");
        Node third = new Node("Quetta");
        Node fourth = new Node("Islamabad");
        Node fifth = new Node("Balochistan");

        // Forward links
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        //  Move to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //  Backward Traversal
        System.out.print("Backward: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
