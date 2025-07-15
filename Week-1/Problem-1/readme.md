# 🚀 Problem: Find Minimum in Rotated Sorted Array

## 📄 Problem Statement (Brief)

You're given a **sorted array** that has been **rotated** at an unknown pivot. Your task is to **find the minimum element** in the array.

## ✅ Solution Approaches

### 🔹 Approach 1: Linear Search

#### 🔍 Logic:

- Iterate through all elements and keep track of the smallest one.

#### ⏱ Time Complexity:

- `O(N)` — goes through all elements

#### 📦 Space Complexity:

- `O(1)` — no extra space used

---

### 🔹 Approach 2: Binary Search (Without Sorted Check)

#### 🔍 Logic:

- Use binary search to reduce the search space.
- If `arr[low] <= arr[mid]`, the left half is sorted — so min must be in the right.
- Else, the right half is sorted — so min must be in the left.

#### ⏱ Time Complexity:

- `O(log N)` — binary search halves the array each step

#### 📦 Space Complexity:

- `O(1)` — constant space used

---

### 🔹 Approach 3: Binary Search (With Sorted Check)

#### 🔍 Logic:

- Before checking mid, verify if `arr[low] <= arr[high]`. If true, the whole subarray is sorted, so `arr[low]` is the minimum.
- Else, proceed as in Approach 2.

#### ⏱ Time Complexity:

- `O(log N)` — same binary search efficiency

#### 📦 Space Complexity:

- `O(1)` — constant space used

---
