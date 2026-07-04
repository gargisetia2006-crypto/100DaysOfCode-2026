class Solution {
    Node divide(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node evenHead = null;
        Node evenTail = null;

        Node oddHead = null;
        Node oddTail = null;

        Node temp = head;

        while (temp != null) {

            Node next = temp.next;   // Save next node
            temp.next = null;        // Detach current node

            if (temp.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }

            } else {

                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }

            }

            temp = next;
        }

        // If there are no even nodes
        if (evenHead == null) {
            return oddHead;
        }

        // Attach odd list after even list
        evenTail.next = oddHead;

        return evenHead;
    }
}