# Recursion

## Recognition

Use recursion when a problem can be expressed as a smaller version of itself.

Examples

- Tree Traversal
- DFS
- Backtracking
- Dynamic Programming
- Divide and Conquer

---

## Core Idea

Don't solve the whole problem.

Assume the smaller problem is already solved.

Only solve the current level.

---

## Components

1. Base Case

Stops recursion.

2. Recursive Call

Calls the same function on a smaller input.

3. Combine

Uses the smaller answer to build the current answer.

---

## Framework

Problem

↓

Smaller Problem

↓

Base Case

↓

Recursive Call

↓

Combine Answer

---

## Golden Rule

Never ask:

"How do I solve the whole problem?"

Always ask:

"If someone solved the smaller problem for me,
what would I do with that answer?"

---

## Call Stack

Recursive calls pause the current function.

Execution resumes after the recursive call returns.

---

## Common Mistakes

- Missing base case
- Wrong base case
- Infinite recursion
- Changing shared state incorrectly
- Forgetting to return recursive result

  ---

  ## Designing Recursive Relations

Every recursion problem has three questions.

1.

What is the smaller problem?

2.

What should the recursive call return?

3.

How do I use that returned answer?

Examples

Factorial

↓

Multiply

Maximum

↓

Take maximum

Sorted Array

↓

Logical AND

Trees

↓

Combine left and right subtree answers
