# Graphs

## 1. What is a Graph?

A graph is a collection of:

- Vertices (nodes)
- Edges (connections)

Example:

    0 ----- 1
    |       |
    |       |
    2 ----- 3

Vertices:

    [0, 1, 2, 3]

Edges:

    (0,1)
    (0,2)
    (1,3)
    (2,3)


## 2. Types of Graphs

### Undirected Graph

Connection works both ways.

    0 ----- 1

If:

    0 → 1

then also:

    1 → 0


### Directed Graph

Edges have a direction.

    0 -----> 1

There is an edge:

    0 → 1

but not necessarily:

    1 → 0


### Weighted Graph

Edges have a cost/weight.

    0 --5-- 1
    |
    2
    |
    2

Edge:

    0 → 1 = 5


### Unweighted Graph

Edges don't have weights.

    0 ----- 1


## 3. Degree

In an undirected graph:

Degree = number of edges connected to a node.

Example:

    0 ----- 1
    |
    |
    2

Degree of 0 = 2

Degree of 1 = 1

Degree of 2 = 1


### Directed Graph

There are two types:

In-degree:
Number of edges coming INTO a node.

Out-degree:
Number of edges going OUT of a node.

Example:

    0 -----> 1 -----> 2
             ↑
             |
             3

For node 1:

In-degree = 2

Out-degree = 1


# 4. Graph Representation

There are three common ways to represent a graph:

1. Adjacency Matrix
2. Adjacency List
3. Edge List


# 5. Adjacency Matrix

Use a 2D array.

For:

    0 ----- 1
    |
    |
    2

Matrix:

        0  1  2
    0   0  1  1
    1   1  0  0
    2   1  0  0

If:

    matrix[u][v] = 1

then an edge exists between u and v.

For a weighted graph:

    matrix[u][v] = weight


### Complexity

Space:

    O(V²)

Checking whether an edge exists:

    O(1)

Adding an edge:

    O(1)

Finding all neighbors:

    O(V)


# 6. Adjacency List

Usually the preferred representation for DSA problems.

For:

    0 ----- 1
    |       |
    2 ----- 3

Adjacency list:

    0 → [1, 2]
    1 → [0, 3]
    2 → [0, 3]
    3 → [1, 2]


## Java

```java
List<List<Integer>> graph = new ArrayList<>();

for(int i = 0; i < n; i++){
    graph.add(new ArrayList<>());
}

---

