
// Zara Arif
// EB 25210006109

import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String newdata) {
        this.data = newdata;
        this.next = null;
    }
}

public class Traversal {
    public static void main(String[] args) {

        Node head = new Node("Karachi");
        head.next = new Node("Lahore");
        head.next.next = new Node("Quetta");
        head.next.next.next = new Node("Islamabad");
        head.next.next.next.next = new Node("Balochistan");

        //  Print + Length
        Node temp = head;
        int count = 0;

        System.out.print("Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }

        System.out.println();
        System.out.println("Length of linked list: " + count);

        //  User input for search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city to search: ");
        String search = sc.nextLine();

        //  Search an element
        temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.equalsIgnoreCase(search)) { 
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (found) {
            System.out.println(search + " is FOUND in linked list");
        } else {
            System.out.println(search + " is NOT FOUND in linked list");
        }

    }
}
