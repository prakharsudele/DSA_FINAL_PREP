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
