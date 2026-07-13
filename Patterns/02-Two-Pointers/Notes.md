# Two Pointers

---

# 1. Motivation

Many problems compare pairs of elements.

A brute-force solution checks every pair using nested loops.

Time Complexity

O(n²)

If the array has some useful property (often sorted), we can use two pointers to solve it in O(n).

---

# 2. Core Idea

Maintain two indices.

One starts from the beginning.

One starts from the end.

Use the problem's properties to decide which pointer should move.

---

# 3. Opposite Direction Pattern

```
L               R

1 2 4 6 10 15
```

If current sum is too small

Move Left.

If current sum is too large

Move Right.

---

# 4. Why Does It Work?

Sorting creates monotonicity.

Moving

Left →

Increases value.

Moving

Right ←

Decreases value.

This allows us to eliminate many impossible pairs without checking them.

---

# 5. Java Template

```java
int left = 0;
int right = nums.length - 1;

while(left < right){

    int sum = nums[left] + nums[right];

    if(sum == target){
        // answer found
    }

    else if(sum < target){
        left++;
    }

    else{
        right--;
    }
}
```

---

# 6. Complexity

Time

O(n)

Space

O(1)

---

# 7. Pattern Recognition

Think of Two Pointers when

✅ Array is sorted

✅ Need a pair

✅ Need to compare two ends

✅ Need O(n) instead of O(n²)

---

# 8. Common Mistakes

❌ Forgetting the array must be sorted

❌ Moving the wrong pointer

❌ Using <= instead of <

---

# 9. Revision Summary

✔ Sorted array

✔ Two indices

✔ Move one pointer each iteration

✔ O(n)

---

# Two Pointer Patterns

There are two major categories.

---

## 1. Opposite Direction

Used when

- Array is sorted
- Need a pair
- Reverse
- Palindrome

Example

Left →

← Right

---

## 2. Same Direction

One pointer explores.

One pointer builds or tracks.

Usually

Slow Pointer

Fast Pointer

The fast pointer scans.

The slow pointer stores the answer.

---

## Interview Question

Before writing code ask

Which pointer is exploring?

Which pointer is maintaining the answer?

---
