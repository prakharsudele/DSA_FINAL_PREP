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

# Monotonic Stack

## Recognition

Use when asking:

- Next Greater
- Previous Greater
- Next Smaller
- Previous Smaller

---

## State

A stack containing useful candidates that may answer future queries.

The stack stores exactly the information needed to compute the answer.

Examples

LC 496

(value)

LC 739

(value, index)

---

## Invariant

The stack is maintained in monotonic order.

Every element removed from the stack can never become an answer again.

---

## Generic Algorithm

Traverse in the direction opposite to where the answer lies.

Remove useless candidates.

Top becomes the answer.

Insert the current element.

---

### LC 901 - Online Stock Span

**State:**
Stack stores `(price, span)`.

**Invariant:**
Prices in the stack remain strictly decreasing from bottom to top.

Each `(price, span)` represents a compressed block of consecutive days
whose prices are less than or equal to that price.

**When current price >= stack top:**
The current price can absorb the entire span represented by the top.

So:

currentSpan += poppedSpan

**Complexity:**
Time: O(n) amortized over n calls
Space: O(n)

---
