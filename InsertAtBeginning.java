// ZARA ARIF 
// EB25210006109

class Node {
    String data;
    Node next;

    Node(String newdata) {
        this.data = newdata;
        this.next = null;
    }
}

public class InsertAtBeginning{
    public static void main(String[] args) {
        Node head = new Node("Lahore");
        head.next = new Node("Quetta");
        head.next.next = new Node("Islamabad");
        head.next.next.next = new Node("Balochistan");

      // Insert at beginning
        Node newNode =new Node("Karachi");
        newNode.next = head;
        head = newNode;
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        
        }
}
}   
