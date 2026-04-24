// 🔥 Zig-Zag Linked List Complete Implementation

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ZigZagLL {

    // 🚀 Main function (Driver Code)
    public static void main(String[] args) {

        // Create: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        head = zigZag(head);

        System.out.print("Zig-Zag: ");
        printList(head);
    }

    // 🧠 Zig-Zag Function
    public static ListNode zigZag(ListNode head) {
        if (head == null || head.next == null) return head;

        // 🔹 Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevMid = null;

        while (fast != null && fast.next != null) {
            prevMid = slow;       // track node before mid
            slow = slow.next;     // +1 step
            fast = fast.next.next; // +2 step
        }

        // ✂️ Break list into two halves
        prevMid.next = null;

        // left = head
        // right = slow (start of second half)

        // 🔹 Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow;//updated slow +1

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }

        // Now prev = head of reversed second half

        // 🔹 Step 3: Merge alternately
        ListNode left = head;
        ListNode right = prev;

        while (left != null && right != null) {
            ListNode nextL = left.next;
            ListNode nextR = right.next;

            left.next = right;   // connect left → right

            if (nextL == null) break; // important for odd length

            right.next = nextL; // connect right → next left

            left = nextL;
            right = nextR;
        }

        return head;
    }

    // 🖨️ Print Linked List
    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}