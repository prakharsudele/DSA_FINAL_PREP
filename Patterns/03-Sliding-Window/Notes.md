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
