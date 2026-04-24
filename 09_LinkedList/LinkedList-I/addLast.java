// Add node at end (O(1))
void addLast(int data) {
    Node newNode = new Node(data); // step 1

    // edge case: empty list
    if (head == null) {
        head = tail = newNode;
        return;
    }

    tail.next = newNode; // step 2: link old tail to new node
    tail = newNode;      // step 3: move tail forward
}