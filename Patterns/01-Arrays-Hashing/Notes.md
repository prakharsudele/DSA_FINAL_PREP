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

---

# Prefix Sum

---

# 1. Motivation

Consider the array:

```
Index : 0 1 2 3 4 5 6

Value : 2 5 3 8 6 1 4
```

Suppose someone asks:

Sum from index 2 to 5

Answer:

3 + 8 + 6 + 1 = 18

Easy.

Now suppose there are **100,000 such queries**.

If we calculate every query by traversing the range, each query takes O(n).

Total Complexity:

O(n × q)

This is too slow.

We need a way to answer each query instantly.

---

# 2. The Main Idea

Instead of calculating every range repeatedly,

calculate cumulative sums once.

Example:

Original Array

```
2 5 3 8 6 1 4
```

Prefix Sum Array

```
2 7 10 18 24 25 29
```

Each position stores the sum from index 0 to i.

Example:

prefix[3]

=

2 + 5 + 3 + 8

=

18

---

# 3. Building Prefix Sum

Formula

prefix[0] = arr[0]

For every remaining element

prefix[i] = prefix[i-1] + arr[i]

Example

```
arr

2 5 3 8 6 1 4

prefix

2
2+5=7
7+3=10
10+8=18
18+6=24
24+1=25
25+4=29
```

Time Complexity

O(n)

Space Complexity

O(n)

---

# 4. Finding Range Sum

Suppose we need

Sum(2...5)

Instead of

3+8+6+1

Observe

prefix[5]

contains

2+5+3+8+6+1

Remove

prefix[1]

which is

2+5

Remaining

3+8+6+1

Formula

RangeSum(L,R)

If L == 0

answer = prefix[R]

Else

answer = prefix[R] - prefix[L-1]

This gives O(1) query time.

---

# 5. Dry Run

Array

```
2 5 3 8 6 1 4
```

Prefix

```
2 7 10 18 24 25 29
```

Query

L = 2

R = 5

Answer

prefix[5] - prefix[1]

25 - 7

18

Correct.

---

# 6. Java Template

```java
int[] prefix = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++){
    prefix[i] = prefix[i-1] + arr[i];
}
```

Range Sum

```java
int rangeSum(int L, int R){
    if(L == 0)
        return prefix[R];

    return prefix[R] - prefix[L-1];
}
```

---

# 7. Complexity

Building Prefix

O(n)

Each Query

O(1)

Extra Space

O(n)

---

# 8. Pattern Recognition

Think about Prefix Sum whenever you see

✅ Multiple range sum queries

✅ Contiguous subarray

✅ Running cumulative values

✅ Need fast repeated calculations

---

# 9. Common Mistakes

❌ Forgetting L == 0

❌ Wrong subtraction

prefix[L] instead of prefix[L-1]

❌ Building prefix incorrectly

❌ Confusing prefix sum with sliding window

---

# 10. Revision Summary

✔ Build once.

✔ Query many times.

✔ Prefix stores sum from index 0.

---

# HashMap Fundamentals

---

# 1. Motivation

Many array problems ask:

"Have I seen something before?"

Without remembering previous elements, we repeatedly search the array, leading to O(n²) solutions.

A HashMap lets us remember useful information while traversing the array.

---

# 2. Core Idea

Instead of searching the remaining array,

store useful information as you traverse.

Future elements can immediately check whether the required information already exists.

This often reduces

O(n²)

↓

O(n)

---

# 3. What is a HashMap?

A HashMap stores

Key → Value

Example

```
2 → index 0

7 → index 1

11 → index 2
```

Average Time Complexity

Insert

O(1)

Search

O(1)

Delete

O(1)

Worst case can degrade to O(n), but Java's implementation is highly optimized, so we treat average operations as O(1) in interviews.

---

# 4. Common Uses

Store

- Frequency
- Index
- Previous occurrence
- Prefix Sum
- Character count

---

# 5. Pattern Recognition

Think about HashMap when

✅ Need fast lookup

✅ Need frequency count

✅ Need duplicate detection

✅ Need to remember previous values

✅ Need O(1) searching

---

# 6. Java Template

```java
HashMap<Integer,Integer> map = new HashMap<>();

map.put(key,value);

map.get(key);

map.containsKey(key);

map.remove(key);
```

---

# 7. Common Mistakes

❌ Using HashMap when an array is sufficient

❌ Forgetting duplicate keys overwrite previous values

❌ Calling get() without checking containsKey()

---

# 8. Revision Summary

✔ HashMap remembers information while traversing.

✔ Most HashMap problems become one-pass solutions.

✔ Ask yourself:

"What information should I store so future elements can benefit?"

✔ Range Sum = prefix[R] - prefix[L-1]

✔ Construction O(n)

---

✔ Query O(1)
