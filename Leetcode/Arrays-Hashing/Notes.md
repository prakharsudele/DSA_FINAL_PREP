# Arrays & Hashing

---

# 1. What is an Array?

An array is a collection of elements stored in **contiguous memory locations**.

Example:

```
Index : 0 1 2 3 4

Value : 5 8 1 9 3
```

Since memory is contiguous, accessing any element by its index takes **O(1)** time.

---

# 2. Why are Arrays Important?

Arrays are the foundation of many data structures and algorithms.

Many interview problems are built upon arrays.

Examples:

- ArrayList
- Prefix Sum
- Sliding Window
- Binary Search
- Heap
- Dynamic Programming
- Segment Tree

Mastering arrays makes learning later topics much easier.

---

# 3. Common Array Problem Types

### Traversal

Visit every element exactly once.

Examples:

- Find maximum
- Find minimum
- Count elements
- Calculate sum

Pattern:

```
for every element
    process it
```

---

### Searching

Find something.

Examples:

- Target element
- Maximum
- Minimum
- First occurrence

---

### Counting

Count occurrences.

Examples:

- Count even numbers
- Count zeros
- Count duplicates

---

### Rearrangement

Modify the array.

Examples:

- Reverse
- Rotate
- Move Zeroes

---

### Simulation

Follow the rules exactly as stated.

Examples:

- Spiral Matrix
- Game of Life
- Shift Operations

---

# 4. Questions to Ask Before Solving

Whenever you see an array question, ask:

✅ Do I need to visit every element?

→ Traversal

---

✅ Am I looking for maximum/minimum?

→ Keep a running answer.

---

✅ Do I need previous information?

→ Prefix Sum or HashMap.

---

✅ Do I need two ends?

→ Two Pointers.

---

✅ Am I working on a contiguous subarray?

→ Sliding Window or Prefix Sum.

---

# 5. Basic Traversal Template

```java
for (int i = 0; i < arr.length; i++) {

}
```

Time Complexity:

O(n)

Space Complexity:

O(1)

---

# 6. Common Mistakes

❌ Off-by-one errors

❌ Comparing arr[i] with arr[i+1] without checking bounds

❌ Using extra arrays unnecessarily

❌ Ignoring edge cases

- Empty array
- Single element
- Duplicate elements

---

# 7. Revision Summary

✔ Arrays provide O(1) indexing.

✔ Traversal is the most common pattern.

✔ Always identify the problem type before coding.

✔ Start with brute force, then optimize.

✔ Practice recognizing patterns rather than memorizing solutions.
