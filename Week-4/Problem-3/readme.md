# 🚀 Problem: Count Friend Groups  

## 📄 Problem Statement (Brief)  

You are given `N` students and their **mutual friendships** in the form of an **adjacency list**.  
A **friend group** is a set of students where each student is connected to every other student in the group **directly or indirectly**.  

Your task is to **count the total number of friend groups**.  

---

## ✅ Solution Approach  

---

### 🔹 Approach: Depth-First Search (DFS)  

#### 🔍 Logic:  

- Treat students as **nodes** and friendships as **undirected edges**.  
- Maintain a `visited` set to track students that have already been processed.  
- Iterate through each student:
  - If the student is **not visited**, start a DFS from that student.
  - During DFS:
    - Mark the current student as visited.
    - Recursively visit all unvisited friends of the current student.
  - Once DFS completes for this student, it means we have found a **complete friend group** — increment the group counter.
- The total number of DFS calls corresponds to the number of **friend groups**.  

#### ⏱ Time Complexity:  

- `O(N + E)` —  
  - `N` = number of students (nodes)  
  - `E` = number of friendships (edges)  

#### 📦 Space Complexity:  

- `O(N)` — for the `visited` set and recursion stack in the worst case.  
