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
