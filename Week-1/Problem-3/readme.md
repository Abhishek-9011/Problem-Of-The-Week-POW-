# 🏠 Problem: Paint House (Minimize Painting Cost)

## 📄 Problem Statement (Brief)

You are given a row of `n` houses, each of which can be painted with one of `k` colors. The cost of painting house `i` with color `j` is given by a matrix `costs[i][j]`.

Your task is to paint all houses such that:

- No two **adjacent houses** have the same color.
- The **total painting cost** is minimized.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Pure Recursion (Brute Force)

#### 🔍 Logic:

- For each house, try painting it with all colors different from the previous one.
- Recurse for the next house and accumulate the cost.
- Return the minimum cost among all valid paths.

#### ⏱ Time Complexity:

- `O(k^n)` — exponential due to repeated recomputation for each house-color pair

#### 📦 Space Complexity:

- `O(n)` — recursion stack depth

---

### 🔹 Approach 2: Recursion with Memoization (Top-Down DP)

#### 🔍 Logic:

- Same as brute force, but store results of subproblems using a 2D DP array `dp[house][prevColor]`.
- Avoids redundant computation by caching the minimum cost for each `(house, prevColor)`.

#### ⏱ Time Complexity:

- `O(n × k × k)` — for each house and previous color, we try all current colors

#### 📦 Space Complexity:

- `O(n × k)` — memoization table

---

### 🔹 Approach 3: Bottom-Up Dynamic Programming (Tabulation)

#### 🔍 Logic:

- Build a DP table `dp[i][j]` where each entry represents the minimum cost to paint up to house `i` with color `j`.
- For each house and color, take the min of all other colors from the previous house.

#### ⏱ Time Complexity:

- `O(n × k × k)` — for each house and color, we scan all previous colors

#### 📦 Space Complexity:

- `O(n × k)` — DP table
