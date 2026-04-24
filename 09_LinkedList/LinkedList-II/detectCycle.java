class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {

    // 🔍 Detect cycle using Floyd's Algorithm
    public static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            // 🎯 If they meet → cycle exists
            if (slow == fast) {
                return true;
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // 🔁 Create cycle: 4 → 2
        head.next.next.next.next = head.next;

        System.out.println("Cycle present? " + hasCycle(head));
    }
}