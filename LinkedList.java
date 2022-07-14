//Linked List class
class Node {

    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    public static Node insert(Node root, int data) {

        Node temp = new Node(data);
        temp.next = root;
        root = temp;

        return root;
    }

    public static Node createLL(int[] arr) {

        Node root = new Node(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {

            root = insert(root, arr[i]);
        }
        return root;
    }

    public static void printNodes(Node root) {
        Node curr = root;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node reverseLL(Node root) {

        Node curr = root;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static Node recuresiveReverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node realHead = recuresiveReverse(head.next);
        Node newHead = head.next;
        newHead.next = head;
        head.next = null;

        return realHead;

    }

    public static Node findMedian(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // public static boolean isLLpalindrome(Node head, Node reverseHead) {

        
    // }

    public static void main(String[] args) {

        int arr[] = { 12, 15, 3, 23, 45, 32, 71 };
        Node ogRoot = createLL(arr);
        printNodes(ogRoot);

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(20);
        Node n4 = new Node(10);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node rev = reverseLL(head);
        Node recursiveRev = recuresiveReverse(head);

        // System.out.println(isLLpalindrome(head, rev) + " HELLO");

        printNodes(rev);

    }

}
