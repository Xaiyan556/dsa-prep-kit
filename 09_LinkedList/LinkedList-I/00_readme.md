
---

# 🔗 Linked List – I

> 🎯 Goal: Understand structure → master traversal → build core operations

---

## 🧠 Mindset

* 📦 Node = `data + next`
* 🔗 Structure is **non-contiguous (pointer-based)**
* 🚶 Traversal is **sequential only (no indexing)**

---

## 🧩 Problems

---

## 🟢 01 Create & Traverse Linked List

`[Easy | Basics]`

> Build a linked list and print all elements

```
Input: 1 → 2 → 3 → 4  
Output: 1 2 3 4
```

🔗 [code]()

---

## 🟢 02 Insert at Beginning (add first method)

`[Easy | Pointer Update]`

> Add node at head

```
Before: 2 → 3 → 4  
After:  1 → 2 → 3 → 4
```

🔗 [code]()

---

## 🟢 03 Insert at End

`[Easy | Traversal]`

> Add node at tail

```
Before: 1 → 2 → 3  
After:  1 → 2 → 3 → 4
```

🔗 [code]()

---

## 🟡 04 Insert at Position

`[Medium | Pointer Manipulation]`

> Insert node at given index

```
Input: pos = 2, val = 9  
Before: 1 → 2 → 3  
After:  1 → 2 → 9 → 3
```

🔗 [code]()

---

## 🟢 05 Delete from Beginning

`[Easy | Head Update]`

> Remove first node

```
Before: 1 → 2 → 3  
After:  2 → 3
```

🔗 [code]()

---

## 🟢 06 Delete from End

`[Easy | Traversal]`

> Remove last node

```
Before: 1 → 2 → 3  
After:  1 → 2
```

🔗 [code]()

---

## 🟡 07 Delete at Position

`[Medium | Pointer Handling]`

> Remove node at index

```
Input: pos = 2  
Before: 1 → 2 → 3  
After:  1 → 2
```

🔗 [code]()

---

## 🟢 08 Search in Linked List

`[Easy | Traversal]`

> Find if element exists

```
Input: key = 3  
Output: Found
```

🔗 [code]()

---

## 🟡 09 Length of Linked List

`[Medium | Iteration]`

> Count number of nodes

```
1 → 2 → 3 → 4 → 5  
Output: 5
```

🔗 [code]()

---

## 🟡 10 Reverse Linked List (Iterative)

`[Medium | Pointer Reversal 🔥]`

> Reverse links

```
Before: 1 → 2 → 3 → 4  
After:  4 → 3 → 2 → 1
```

🔗 [code]()

---

## 🔴 11 Reverse Linked List (Recursive)

`[Hard | Recursion + Pointers]`

> Reverse using recursion

🔗 [code]()

---

## 🟡 12 Find Middle of Linked List

`[Medium | Two Pointer 🐢🐇]`

> Use slow & fast pointer

```
1 → 2 → 3 → 4 → 5  
Output: 3
```

🔗 [code]()

---

## 🔴 13 Detect Cycle (Floyd’s Algorithm)

`[Hard | Fast-Slow Pointer]`

> Check if loop exists

🔗 [code]()

---

## ⚙️ Key Concepts

* 🔗 **Node Structure**
* 🔁 **Traversal**
* 🔄 **Pointer Manipulation**
* 🐢🐇 **Two Pointer Technique**

---

## 📊 Difficulty Flow

```text
🟢 Create → Insert → Delete
        ↓
🟡 Position-based + Reverse
        ↓
🔴 Recursion + Cycle Detection
```

---

## 🧠 Pattern Recognition

* Head change → insertion/deletion at start
* Tail operation → traversal required
* Middle problems → two pointers
* Reverse → pointer redirection

---

## 📌 Pro Insight

> Linked List problems are not about loops…
> they are about **pointer control**

---

## 🚀 What’s Next?

* 🔗 Linked List – II (Advanced)

  * Merge two lists
  * Remove Nth node
  * Palindrome LL
  * Intersection point

