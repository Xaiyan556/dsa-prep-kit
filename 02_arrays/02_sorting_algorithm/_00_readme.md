
---

# 🔃 Sorting Algorithms

> 🎯 Goal: Arrange data efficiently → understand time/space trade-offs → choose optimal algorithm

---

## 🧠 Mindset

* 🔀 Sorting = **reordering elements**
* ⚖️ Trade-offs:

  * time complexity
  * space usage
  * stability

> No single “best” sort — depends on constraints

---

## 🧩 Algorithms

---

## 🟢 01 Bubble Sort

`[Easy | Brute Force]`

> Repeatedly swap adjacent elements

```text id="a2x91m"
Time: O(n²)
```

🔗 [code]()

---

## 🟢 02 Selection Sort

`[Easy | Selection]`

> Pick minimum and place it

```text id="h7t2dp"
Time: O(n²)
```

🔗 [code]()

---

## 🟢 03 Insertion Sort

`[Easy | Incremental Build]`

> Insert element in sorted part

```text id="m2s5q8"
Best: O(n)
Worst: O(n²)
```

🔗 [code]()

---

## 🟡 04 Merge Sort

`[Medium | Divide & Conquer 🔥]`

> Split → sort → merge

```text id="v8l4we"
Time: O(n log n)
Space: O(n)
```

🔗 [code]()

---

## 🟡 05 Quick Sort

`[Medium | Partitioning ⚡]`

> Pivot-based sorting

```text id="r3d9kw"
Avg: O(n log n)
Worst: O(n²)
```

🔗 [code]()

---

## 🟡 06 Count Sort

`[Medium | Non-Comparison]`

> Works for small range integers

```text id="0c4kzy"
Time: O(n + k)
```

🔗 [code]()

---

## 🔴 07 Radix Sort

`[Hard | Digit-based]`

> Sort by digits (LSD/MSD)

🔗 [code]()

---

## 🔴 08 Bucket Sort

`[Hard | Distribution]`

> Divide into buckets

🔗 [code]()

---

## 🟡 09 Heap Sort

`[Medium | Heap Structure 🌳]`

> Use max/min heap

```text id="f9x3pz"
Time: O(n log n)
```

🔗 [code]()

---

## ⚙️ Key Concepts

* 🔀 **Comparison vs Non-Comparison Sort**
* 📊 **Time Complexity**
* 📦 **Space Complexity**
* 🔁 **Stability**
* 🌳 **Heap Structure**

---

## 📊 Complexity Table (Important)

```text id="x4z8c1"
Algorithm      Time (Best / Avg / Worst)    Space   Stable
---------------------------------------------------------
Bubble         n / n² / n²                 O(1)     Yes
Selection      n² / n² / n²                O(1)     No
Insertion      n / n² / n²                 O(1)     Yes
Merge          n log n / n log n / n log n O(n)     Yes
Quick          n log n / n log n / n²      O(log n) No
Heap           n log n / n log n / n log n O(1)     No
```

---

## 📊 Difficulty Flow

```text id="t7h3x2"
Basic Sorts → Bubble/Selection/Insertion
          ↓
Divide & Conquer → Merge/Quick
          ↓
Special Sorts → Count/Radix/Bucket
          ↓
Heap-based Sorting
```

---

## 🧠 Pattern Recognition

* Small input → simple sort
* Nearly sorted → insertion sort
* Large data → merge/quick
* Range-based → count sort
* Priority problems → heap

---

## 📌 Pro Insight

> Sorting is not just about order…
> it’s about **enabling faster operations later (search, grouping, etc.)**

---

## 🚀 What’s Next?

* 🔍 Searching Algorithms (Binary Search)
* 📊 Arrays + Sorting combos
* ⚡ Greedy & Interval problems (require sorting)

---

