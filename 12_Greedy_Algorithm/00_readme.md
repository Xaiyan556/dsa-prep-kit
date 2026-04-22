
---

# 💰 Greedy Algorithms

> 🎯 Goal: Make locally optimal choices → achieve global optimum (when valid)

---

## 🧠 Mindset

* ⚡ Choose the **best option at the current step**
* ❌ No backtracking
* 🔁 Decisions are **final**

> Greedy works when:

* problem has **optimal substructure**
* **greedy choice property** holds

---

## 🧩 Problems

---

## 🟢 01 Activity Selection

`[Easy | Sorting + Selection]`

> Max number of non-overlapping activities

```text id="hfx8nl"
Start: [1,3,0,5,8,5]  
End:   [2,4,6,7,9,9]
```

🔗 [code]()

---

## 🟢 02 Fractional Knapsack

`[Easy | Ratio Greedy]`

> Max value with fractional items

```text id="y1z8gk"
value/weight → sort descending
```

🔗 [code]()

---

## 🟡 03 Job Sequencing Problem

`[Medium | Deadline Scheduling]`

> Max profit with deadlines

🔗 [code]()

---

## 🟡 04 Minimum Coins

`[Medium | Coin System]`

> Min coins to form value

```text id="rgt1h7"
Coins: [1,2,5,10]  
Amount: 27 → 10+10+5+2
```

🔗 [code]()

---

## 🟡 05 Assign Cookies

`[Medium | Matching Greedy]`

> Max children satisfied

🔗 [code]()

---

## 🔴 06 N Meetings in One Room

`[Hard | Variation of Activity Selection]`

🔗 [code]()

---

## 🔴 07 Minimum Platforms (Railway)

`[Hard | Interval Overlap]`

> Min platforms needed

🔗 [code]()

---

## 🔴 08 Gas Station (Circular Tour)

`[Hard | Greedy + Prefix Sum]`

> Find start index

🔗 [code]()

---

## 🔴 09 Candy Distribution

`[Hard | Two Pass Greedy]`

> Assign minimum candies

🔗 [code]()

---

## 🔴 10 Jump Game

`[Hard | Reachability]`

```text id="z8y6v1"
[2,3,1,1,4] → True
```

🔗 [code]()

---

## 🔴 11 Jump Game II

`[Hard | Min Jumps]`

> Min steps to reach end

🔗 [code]()

---

## 🟡 12 Merge Intervals

`[Medium | Sorting + Merge]`

```text id="6gl1gq"
[1,3], [2,6] → [1,6]
```

🔗 [code]()

---

## ⚙️ Key Concepts

* ⚡ **Greedy Choice Property**
* 🔁 **Sorting (very common)**
* 📊 **Intervals**
* 🧮 **Ratios (value/weight)**
* ⏱️ **Deadlines & Scheduling**

---

## 📊 Difficulty Flow

```text id="9o5zsc"
Simple Selection → Ratio Problems
               ↓
Sorting + Matching
               ↓
Intervals + Scheduling
               ↓
Advanced (Jump Game, Candy)
```

---

## 🧠 Pattern Recognition

* Sort + pick → greedy
* Interval problems → greedy
* Min/Max optimization → try greedy
* If revisiting needed → NOT greedy

---

## 📌 Pro Insight

> Greedy is **fast but risky**

👉 Always ask:

* Can local choice guarantee global optimum?

---

## 🚀 What’s Next?

* 📊 Dynamic Programming (when greedy fails)
* 🌳 Graph algorithms (MST uses greedy)
* ⚡ Advanced interval problems

---

## 🔥 Greedy vs DP (Important)

| Feature      | Greedy ⚡  | DP 🧠             |
| ------------ | --------- | ----------------- |
| Decision     | Local     | Global            |
| Speed        | Fast      | Slower            |
| Backtracking | ❌         | ✅                 |
| Use case     | When safe | When greedy fails |

---
