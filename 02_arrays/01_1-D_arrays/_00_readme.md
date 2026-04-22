
---

# 📊 1-D Arrays

> 🎯 Goal: Master indexing → optimize traversal → solve range & subarray problems

---

## 🧠 Mindset

* 📦 Array = **contiguous memory**
* ⚡ Access = **O(1)**
* 🔁 Most problems = **patterns on traversal**

---

## 🧩 Problems


---

## 🟢 01 Linear Search

`[Easy | Traversal]`

> Find element

```text id="j0m7x9"
[1,3,5,7], key=5 → index=2
```

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_01_Linear_Search.java)

---

## 🟢 02 Find Largest Element

`[Easy | Traversal]`

> Max value in array

🔗 [code-I](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_02_Largest_NumberI.java)

🔗 [code-II](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_02_Largest_NumberII.java)

---


## 🟢 03 Find smallest Element

`[Easy | Traversal]`

> Min value in array

🔗 [code-I](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_03_Smallest_number.java)


---

## 🟢 04 Reverse Array

`[Easy | Two Pointer]`

```text id="zv34d2"
[1,2,3] → [3,2,1]
```

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_05_ReverseArray.java)

---

## 🟡 05 Binary Search

`[Medium | Divide & Conquer 🔥]`

> Works on sorted array

```text id="u2zj8k"
Time: O(log n)
```

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_04_binary_Search.java)

---

## 🟡 06 Pairs in Array

`[Medium | Nested Loop]`

> Print all pairs

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_06_PairsInArrays.java)

---

## 🟡 07 Subarrays

`[Medium | Nested Loop]`

> Generate all subarrays

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_07_Subarrays.java)

---

## 🔴 08 Maximum Subarray Sum (Brute)

`[Hard | O(n³)]`

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_08_MaxSubarrayBruteForce.java)

---
## 🔴 08 Maximum Subarray Sum (prefix sum)

`[Hard | O(n³)]`

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_09_MaxSubarrayPrefix.java)

---
## 🔴 09 Maximum Subarray Sum (Kadane’s Algo)

`[Hard | Greedy + DP ⚡]`

```text id="3nkp0p"
Key: maxEndingHere + maxSoFar
```

🔗 [code](https://github.com/Xaiyan556/dsa-prep-kit/blob/main/02_arrays/01_1-D_arrays/_10_MaxSubarraykadane.java)

---

## 🟡 10 Trapping Rain Water

`[Medium | Two Pointer 💧]`

🔗 [code]()

---

## 🟡 11 Buy & Sell Stock

`[Medium | Greedy 📈]`

> Max profit

```text id="6lxt8v"
[7,1,5,3,6,4] → 5
```

🔗 [code]()

---
<!--

## 🔴 12 Prefix Sum Array

`[Hard | Range Query ⚡]`

> Precompute sums

🔗 [code]()


---

## 🟡 14 Majority Element

`[Medium | Boyer-Moore 🧠]`

🔗 [code]()

---

## 🟡 15 Move Zeros to End

`[Medium | Two Pointer]`

```text id="s1m4k7"
[0,1,0,3] → [1,3,0,0]
```

🔗 [code]()

--->

## ⚙️ Key Concepts

* 📦 **Indexing**
* 🔁 **Traversal**
* 👯 **Two Pointer Technique**
* 📊 **Prefix Sum**
* ⚡ **Kadane’s Algorithm**

---

## 📊 Difficulty Flow

```text id="g7p2mx"
Traversal → Search
        ↓
Pairs → Subarrays
        ↓
Two Pointer
        ↓
Prefix Sum → Kadane
```

---

## 🧠 Pattern Recognition

* Max/min subarray → Kadane
* Range queries → prefix sum
* Sorted array → binary search
* Rearrangement → two pointer

---

## 📌 Pro Insight

> Arrays are not about storage…
> they’re about **patterns over indices**

---

## 🚀 What’s Next?

* 📊 2-D Arrays (Matrix problems)
* 🔄 Sliding Window
* ⚡ Hashing (for optimization)

---
