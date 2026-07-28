# Queue

## Definition

Queue follows FIFO (First In First Out).

The first inserted element is removed first.

---

## Operations

Enqueue (offer)

Insert at rear.

Time

O(1)

---

Dequeue (poll)

Remove front element.

Time

O(1)

---

Peek

Return front element.

Time

O(1)

---

isEmpty()

Checks if queue is empty.

---

## Java

```java
Queue<Integer> q = new LinkedList<>();
```

Operations

```java
q.offer(x);

q.poll();

q.peek();

q.isEmpty();

q.size();
```

---

## Queue vs Stack

Queue

FIFO

Used in

- BFS
- Level Order Traversal
- Shortest Path

Stack

LIFO

Used in

- DFS
- Recursion
- Expression Evaluation

---

## Recognition

Ask

"Should the oldest discovered element be processed first?"

If yes

↓

Queue.

---
