
---

# 🌳 Binary Trees – I

> 🎯 Goal: Understand tree structure → master traversals → build recursion intuition

---

## 🧠 Mindset

* 🌿 Tree = **hierarchical structure**
* 📦 Node = `data + left + right`
* 🔁 Traversal = **visit nodes in specific order**

> Trees = **recursion playground**

---

## 🧩 Problems

---

## 🟢 01 Create Binary Tree

`[Easy | Basics]`

> Build tree using nodes

```
    1
   / \
  2   3
```

🔗 [code]()

---

## 🟢 02 Preorder Traversal

`[Easy | Recursion]`

> Root → Left → Right

```
Output: 1 2 4 5 3
```

🔗 [code]()

---

## 🟢 03 Inorder Traversal

`[Easy | Recursion]`

> Left → Root → Right

```
Output: 4 2 5 1 3
```

🔗 [code]()

---

## 🟢 04 Postorder Traversal

`[Easy | Recursion]`

> Left → Right → Root

```
Output: 4 5 2 3 1
```

🔗 [code]()

---

## 🟡 05 Level Order Traversal (BFS)

`[Medium | Queue 🌊]`

> Traverse level by level

```
Output: 1 2 3 4 5
```

🔗 [code]()

---

## 🟢 06 Count Nodes

`[Easy | Recursion]`

> Total number of nodes

🔗 [code]()

---

## 🟢 07 Sum of Nodes

`[Easy | Recursion]`

> Sum of all values

🔗 [code]()

---

## 🟡 08 Height of Tree

`[Medium | Recursion Depth]`

> Max depth of tree

🔗 [code]()

---

## 🟡 09 Diameter of Tree

`[Medium | O(n²) / Optimized O(n)]`

> Longest path between nodes

🔗 [code]()

---

## 🔴 10 Check if Tree is Balanced

`[Hard | Height + Recursion]`

> Height difference ≤ 1

🔗 [code]()

---

## ⚙️ Key Concepts

* 🌿 **Tree Structure**
* 🔁 **DFS Traversals (Pre/In/Post)**
* 🌊 **BFS (Level Order)**
* 📏 **Height & Depth**
* 📊 **Diameter**

---

## 📊 Difficulty Flow

```
Traversal (DFS)
      ↓
BFS (Queue)
      ↓
Height → Diameter
      ↓
Balanced Tree
```

---

## 🧠 Pattern Recognition

* Recursive structure → trees
* Level-wise → queue (BFS)
* Depth-related → recursion
* Path problems → diameter

---

## 📌 Pro Insight

> Every tree problem is either:

* traversal
* height-based
* or combination of both

---


---

