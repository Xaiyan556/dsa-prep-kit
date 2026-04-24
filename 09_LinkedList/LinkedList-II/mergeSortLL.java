// 🔥 Merge Sort on Linked List - Complete Code

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortLL {

    // 🚀 Main function to test merge sort
    public static void main(String[] args) {

        // Creating linked list: 5 -> 4 -> 3 -> 2 -> 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.print("Original List: ");
        printList(head);

        // 🔥 Apply merge sort
        head = mergeSort(head);

        System.out.print("Sorted List: ");
        printList(head);
    }

    // 🧠 Merge Sort Function
    public static ListNode mergeSort(ListNode head) {
        // Base case: single node or empty
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split list into halves
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid;

        // Step 2: Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Step 3: Merge sorted halves
        return merge(left, right);//return node
        /***
        “Take two **already sorted linked lists** and combine them into one sorted list — then return its head”
        ***/
    }

    // ✂️ Find middle and split list
    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast 2 steps, slow 1 step
        while (fast != null && fast.next != null) {
            prev = slow;//prev= current slow
            slow = slow.next;// +1
            fast = fast.next.next;
        }

        // Break the list into two halves
        if (prev != null) {
            prev.next = null; // 💥 split happens here
        }

        return slow; // start of right half
    }

    // 🔗 Merge two sorted linked lists
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1); // dummy node
        /*👉 Interpretation:

		- `dummy` → fixed starting anchor
		- `tail` → **moves forward and always points to last node of result list**
        */
        ListNode tail = dummy;

        // Compare and merge nodes
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {//l1 smaller
                tail.next = l1; // attach l1
                l1 = l1.next;
            } else {             // l2 smaller
                tail.next = l2; // attach l2
                l2 = l2.next;
            }
            tail = tail.next;//moving tail pointer forward
        }

        // Attach remaining nodes
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    // 🖨️ Utility function to print list
    private static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}