
# 🔷 Advanced Patterns – Practice & Mastery

> 🎯 Goal: Crack pattern logic → visualize symmetry → code efficiently

---

## 🧠 Mindset for Pattern Problems

* 🔁 **Outer loop → rows**
* 🔢 **Inner loop → columns / elements**
* 📐 Always observe:

  * symmetry (mirror / center)
  * spaces vs characters
  * increment / decrement flow

---

## 🧩 Problems

---

### 1. Hollow Rectangle
`easy+| [✔] `
> Print rectangle with borders only

```
* * * * * *
*         *
*         *
*         *
* * * * * *
```

🔗 [view code]()

---

### 2. Inverted Rotated Half Pyramid
`easy+| [✔] `
> Right-aligned decreasing pattern

```
        *
      * *
    * * *
  * * * *
* * * * *
```

🔗 [view code]()

---

### 3. Inverted Half Pyramid (Numbers)
`easy| [✔] `
> Numbers decrease row-wise

```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

🔗 [view code]()

---

### 4. Floyd’s Triangle
`easy| [✔] `
> Continuous number pattern

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

🔗 [view code]()

---

### 5. 0-1 Triangle
`easy+| [✔] `
> Based on (i + j) parity logic

```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

🔗 [view code]()

---

### 6. Butterfly Pattern
`hard| [✔] `
> Mirror + symmetry based pattern

```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

🔗 [view code]()

---

### 7. Solid Rhombus
`medium| [✔] `
> Shifted square using spaces

```
    * * * * *
   * * * * *
  * * * * *
 * * * * *
* * * * *
```

🔗 [view code]()

---

### 8. Hollow Rhombus
`medium+| [✔] `
> Borders only rhombus

```
    * * * * *
   *       *
  *       *
 *       *
* * * * *
```

🔗 [view code]()

---

### 9. Diamond Pattern
`medium | [✔] `
> Pyramid + inverted pyramid

```
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

🔗 [view code]()

---

### 10. Number Pyramid
`hard | [✔] `
> Center-aligned increasing numbers

```
    1
   1 2 1
  1 2 3 2 1
 1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
```

🔗 [view code]()

---

### 11. Palindrome Pattern
`medium+| [✔] `
> Symmetric number structure

```
    1
   2 1 2
  3 2 1 2 3
 4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
```

🔗 [view code]()
<!--
---

## 🚀 Advanced Problems (Next Level)

---

### 12. Pascal’s Triangle

> Based on combinations (nCr)

```
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

🔗 [view code]()

---

### 13. Spiral Matrix Pattern

> Print in spiral order

```
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7
```

🔗 [view code]()

---

### 14. Zig-Zag Pattern

> Alternating row directions

```
*       *
  *   *
    *
  *   *
*       *
```

🔗 [view code]()

---

### 15. Hourglass Pattern

> Shrinking + expanding symmetry

```
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
```

🔗 [view code]()

---

### 16. Sandglass Pattern

> Combination of pyramids

```
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
```

🔗 [view code]()

---

### 17. Character Pyramid

> Alphabet-based pattern

```
    A
   A B A
  A B C B A
 A B C D C B A
```

🔗 [view code]()

---

### 18. Binary Pyramid

> Alternating 0/1 in pyramid form

```
    1
   0 1
  1 0 1
 0 1 0 1
```

🔗 [view code]()
-->
---

## ⚙️ Key Pattern Techniques

* 🔹 **Space management**

  * `" ".repeat(n-i)` logic
* 🔹 **Symmetry**

  * Top = Bottom mirror
* 🔹 **Math trick**

  * `(i + j) % 2` for binary patterns
* 🔹 **Center alignment**

  * `2*n - 1` column rule

---

## 🧪 Practice Strategy

1. 👀 Dry run on paper
2. ✍️ Identify loops
3. 🔄 Convert to code
4. ⚡ Optimize spacing


