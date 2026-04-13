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

public class InsertBeforeGivenNode {
    public static void main(String[] args) {

        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        String target = "Lahore";
        String value = "Multan";

        Node newNode = new Node(value);

        //  if inserting before head
        if (head.data.equals(target)) {
            newNode.next = head;
            head = newNode;
        } 
        else {
            Node temp = head;

            while (temp.next != null && !temp.next.data.equals(target)) {
                temp = temp.next;
            }

            if (temp.next != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        // print list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
