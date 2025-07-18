# 🚀 Problem: Find Minimum in Rotated Sorted Array

## 📄 Problem Statement (Brief)

You're given a **sorted array** that has been **rotated** at an unknown pivot. Your task is to **find the minimum element** in the array. The array contains **distinct elements**.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Linear Search

#### 🔍 Logic:

- Iterate through all the elements in the array.
- Keep track of the minimum element encountered so far.

#### ⏱ Time Complexity:

- `O(N)` — checks each element once

#### 📦 Space Complexity:

- `O(1)` — no extra space used

---

### 🔹 Approach 2: Binary Search (Without Sorted Check)

#### 🔍 Logic:

- Use binary search to find the pivot point (smallest element).
- While `low < high`:
  - Find `mid = (low + high) / 2`.
  - If `arr[mid] > arr[high]`, the minimum must be in the right half.
  - Else, it must be in the left half (including `mid`).

#### ⏱ Time Complexity:

- `O(log N)` — binary search reduces space by half

#### 📦 Space Complexity:

- `O(1)` — constant space used

---

### 🔹 Approach 3: Binary Search (With Sorted Check)

#### 🔍 Logic:

- Before doing any mid-check, see if the array is already sorted: `arr[low] <= arr[high]`.
  - If true, return `arr[low]` as the minimum.
- Otherwise:
  - If `arr[mid] >= arr[low]`, then the left half is sorted — move `low = mid + 1`.
  - Else, right half is unsorted — move `high = mid`.

#### ⏱ Time Complexity:

- `O(log N)` — binary search

#### 📦 Space Complexity:

- `O(1)` — constant space used

---

