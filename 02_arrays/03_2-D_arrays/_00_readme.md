
# 📊 2-D Arrays (Matrix)

> 🎯 Goal: Master grid traversal → understand row/column logic → solve matrix-based problems

---

## 🧠 Mindset

* 📦 Matrix = **array of arrays**
* 🔢 Access via: `arr[row][col]`
* 🔁 Problems = **directional traversal**

---

## 🧩 Problems

---

## 🟢 01 Input & Output

`[Easy | Basics]`

> Read and print matrix

🔗 [code]()

---

## 🟢 02 Linear Search in Matrix

`[Easy | Traversal]`

> Find element

🔗 [code]()

---

## 🟢 03 Find Largest Element

`[Easy | Traversal]`

> Max in matrix

🔗 [code]()

---

## 🟡 04 Row-wise Sum

`[Medium | Aggregation]`

> Sum each row

🔗 [code]()

---

## 🟡 05 Column-wise Sum

`[Medium | Aggregation]`

> Sum each column

🔗 [code]()

---

## 🟡 06 Diagonal Sum

`[Medium | Index Trick 🔥]`

```text id="2m7h4p"
Primary: (i == j)  
Secondary: (i + j == n-1)
```

🔗 [code]()

---

## 🟡 07 Transpose Matrix

`[Medium | Swap Logic]`

> Convert rows → columns

```text id="8k3w1n"
arr[i][j] → arr[j][i]
```

🔗 [code]()

---

## 🔴 08 Spiral Matrix Traversal

`[Hard | Boundary Traversal 🔥]`

```text id="k1r9vz"
Top → Right → Bottom → Left
```

🔗 [code]()

---

## 🔴 09 Search in Sorted Matrix

`[Hard | Staircase Search]`

```text id="4t6yq8"
Start from top-right  
Move left/down
```

🔗 [code]()

---

## 🟡 10 Rotate Matrix (90°)

`[Medium | Transpose + Reverse]`

🔗 [code]()

---

## 🔴 11 Set Matrix Zeroes

`[Hard | In-place Marking]`

> If 0 → row & column = 0

🔗 [code]()

---

## 🔴 12 Word Search

`[Hard | Backtracking 🧠]`

> DFS on grid

🔗 [code]()

---

## ⚙️ Key Concepts

* 📦 **Row & Column traversal**
* 🔁 **Nested loops**
* 🧭 **Direction vectors (up/down/left/right)**
* 🔄 **Transpose & Rotation**
* 📊 **Boundary traversal**

---

## 📊 Difficulty Flow

```text id="8y2mcs"
Traversal → Row/Column Ops
        ↓
Diagonal → Transpose
        ↓
Spiral → Rotation
        ↓
Advanced (Search, Backtracking)
```

---

## 🧠 Pattern Recognition

* Full scan → nested loops
* Diagonal → index relation
* Spiral → boundary control
* Grid DFS → backtracking
* Sorted matrix → optimized search

---

## 📌 Pro Insight

> Matrix problems are about **movement strategy**

👉 Always define:

* direction
* boundaries
* stopping condition

---

## 🚀 What’s Next?

* 🌊 Graphs (grid = graph)
* 🧠 Backtracking (maze, DFS)
* ⚡ Dynamic Programming on grids

---
