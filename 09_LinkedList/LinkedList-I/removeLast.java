// Remove last node and return its value
int removeLast() {

    // 🔹 Case 1: empty list
    if (head == null) {
        System.out.println("List is empty");
        return Integer.MIN_VALUE;//error value
    }

    // 🔹 Case 2: single node
    if (head == tail) {
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }

    // 🔹 Case 3: multiple nodes
    Node temp = head;

    // find second last node
    while (temp.next != tail) {
        temp = temp.next;
    }

    int val = tail.data; // store value

    temp.next = null; // remove last node
    tail = temp;      // update tail

    size--; // update size

    return val;
}