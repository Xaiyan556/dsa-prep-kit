# 🧠 Backtracking – Practice & Revision

> 🎯 Goal: Build intuition → explore all possibilities → prune efficiently

---

## 🧩 Problems

---

### 1. Print All Subsets of a String

> Generate all subsets using backtracking

🔗 [view code]()

---

### 2. Print All Permutations

> Generate all permutations of array/string

🔗 [view code]()

---

### 3. Combination Sum

> Find combinations that sum to target

🔗 [view code]()

---

### 4. Subsets with Duplicates

> Handle duplicate elements carefully

🔗 [view code]()

---

### 5. Permutations with Duplicates

> Avoid duplicate permutations

🔗 [view code]()

---

### 6. N-Queens Problem

> Place queens safely on board

🔗 [view code]()

---

### 7. Sudoku Solver

> Fill grid with valid numbers

🔗 [view code]()

---
## 8. Grid Path Problems

> These problems involve exploring paths in a 2D grid using backtracking

🔗 [view code]()

---
### 9. Rat in a Maze

> Find all paths from source to destination

🔗 [view code]()

---

### 10. Word Search

> Search word in 2D grid

🔗 [view code]()

---

### 11. Palindrome Partitioning

> Partition string into palindromes

🔗 [view code]()

---

### 12. Letter Combinations (Phone Digits)

> Generate strings from digit mapping

🔗 [view code]()

---

### 13. M-Coloring Problem

> Color graph using M colors

🔗 [view code]()

---

### 14. Knight’s Tour

> Visit all cells exactly once

🔗 [view code]()

---

### 16. Restore IP Addresses

> Generate valid IP combinations

🔗 [view code]()

---

### 17. Partition into K Subsets

> Divide into equal sum subsets

🔗 [view code]()

---

## 🧠 Key Idea (Backtracking Pattern)

```java
// Backtracking Core Pattern
void solve(params) {

    // 🟢 Base Case
    if (base_case) {
        add_answer();
        return;
    }

    for (choice : choices) {

        if (isValid(choice)) {

            // 🟡 Choose
            apply(choice);

            // 🔁 Explore
            solve(updated_params);

            // 🔴 Undo (Backtrack)
            undo(choice);
        }
    }
}