public static int search(Node head, int key) {

    // Base case: reached end → not found
    if (head == null) {
        return -1;
    }

    // If current node matches → index = 0
    if (head.data == key) {
        return 0;
    }

    // Search in remaining list
    int index = search(head.next, key);
	//backtraking
    // If not found ahead → propagate -1
    if (index == -1) {
        return -1;
    }

    // Add 1 because we are one step behind
    return index + 1;
}