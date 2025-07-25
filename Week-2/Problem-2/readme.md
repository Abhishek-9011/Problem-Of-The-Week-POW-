# 💰 Find the Smallest Unrepresentable Sum

You're given an array of positive integers `coins[]` representing coin denominations.  
Your task is to find the **smallest positive integer value that cannot be formed using any subset** of the coins.

---

## ✅ Solution Approaches

---

### 🔹 Approach 1: Subset Generation (Backtracking)

#### 🔍 Explanation:
- Generate all possible subsets of the array.
- For each subset, calculate the sum and store it in a set.
- Then, starting from 1, find the first number that doesn't exist in the set.
- This brute-force method works only for small input sizes due to its exponential nature.

#### ⏱ Time Complexity:
- `O(2^N)` — for generating all subsets

#### 📦 Space Complexity:
- `O(2^N)` — storing all possible sums in a set

---

### 🔹 Approach 2: Dynamic Programming (Subset Sum)

#### 🔍 Explanation:
- Use a boolean DP array to track which sums can be formed.
- For each coin, update the DP array in reverse to avoid duplicate usage.
- Finally, scan the array from 1 to find the first `false` value (i.e., unreachable sum).

#### ⏱ Time Complexity:
- `O(N * S)` — where `S` is the sum of all coin values

#### 📦 Space Complexity:
- `O(S)` — for the DP array

---

### 🔹 Approach 3: Greedy Algorithm

#### 🔍 Explanation:
- Sort the coins.
- Track the smallest value that cannot be formed so far (`res`).
- For each coin:
  - If the coin is greater than `res`, we can't form `res`, so we return it.
  - Otherwise, we add the coin to `res` (extending the representable range).
- This is the most efficient and optimal method.

#### ⏱ Time Complexity:
- `O(N log N)` — due to sorting

#### 📦 Space Complexity:
- `O(1)` — uses constant extra space
