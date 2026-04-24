import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLL {

    // 🔍 Check palindrome using ArrayList
    public static boolean isPalindrome(Node head) {

        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store elements
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        // Step 2: Two-pointer check
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            // If mismatch → not palindrome
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 🖨️ Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create: 1 → 2 → 3 → 2 → 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        printList(head);

        System.out.println("Is Palindrome? " + isPalindrome(head));
    }
}