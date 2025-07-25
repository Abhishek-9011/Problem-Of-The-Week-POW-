# 🚀 Problem: Longest Common Subsequence of 3 Strings

## 📄 Problem Statement (Brief)

Given **three strings** `a`, `b`, and `c`, your task is to find the **length of the longest subsequence** that appears in **all three strings**.

A **subsequence** is a sequence that appears in the **same order**, but **not necessarily contiguous**.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Recursive (Brute Force)

#### 🔍 Logic:

- Try all possibilities by including or excluding characters from all 3 strings.
- If characters match at current positions in all 3, include it and move forward.
- Otherwise, explore all 3 possible ways (skip one of the strings at a time).

#### ⏱ Time Complexity:

- `O(2^(n + m + p))` — Exponential, as all combinations are tried.

#### 📦 Space Complexity:

- `O(1)` — No extra space used (except function call stack).

---

### 🔹 Approach 2: Top-Down Dynamic Programming (Memoization)

#### 🔍 Logic:

- Same logic as recursion, but we **store previously computed states** in a 3D DP array.
- Avoids recomputation by storing results in `dp[i][j][k]`.

#### ⏱ Time Complexity:

- `O(n * m * p)` — each state computed once.

#### 📦 Space Complexity:

- `O(n * m * p)` — to store memoized results.

---

### 🔹 Approach 3: Bottom-Up Dynamic Programming (Tabulation)

#### 🔍 Logic:

- Use a 3D DP array `dp[i][j][k]` where each cell stores the LCS length of substrings up to `i`, `j`, `k`.
- If characters at `i-1`, `j-1`, `k-1` match, add `1 + dp[i-1][j-1][k-1]`.
- Otherwise, take the maximum of skipping one of the strings.

#### ⏱ Time Complexity:

- `O(n * m * p)` — iterates through every character combination.

#### 📦 Space Complexity:

- `O(n * m * p)` — 3D DP array used.

---

