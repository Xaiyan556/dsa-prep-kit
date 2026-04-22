

---

# 🌳 Binary Trees – III

> 🎯 Goal: Master complex tree patterns → combine recursion, BFS, and DP

---

## 🧠 Mindset Shift

* 🧠 Trees now = **state propagation**
* 🔁 Think:

  * what to pass down
  * what to return up
* ⚙️ Combine:

  * recursion + global answer
  * BFS + mapping
  * tree → graph conversion

---

## 🧩 Problems

---

## 🔴 01 Maximum Path Sum

`[Hard | Tree DP 🔥]`

> Max sum between any two nodes

```text id="h6t4d2"
Key: ignore negative paths
```

🔗 [code]()

---

## 🔴 02 Binary Tree to Doubly Linked List

`[Hard | Inorder + Pointer Manipulation]`

> Convert tree to DLL

🔗 [code]()

---

## 🔴 03 Serialize & Deserialize Binary Tree

`[Hard | Design + BFS/DFS]`

> Convert tree ↔ string

🔗 [code]()

---

## 🔴 04 Flatten Binary Tree to Linked List

`[Hard | Preorder + Pointer]`

```text id="wd7xtj"
Tree → right-skewed list
```

🔗 [code]()

---

## 🔴 05 Nodes at Distance K

`[Hard | Tree → Graph + BFS]`

> Convert to parent map

🔗 [code]()

---

## 🔴 06 Burn Binary Tree

`[Hard | BFS + Parent Mapping]`

> Time to burn whole tree

🔗 [code]()

---

## 🔴 07 Count Good Nodes

`[Hard | DFS + Tracking]`

> Node ≥ max seen so far

🔗 [code]()

---

## 🔴 08 Maximum Width of Binary Tree

`[Hard | BFS + Indexing]`

> Track positions

🔗 [code]()

---

## 🔴 09 Check Complete Binary Tree

`[Hard | BFS Logic]`

> No gaps allowed

🔗 [code]()

---

## 🔴 10 Boundary Traversal

`[Hard | Traversal + Conditions]`

> Left + Leaf + Right boundary

🔗 [code]()

---

## 🔴 11 Zig-Zag Traversal

`[Hard | BFS + Direction Switch]`

```text id="eaq2m7"
Level order but alternate direction
```

🔗 [code]()

---

## 🔴 12 Construct Tree from Traversals

`[Hard | Divide & Conquer]`

> Build using:

* preorder + inorder
* inorder + postorder

🔗 [code]()

---

## ⚙️ Key Concepts

* 🌿 **Tree DP (return + global answer)**
* 🔁 **Tree ↔ Graph conversion**
* 🌊 **BFS with indexing / mapping**
* 🧠 **State tracking (max, path, parent)**
* 🔧 **Tree construction**

---

## 📊 Difficulty Flow

```text id="36mq6p"
Path Problems (Max Sum)
        ↓
Transformations (Flatten, DLL)
        ↓
Graph Conversion (Distance K, Burn)
        ↓
Traversal Variants (Zigzag, Boundary)
        ↓
Construction Problems
```

---

## 🧠 Pattern Recognition

* Path max/min → DP on trees
* Distance problems → convert to graph
* Alternate traversal → BFS tweak
* Build tree → divide & conquer
* Structure validation → BFS

---

## 📌 Pro Insight

> Advanced trees = combination of:

* DFS (recursion)
* BFS (queue)
* HashMap (parent / index tracking)

👉 You rarely solve these with **just one technique**

---

## 🚀 What’s Next?

* 🌲 Binary Search Trees (BST)
* 🌐 Graphs (tree → graph transition)
* ⚡ DP on Trees (very important for interviews)

---

