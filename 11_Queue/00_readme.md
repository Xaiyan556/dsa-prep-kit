

---

# 📬 Queue

> 🎯 Goal: Master FIFO → handle ordering, buffering, and sliding window problems

---

## 🧠 Mindset

* 📥 **Enqueue** → insert at rear
* 📤 **Dequeue** → remove from front
* 👀 **Peek** → front element

> Queue = **First In, First Out (FIFO)**

---

## 🧩 Problems

---

## 🟢 01 Implement Queue (Array)

`[Easy | Basics]`

> Fixed size queue

🔗 [code]()

---

## 🟢 02 Implement Queue (Circular Array)

`[Easy | Optimization]`

> Avoid wasted space

🔗 [code]()

---

## 🟢 03 Implement Queue (Linked List)

`[Easy | Dynamic]`

> No size limitation

🔗 [code]()

---

## 🟢 04 Enqueue, Dequeue, Peek

`[Easy | Operations]`

> Core queue operations

🔗 [code]()

---

## 🟡 05 Queue using Two Stacks

`[Medium | Simulation 🔁]`

> Implement FIFO using LIFO

🔗 [code]()

---

## 🟡 06 Stack using Two Queues

`[Medium | Simulation 🔁]`

> Reverse logic

🔗 [code]()

---

## 🟡 07 First Non-Repeating Character in Stream

`[Medium | Queue + Frequency]`

```text id="8ijy3s"
Input: "aabc"  
Output: a -1 b b
```

🔗 [code]()

---

## 🟡 08 Interleave Queue

`[Medium | Queue Manipulation]`

```text id="bkmq6u"
[1,2,3,4] → [1,3,2,4]
```

🔗 [code]()

---

## 🔴 09 Sliding Window Maximum

`[Hard | Deque 🔥]`

> Most important queue problem

```text id="z72j9j"
[1,3,-1,-3,5,3,6,7], k=3  
→ [3,3,5,5,6,7]
```

🔗 [code]()

---

## 🔴 10 Circular Tour (Petrol Pump)

`[Hard | Greedy + Queue]`

> Find starting point

🔗 [code]()

---

## 🔴 11 LRU Cache

`[Hard | Queue + HashMap ⚡]`

> Real-world system design problem

🔗 [code]()

---

## 🟡 12 Generate Binary Numbers

`[Medium | BFS Pattern]`

```text id="yb3b4z"
n = 5 → 1 10 11 100 101
```

🔗 [code]()

---

## ⚙️ Key Concepts

* 📬 **FIFO Principle**
* 🔁 **Circular Queue**
* 🔄 **Deque (Double-ended Queue)**
* 🧠 **Simulation Problems**
* 🌊 **Sliding Window Technique**

---

## 📊 Difficulty Flow

```text id="i57xan"
Basic Queue → Circular Queue
           ↓
Simulation (2 stacks/queues)
           ↓
Deque → Sliding Window
           ↓
Advanced (LRU, Greedy)
```

---

## 🧠 Pattern Recognition

* Order matters → queue
* Sliding window → deque
* Stream processing → queue
* BFS problems → queue

---

## 📌 Pro Insight

> Queue is about **maintaining order over time**

👉 Especially useful when:

* elements arrive dynamically
* processing happens sequentially

---

## 🚀 What’s Next?

* 🌳 Trees (BFS uses queue)
* 🔄 Deque advanced problems
* ⚡ Graphs (level order traversal)

---
