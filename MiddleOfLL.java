class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLL {

    public static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Node ll = new Node(arr[0]);
        Node head = ll;

        for (int i = 1; i < arr.length; i++) {
            ll.next = new Node(arr[i]);
            ll = ll.next;
        }

        System.out.println(findMiddle(head).data);

    }
}
