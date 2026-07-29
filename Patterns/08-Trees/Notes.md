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

## Tree Pattern 4 - Height + Global Answer

Recognition

The parent only needs one value.

But every node contributes to the final answer.

Examples

- Diameter of Binary Tree
- Maximum Path Sum
- Longest Univalue Path

Framework

left = dfs(node.left)

right = dfs(node.right)

Update global answer

Return information parent needs

---

# Tree Traversals

Every traversal is DFS.

The only difference is when the current node is processed.

## Preorder

Current → Left → Right

Use when the current node must be processed before children.

---

## Inorder

Left → Current → Right

Use mainly for Binary Search Trees.

---

## Postorder

Left → Right → Current

Use when the parent depends on children's answers.

Examples

- Height
- Diameter
- Balanced Tree
- Delete Tree

---

Question to ask

"When should I process the current node?"

The answer determines the traversal.

---

## BFS Level Order Invariant

At the beginning of each iteration of the outer while loop,

the queue contains exactly one complete level.

Save

int size = q.size();

before processing the level.

Process exactly `size` nodes.

Children added during processing belong to the next level and should not be processed immediately.

---

# Trees Roadmap

## DFS Basics
- [x] LC104
- [x] LC100
- [x] LC226
- [x] LC110
- [x] LC543
- [x] LC112
- [x] LC257
- [x] LC124

## Traversals
- [x] LC144
- [x] LC94
- [x] LC145

## BFS
- [x] LC102
- [x] LC107
- [x] LC199
- [x] LC637
- [x] LC103

## Advanced DFS
- [ ] LC101
- [ ] LC113
- [ ] LC129
- [ ] LC236

## Binary Search Trees
- [ ] LC700
- [ ] LC701
- [ ] LC530
- [ ] LC98
- [ ] LC230
- [ ] LC235
- [ ] LC450
