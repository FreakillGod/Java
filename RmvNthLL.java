class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RmvNthLL {

    public static Node removeNthNode(Node ogHead, int rm) {

        Node head = ogHead;

        while (rm-- != 1) {
            head = head.next;
            System.out.println(rm);
        }
        head.next = head.next.next;

        return ogHead;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int remove = 3;
        Node create = new Node(arr[0]);
        Node head = create;

        for (int i = 1; i < arr.length; i++) {
            create.next = new Node(arr[i]);
            create = create.next;
        }

        System.out.println(removeNthNode(head, remove).next.next.data);
    }
}
