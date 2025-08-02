|# 🚀 Problem: Partition Equal Subset Sum

## 📄 Problem Statement (Brief)

Given a **multiset of positive integers**, determine whether it can be **partitioned into two subsets** such that the **sum of elements in both subsets is equal**.

This is a variation of the **Subset Sum** problem and a classic **Dynamic Programming** challenge.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Recursive (Brute Force)

#### 🔍 Logic:

- Try all combinations of placing elements in either of the two subsets.
- At the end, check whether the sum of both subsets is equal.
- Pure recursive approach without memoization.

#### ⏱ Time Complexity:

- `O(2^n)` — all possible subsets are tried.

#### 📦 Space Complexity:

- `O(n)` — function call stack.

---

### 🔹 Approach 2: Bottom-Up Dynamic Programming (0/1 Knapsack)

#### 🔍 Logic:

- Calculate total sum of array. If the sum is odd, return false.
- Otherwise, try to find a subset with sum equal to `totalSum / 2`.
- Use a 1D DP array to track reachable subset sums.

#### ⏱ Time Complexity:

- `O(n * sum)` — where `n` is number of elements and `sum` is the target.

#### 📦 Space Complexity:

- `O(sum)` — using a 1D boolean DP array.
