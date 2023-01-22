class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RmNthLLfrmEnd {


    public static Node removeNthFromEnd(Node head, int num) {

        while(head.next != null){
            removeNthFromEnd(head.next, num);
        }

        
        

        return head;
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

        System.out.println();

    }
}
