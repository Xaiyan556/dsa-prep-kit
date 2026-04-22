
---

# 🌳 Binary Trees – II

> 🎯 Goal: Solve advanced tree problems → master recursion + structural transformations

---

## 🧠 Mindset Shift

* 🔁 Not just traversal → now **decision + return values**
* 🧠 Think in terms of:

  * subtree results
  * combining answers
* ⚙️ Each function returns **meaningful info upward**

---

## 🧩 Problems

---

## 🟡 01 Lowest Common Ancestor (LCA)

`[Medium | Recursion 🌿]`

> Find lowest node common to both

```text id="3l4o0d"
LCA(4,5) → 2
```

🔗 [code]()

---

## 🟡 02 Kth Level of Tree

`[Medium | DFS/BFS]`

> Print all nodes at level k

🔗 [code]()

---

## 🔴 03 Distance Between Two Nodes

`[Hard | LCA + Distance]`

> dist(a,b) = dist(root,a) + dist(root,b) - 2*dist(root,lca)

🔗 [code]()

---

## 🟡 04 Kth Ancestor

`[Medium | Backtracking]`

> Find kth parent

🔗 [code]()

---

## 🔴 05 Convert to Sum Tree

`[Hard | Tree Transformation]`

> Node = sum of left + right subtree

🔗 [code]()

---

## 🔴 06 Check Subtree

`[Hard | Tree Matching]`

> Check if one tree exists inside another

🔗 [code]()

---

## 🔴 07 Top View of Tree

`[Hard | BFS + Map 🧠]`

> First node at each horizontal distance

🔗 [code]()

---

## 🔴 08 Bottom View of Tree

`[Hard | BFS + Map]`

> Last node at each horizontal distance

🔗 [code]()

---

## 🔴 09 Vertical Order Traversal

`[Hard | BFS + Sorting]`

> Group nodes by vertical lines

🔗 [code]()

---

## 🟡 10 Left View of Tree

`[Medium | BFS/DFS]`

> First node of each level

🔗 [code]()

---

## 🟡 11 Right View of Tree

`[Medium | BFS/DFS]`

> Last node of each level

🔗 [code]()

---

## 🔴 12 Path Sum (Root to Leaf)

`[Hard | Recursion + Backtracking]`

> Check if path equals target

🔗 [code]()

---

## 🔴 13 All Root-to-Leaf Paths

`[Hard | Backtracking]`

> Print all paths

🔗 [code]()

---

## ⚙️ Key Concepts

* 🌿 **LCA (Core building block)**
* 🔁 **Recursion + Return values**
* 🧠 **Backtracking**
* 🌊 **BFS + HashMap (Views)**
* 📏 **Distance & Levels**

---

## 📊 Difficulty Flow

```text id="u6zt5r"
LCA → Level Problems
     ↓
Ancestor → Distance
     ↓
Views (Top/Bottom)
     ↓
Transformation + Paths
```

---

## 🧠 Pattern Recognition

* Two nodes → LCA
* Level-based → BFS
* Path problems → recursion + backtracking
* View problems → horizontal distance + map
* Tree modification → postorder traversal

---

## 📌 Pro Insight

> Most advanced tree problems reduce to:

* LCA
* DFS recursion
* BFS with map

👉 Master these → trees become predictable

---

## 🚀 What’s Next?

* 🌲 Binary Search Trees (BST)
* 🌐 Graphs (tree concepts extend here)
* ⚡ DP on Trees

---
