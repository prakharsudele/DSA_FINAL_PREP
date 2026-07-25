# Binary Tree DFS Framework

Recognition

Every subtree is itself another tree.

---

State

Current TreeNode.

---

Base Case

Current node is null.

---

Smaller Problem

Ask the left subtree.

Ask the right subtree.

---

Combine

Use left and right answers to compute the current answer.

---

Template

solve(node){

    if(node==null)
        return ...

    left = solve(node.left);

    right = solve(node.right);

    return combine(left,right,node);

}

---

## LC 100 - Same Tree

### Recognition

Compare two recursive structures node by node.

---

### State

Current node in Tree P

Current node in Tree Q

---

### Base Cases

Both nodes are null → true

One node is null → false

Current values differ → false

---

### Smaller Problems

Are the left subtrees identical?

Are the right subtrees identical?

---

### Combine

Left AND Right

---

### Complexity

Time: O(N)

Space: O(H)

(H = height of tree)

---

## Designing Return Values

The recursive function does NOT always return the final answer.

It returns the information the parent needs.

Examples

Maximum Depth

Return → Height

Same Tree

Return → Boolean

Balanced Tree

Return → Height

Special Value

Sometimes a return value is used as a signal.

Example

-1

means

"This subtree is already invalid."

The parent should immediately propagate this signal upward instead of continuing calculations.

---
