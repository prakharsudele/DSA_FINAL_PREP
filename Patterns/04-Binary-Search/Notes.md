
# Binary Search Variants

## Exact Search

Found?

Return immediately.

---

## First Occurrence

Found?

Store answer.

Search Left.

---

## Last Occurrence

Found?

Store answer.

Search Right.

---

## Rule

Finding the target does not always mean stopping.

Sometimes the answer is a boundary, not the first match.

---

# Candidate Answer

Sometimes finding a valid answer does not mean stopping.

Instead:

1. Store the current answer as a candidate.
2. Continue searching for a better answer.

Examples:

First Occurrence
→ Search Left

Last Occurrence
→ Search Right

Minimum Valid Answer
→ Search Smaller

Maximum Valid Answer
→ Search Larger

---

# Binary Search on Answer

Unlike classical Binary Search, `mid` is not an index.

`mid` represents a candidate answer.

Algorithm

1. Choose a candidate answer (`mid`).
2. Check if it is valid.
3. If valid:
   - Store it as the current best.
   - Search for a better answer.
4. If invalid:
   - Eliminate impossible answers.
  
   ---
