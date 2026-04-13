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

public class InsertAfterGivenNode {
    public static void main(String[] args) {

        // Linked list
        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        String target = "Lahore";   //node after which we insert
        String value = "Multan";    //new node

        Node temp = head;

        //  search + insert
        while (temp != null) {
            if (temp.data.equals(target)) {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        //  print list
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
