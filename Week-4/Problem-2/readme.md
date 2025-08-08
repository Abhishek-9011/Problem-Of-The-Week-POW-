# 🚀 Problem: Binary Search

## 📄 Problem Statement (Brief)

Given a **sorted array** and a **target value**, determine whether the target exists in the array.  
If it exists → return `true`.  
If it does not exist → return `false`.

This algorithm is widely used in search operations for **databases**, **games**, and **system optimizations**.

---

## ✅ Solution Approach

---

### 🔹 Approach: Iterative Binary Search

#### 🔍 Logic:

- Maintain two pointers:
  - `low` → start index
  - `high` → end index
- While `low <= high`:
  - Calculate middle index:
    ```java
    mid = low + (high - low) / 2
    ```
    _(Prevents integer overflow compared to `(low + high) / 2`)_
  - If `arr[mid] == target` → return `true`.
  - If `arr[mid] < target` → search **right half** (`low = mid + 1`).
  - Else → search **left half** (`high = mid - 1`).
- Return `false` if not found.

#### ⏱ Time Complexity:

- **Best Case:** `O(1)` → found in first comparison.
- **Worst/Average Case:** `O(log n)` → halves the search space each step.

#### 📦 Space Complexity:

- `O(1)` → constant .

---
