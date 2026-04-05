# 🧠 ArrayList – Practice & Revision

> 🎯 Goal: Master dynamic arrays → understand operations → apply in problems

---

## 🧩 Problems

---

### 1. Basic Operations (Add, Get, Set, Remove)

> Learn core ArrayList methods

🔗 [view code]()

---

### 2. Print ArrayList

> Traverse using loop / for-each

🔗 [view code]()

---

### 3. Reverse an ArrayList

> Reverse elements manually

🔗 [view code]()

---

### 4. Find Maximum Element

> Iterate and track max value

🔗 [view code]()

---

### 5. Swap Two Elements

> Swap using indices

🔗 [view code]()

---

### 6. Container With Most Water

> Two pointer + ArrayList

🔗 [view code]()

---

### 7. Pair Sum (Sorted)
> brute force
🔗 [view code]()
> Two pointer approach
🔗 [view code]()

---

### 8. Pair Sum (Unsorted)

> Use HashSet for lookup

🔗 [view code]()

---

### 9. Monotonic ArrayList

> Check increasing/decreasing order

🔗 [view code]()

---

### 10. Lonely Numbers

> Elements appearing once

🔗 [view code]()

---

### 11. Majority Element

> Element appearing > n/2 times

🔗 [view code]()

---

### 12. Beautiful ArrayList

> Construct special sequence

🔗 [view code]()

---

### 13. Subarray Sum (Brute Force)

> Generate all subarrays

🔗 [view code]()

---

### 14. Sort an ArrayList

> Using Collections.sort()

🔗 [view code]()

---

### 15. 2D ArrayList Basics

> Matrix-like structure

🔗 [view code]()

---

### 16. Convert ArrayList to 2D array
> Convert a 2D ArrayList to a 2D array

🔗 [view code]()

---
## 🧠 Core Operations


```java
ArrayList<Integer> list = new ArrayList<>();

// 🟢 Add
list.add(10);                 // add element
list.add(1, 20);             // add at index

// 🔵 Access
int val = list.get(0);

// 🟡 Update
list.set(0, 100);

// 🔴 Remove
list.remove(0);

// 🟣 Size
int size = list.size();

// 🔁 Loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}