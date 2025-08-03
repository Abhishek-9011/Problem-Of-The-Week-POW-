# 🚀 Problem: Count Unival Subtrees

## 📄 Problem Statement (Brief)

In a binary tree, a **unival subtree** (universal value subtree) is a subtree in which **all nodes have the same value**.

You are given the **root** of a binary tree. Your task is to **count the number of unival subtrees** present in the tree.

> 🔹 A single node is considered a unival subtree by itself.

---

## 📥 Input Format

- A binary tree where each node contains:
  - An integer value
  - Left and right children (or null)

---

## 📤 Output Format

- A single integer representing the number of unival subtrees in the tree.

---

## ✅ Solution Approach

---

### 🔹 Post-order Traversal + Recursion

#### 🔍 Logic:

- Use post-order traversal to evaluate left and right subtrees first.
- A node is the root of a unival subtree if:
  - Both its left and right subtrees are unival.
  - Its children (if present) have the same value as the node.
- Every leaf node is a unival subtree.

#### ⏱ Time Complexity:

- `O(n)` — Each node is visited once.

#### 📦 Space Complexity:

- `O(h)` — Where `h` is the height of the tree (recursion stack).

---

