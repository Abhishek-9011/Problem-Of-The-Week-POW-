# Step Word Generator in Java

## 📘 Problem Statement

In a word game, a **step word** is created by:
1. Adding **exactly one letter** to a given input word.
2. Anagramming (rearranging) the result to form a valid dictionary word.

### 🔍 Example:
Input word: `apple`  
Dictionary: `["appeal", "apply", "pepla", "papple", "apples"]`  
Valid step words: `["appeal", "papple", "apples"]`

---

## ✅ Goal

Implement a function that returns all valid step words from a given dictionary using the above logic.

---

## ✅ Approaches Implemented

### 🔹 Approach 1: Sorted String Comparison

**Idea:**  
- Sort the input word.
- For every dictionary word that has length `input.length() + 1`, sort it as well.
- Compare the two sorted strings allowing exactly **one mismatch** (i.e., one extra character).

**Functions Used:**
- `sortString(String str)`
- `isStepWord(String shorter, String longer)`

**Time Complexity:**
- Sorting input: `O(n log n)`
- For each dictionary word: sorting = `O(n log n)`, comparison = `O(n)`
- **Total:** `O(d * n log n)` where `d` = number of dictionary words, `n` = word length

**Space Complexity:**  
- `O(1)` auxiliary (besides result list and temporary strings)

---

### 🔹 Approach 2: Frequency Array Comparison

**Idea:**  
- Build a frequency array (size 26 for lowercase letters) for the input word.
- For each dictionary word of length `input.length() + 1`, also build a frequency array.
- Compare:
  - The candidate should contain all characters of the input.
  - There should be exactly **1 extra character**.

**Functions Used:**
- `buildFreq(String word)`
- `isStepWordFreq(int[] base, int[] candidate)`

**Time Complexity:**
- Building frequency for input: `O(n)`
- For each dictionary word: build freq = `O(n)`, compare freq = `O(26)`
- **Total:** `O(d * n)` where `d` = number of dictionary words, `n` = word length

**Space Complexity:**  
- `O(1)` extra (using fixed 26-length arrays)

