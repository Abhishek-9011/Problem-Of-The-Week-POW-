# 🔍 Problem: Word Search in 2D Matrix

## 📄 Problem Statement (Brief)

In many document processing, word puzzles, and image processing systems, scanning a grid for a target pattern is a common task.

You are given a **2D matrix of characters** and a **target word**.  
Your task is to check whether the word exists in the matrix in either of the following directions:

- 🔸 Left-to-right (row-wise)
- 🔸 Top-to-bottom (column-wise)

> The word must appear as a **contiguous substring** in either direction.

---

## 📥 Input Format

- A 2D character matrix of size `M x N`
- A string representing the **target word**

---

## 📤 Output Format

- Return `true` if the word exists in the matrix (either row-wise or column-wise)
- Else return `false`

---


## ✅ Solution Approach

---

### 🔹 Traverse Rows and Columns as Strings

#### 🔍 Logic:

- Traverse each row of the matrix and convert it to a string.
  - Check if the word is a **substring** of the row.
- Traverse each column by building a column string.
  - Check if the word is a **substring** of the column.

---

### ⏱ Time Complexity:

- `O(M × N)` — where `M` is the number of rows and `N` is the number of columns.

---

### 📦 Space Complexity:

- `O(1)` — only a few temporary strings are created.

---


