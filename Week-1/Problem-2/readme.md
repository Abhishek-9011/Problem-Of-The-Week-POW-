# 🚀 Problem: Count Subarrays with Sum Equals K

## 📄 Problem Statement (Brief)

Given an array of integers `arr` and an integer `k`, return the total number of **continuous subarrays** whose sum equals to `k`.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Brute Force (Triple Loop)

#### 🔍 Logic:

- Fix all possible subarrays using three nested loops:
  - First loop sets the `start` index.
  - Second loop sets the `end` index.
  - Third loop calculates the sum of the subarray `arr[start...end]`.
- If the sum is equal to `k`, increment the counter.

#### ⏱ Time Complexity:

- `O(N³)` — all possible subarrays checked and summed manually

#### 📦 Space Complexity:

- `O(1)` — only loop variables and a counter used

---

### 🔹 Approach 2: Prefix Sum Optimization (Double Loop)

#### 🔍 Logic:

- Fix all subarrays with two loops:
  - Outer loop sets the `start` index.
  - Inner loop expands the `end` index while maintaining a running sum.
- If the running sum equals `k`, increment the counter.

#### ⏱ Time Complexity:

- `O(N²)` — sum calculated incrementally, avoiding repeated summing

#### 📦 Space Complexity:

- `O(1)` — no additional space used

---

### 🔹 Approach 3: Optimal Using HashMap and Prefix Sum

#### 🔍 Logic:

- Maintain a cumulative sum while iterating through the array.
- Use a HashMap to store the frequency of all previously seen prefix sums.
- For each element:
  - Compute the running sum.
  - Check if `sum - k` exists in the map — this indicates a valid subarray.
  - Add the frequency of `sum - k` to the count.
  - Update the map with the current prefix sum.

#### ⏱ Time Complexity:

- `O(N)` — single pass with constant-time map operations

#### 📦 Space Complexity:

- `O(N)` — space used by the HashMap to store prefix sums

---
  