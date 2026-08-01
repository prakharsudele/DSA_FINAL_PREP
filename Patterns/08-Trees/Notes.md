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

# Binary Search Tree (BST)

## Definition

A Binary Search Tree is a Binary Tree where

Left Subtree < Current Node < Right Subtree

Every subtree also follows the BST property.

---

## Advantages

Search : O(log N) Average

Insert : O(log N) Average

Delete : O(log N) Average

Worst Case (Skew Tree)

O(N)

---

## Recognition

Whenever a problem mentions

- Sorted order
- Search efficiently
- Kth smallest/largest
- Successor / Predecessor

Think about BST properties.

---

## Inorder Traversal of BST

Inorder traversal of a BST always produces nodes in sorted order.

Left

↓

Root

↓

Right

Applications

- Validate BST
- Kth Smallest
- Minimum Difference
- BST Iterator

  ---

  ## Pattern 1 - Eliminate Half

Question

Current value greater than target?

↓

Go Left

Current value smaller than target?

↓

Go Right

Never search both sides.

Time

Average O(logN)

Worst O(N)

---

## Pattern 2 - Modify and Return Subtree

Recursive Question

Modify my subtree and return its new root.

Base Case

Reached null

↓

Create new node.

Recursive Step

If value < root.val

↓

root.left = dfs(root.left)

Else

↓

root.right = dfs(root.right)

Return

root

Used In

- Insert into BST
- Delete Node

---

## Pattern 3 - Traversal State

Observation

BST inorder traversal is sorted.

Maintain

- Previous Node
- Count
- Answer

Examples

- Kth Smallest
- Recover BST
- Minimum Difference

  ---

  ## Pattern 4 - Pass Constraints Downward

Every node inherits constraints from its ancestors.

State

Current Node

Minimum Allowed

Maximum Allowed

Rule

min < node.val < max

Left

(min, node.val)

Right

(node.val, max)

Used In

Validate BST

---

## Delete Node Cases

Case 1

Leaf Node

↓

Delete directly.

---

Case 2

One Child

↓

Return child.

---

Case 3

Two Children

↓

Find inorder successor
(Smallest node in right subtree)

Copy successor value.

Delete successor recursively.

---

## Binary Tree vs BST

Binary Tree

No ordering property.

Most problems require visiting many nodes.

Usually O(N).

---

Binary Search Tree

Ordered.

Often only one path is explored.

Average O(logN).

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
