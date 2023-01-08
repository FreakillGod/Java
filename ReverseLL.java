class Node {
    Node next;
    int data = 0;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {

    public static Node reverseLL(Node head) {
        Node myHead = head;

        if (head.next == null) {
            return head;
        }

        Node currHead = reverseLL(myHead.next);
        head.next.next= head;
        head.next=null;

        return currHead;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Node ll = new Node(arr[0]);
        Node head = ll;

        for (int i = 1; i < arr.length; i++) {
            ll.next = new Node(arr[i]);
            ll = ll.next;
        }
        Node ans=reverseLL(head);

        System.out.println(ans.next.next.next.next.next.data);
        // System.out.println(head.next.data);
    }
}
