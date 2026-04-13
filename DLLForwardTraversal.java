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

public class DLLForwardTraversal{
    public static void main(String[] args) {

        // Create DLL 
        Node head = new Node("Karachi");
        Node second = new Node("Lahore");
        Node third = new Node("Quetta");
        Node fourth = new Node("Islamabad");
        Node fifth = new Node("Balochistan");

        // Linking nodes
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        // Forward Traversal
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
