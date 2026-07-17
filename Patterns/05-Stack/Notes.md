# Stack Framework

## Recognition

Use Stack when

- Matching pairs
- Undo operations
- Nested structures
- Most recent unfinished work
- Need Last-In First-Out (LIFO)

---

## Invariant

The stack stores unfinished work.

Whenever work is completed,

remove it from the top.

---

## Common Operations

push()

pop()

peek()

isEmpty()

---

# Monotonic Stack

## Recognition

Use Monotonic Stack when the problem asks for

- Next Greater Element
- Previous Greater Element
- Next Smaller Element
- Previous Smaller Element

or when useless elements can be discarded forever.

---

## Invariant

The stack is maintained in sorted order.

Depending on the problem,

- Increasing Stack
- Decreasing Stack

---

## Generic Algorithm (Next Greater)

Traverse from right to left.

While stack top <= current

    pop

Top becomes answer.

Push current.

---
