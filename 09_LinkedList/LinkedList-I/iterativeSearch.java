// Iterative search
int search(int key) {
    Node temp = head; // start from head
    int index = 0;

    while (temp != null) {

        if (temp.data == key) {
            return index; // found
        }

        temp = temp.next; // move forward
        index++;          // increase position
    }

    return -1; // not found
}