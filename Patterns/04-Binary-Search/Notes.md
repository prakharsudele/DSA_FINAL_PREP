# Pattern Decision Tree

Question

│
├── Do I need every element?
│       ↓
│    Traversal
│
├── Am I repeatedly calculating cumulative information?
│       ↓
│    Prefix Sum
│
├── Do I need to remember previous information?
│       ↓
│    HashMap
│
├── Is the key range fixed?
│       ↓
│    Frequency Array
│
├── Do I need two indices?
│       │
│       ├── Sorted order controls movement?
│       │       ↓
│       │    Two Pointers
│       │
│       └── Window controls movement?
│               ↓
│         Sliding Window
│
└── Can I eliminate half the search space every step?
        ↓
     Binary Search
