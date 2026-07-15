# Sliding Window

---

# 1. Motivation

Many problems ask about a contiguous subarray.

A brute-force solution recalculates every subarray.

This leads to O(n × k).

Instead of rebuilding every window,

update the previous window.

---

# 2. Core Idea

Maintain a window.

When it moves,

Remove the left element.

Add the new right element.

No repeated work.

---

# 3. Fixed Size Window

Window size remains constant.

Example

Maximum sum of subarray of size k.

Template

```java
int sum = 0;

for(int i=0;i<k;i++)
    sum += nums[i];

int ans = sum;

for(int i=k;i<nums.length;i++){

    sum += nums[i];

    sum -= nums[i-k];

    ans = Math.max(ans,sum);
}
```

---

# 4. Complexity

Time

O(n)

Space

O(1)

---

# 5. Pattern Recognition

Think Sliding Window when

✅ Contiguous Subarray

✅ Window grows or slides

✅ Longest

✅ Shortest

✅ Maximum

✅ Minimum

---

# 6. Common Mistakes

❌ Recomputing window

❌ Forgetting to remove left element

❌ Wrong window boundaries

---

# 7. Revision Summary

Sliding Window updates previous work.

Never recompute.

---

# Pattern Philosophy

Every optimization removes repeated work.

Traversal

Removes repeated visits.

---

Prefix Sum

Removes repeated cumulative calculations.

---

HashMap

Removes repeated searching.

---

Two Pointers

Removes repeated pair comparisons.

---

Sliding Window

Removes repeated window calculations.

---

Interview Question

Before writing code ask:

"What work am I doing repeatedly?"

The answer often reveals the correct pattern.

---

# Problem Decomposition

Many interview problems become easier after splitting them into independent parts.

Instead of solving everything together, identify:

- Fixed contribution
- Variable contribution

Optimize only the variable contribution.

Examples

LC 1052

Always satisfied

+

Extra satisfied customers

Final Answer

Base + Maximum Extra

---

# Variable Sliding Window

---

# 1. Motivation

Some problems do not have a fixed window size.

Instead,

the window must satisfy a condition.

Examples

- No duplicates
- At most K distinct
- Sum >= target

The window expands while valid.

It shrinks until valid again.

---

# 2. Core Idea

Expand

↓

Window becomes invalid

↓

Shrink

↓

Window becomes valid

↓

Expand again

---

# 3. General Template

```java
int left = 0;

for(int right = 0; right < n; right++){

    // Include right element

    while(window is invalid){

        // Remove left element

        left++;
    }

    // Window is valid here

    // Update answer
}
```

---

# 4. Complexity

Each element

enters once.

Leaves once.

Time

O(n)

Space

Depends on data structure.

---

# 5. Pattern Recognition

Use Variable Sliding Window when

- Longest
- Shortest
- At most
- At least
- Exactly K
- No duplicates

---

# 6. Common Mistakes

❌ Shrinking too early

❌ Forgetting to update answer

❌ Wrong validity condition

---

# 7. Revision Summary

Expand while valid.

Shrink until valid.

Repeat.

---

# Variable Sliding Window Rules

1. Expand first.

2. Update state.

3. Check validity.

4. If invalid,

    shrink only until valid again.

5. Update answer only when the window is valid.


---

# Variable Sliding Window

## Longest Problems

Expand while valid.

Shrink only when invalid.

---

## Shortest Problems

Expand until valid.

While valid:

    Update answer.

    Shrink again.

Repeat until invalid.

----
