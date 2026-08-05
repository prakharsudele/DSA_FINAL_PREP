# Heap

## Definition

A Heap is a Complete Binary Tree satisfying the Heap Property.

---

## Types

### Min Heap

Parent <= Children

Root contains the minimum element.

---

### Max Heap

Parent >= Children

Root contains the maximum element.

---

## Complete Binary Tree

Every level is completely filled except possibly the last.

The last level is filled from left to right.

---

## Array Representation

Left Child

2*i + 1

Right Child

2*i + 2

Parent

(i-1)/2

---

## Java

Min Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

Max Heap

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>(Collections.reverseOrder());
```

Operations

offer(x)

poll()

peek()

isEmpty()

size()

---

## Complexity

Peek

O(1)

Insert

O(logN)

Delete Root

O(logN)

Build Heap

O(N)

---

## Recognition

Think Heap when

- Top K
- Largest / Smallest repeatedly
- Priority Scheduling
- Streaming Data

---

## Pattern 1 - Repeated Max/Min Extraction

Recognition

Repeatedly remove the largest/smallest element.

Examples

- Last Stone Weight

Approach

1. Build Max Heap
2. Remove two largest elements
3. Process them
4. Insert the new value if required

Heap Invariant

The root always stores the largest remaining element.

Complexity

Time : O(N log N)

Space : O(N)

---

## Heap Pattern 2 - Top K

Recognition

Need only K best elements.

Examples

- Kth Largest
- Top K Frequent
- K Closest Points

Framework

1. Compute the metric (if needed)
   - Frequency
   - Distance
   - Score

2. Maintain a Min Heap of size K.

3. If heap size exceeds K

↓

Remove the root.

Heap Invariant

Heap always stores the K best candidates.

The root is the worst among those K candidates.

---

# Heap Patterns

## Pattern 1 - Repeated Extraction

Recognition

Repeatedly need the smallest/largest element.

Examples

- Last Stone Weight

Heap

Min Heap / Max Heap

Invariant

Root always stores the next element to process.

---

## Pattern 2 - Top K

Recognition

Need only K best elements.

Examples

- Kth Largest
- Top K Frequent
- K Closest Points

Framework

Compute metric if required

↓

Maintain heap of size K

↓

If size > K

↓

Remove root

Invariant

Heap always stores the K best candidates.

Root is the worst among those K candidates.

---

## Comparator Rule

Question 1

What is stored?

Examples

Number

(Number, Frequency)

Point

Meeting

Question 2

What is compared?

Examples

Value

Frequency

Distance

Finish Time

Question 3

What should be at the root?

Smallest?

↓

Min Heap

Largest?

↓

Max Heap

---
