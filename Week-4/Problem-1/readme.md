# 🚀 Problem: First Recurring Character

## 📄 Problem Statement (Brief)

Given a string, find the **first recurring character** — the character that **appears more than once**, and whose **second occurrence happens earliest** in the string.

This can help in applications like **autocomplete suggestions** or **string analysis tools**.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Brute Force (Nested Loop)

#### 🔍 Logic:

- Compare every character with all characters that come after it.
- Track the **second occurrence index** of each character.
- Return the character whose **second occurrence index is the smallest**.

#### 🧪 Example:

For input: `"acbbac"`
- `'b'` occurs again at index 3 (earliest second occurrence)
- `'a'` occurs again at index 4  
✅ Output: `'b'`

#### ⏱ Time Complexity:

- `O(n²)` — two nested loops for comparison.

#### 📦 Space Complexity:

- `O(1)` — no extra space used except variables.

---

### 🔹 Approach 2: HashSet (Efficient)

#### 🔍 Logic:

- Traverse the string from left to right.
- Add each character to a HashSet.
- If a character is already in the set, return it immediately — it's the first recurring character.

#### 🧪 Example:

For input: `"acbbac"`  
- `'b'` is the first character that appears more than once  
✅ Output: `'b'`

#### ⏱ Time Complexity:

- `O(n)` — single traversal of the string.

#### 📦 Space Complexity:

- `O(n)` — HashSet to track seen characters.

---
