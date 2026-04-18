# Strings - Pattern wise Question List

---

## 1. Sliding Window

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Longest Substring Without Repeating Characters | Medium |
| 2 | Longest Substring with At Most K Distinct Characters | Medium |
| 3 | Minimum Window Substring | Hard |
| 4 | Maximum Number of Vowels in a Substring of Given Length | Medium |
| 5 | Longest Repeating Character Replacement | Medium |

---

## 2. Two Pointers

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Valid Palindrome | Easy |
| 2 | Reverse String | Easy |
| 3 | Reverse Words in a String | Medium |
| 4 | Remove Duplicates from Sorted String | Easy |
| 5 | Is Subsequence | Easy |

---

## 3. Hashing Based

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | First Unique Character in a String | Easy |
| 2 | Find All Anagrams in a String | Medium |
| 3 | Ransom Note | Easy |
| 4 | Word Pattern | Easy |
| 5 | Isomorphic Strings | Easy |

---

## 4. Palindrome

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Valid Palindrome | Easy |
| 2 | Longest Palindromic Substring | Medium |
| 3 | Palindromic Substrings - Count All | Medium |
| 4 | Longest Palindromic Subsequence | Medium |
| 5 | Valid Palindrome II - Remove One Char | Easy |

---

## 5. Anagram

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Valid Anagram | Easy |
| 2 | Group Anagrams | Medium |
| 3 | Find All Anagrams in a String | Medium |
| 4 | Minimum Number of Steps to Make Two Strings Anagram | Medium |

---

## 6. Pattern Matching

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Implement strStr() / Needle in Haystack | Easy |
| 2 | Repeated Substring Pattern | Easy |
| 3 | Shortest Palindrome (KMP) | Hard |
| 4 | String Rotation | Easy |
| 5 | Wildcard Matching | Hard |
| 6 | Regular Expression Matching | Hard |

---

## 7. String Manipulation

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Reverse Words in a String | Medium |
| 2 | Roman to Integer | Easy |
| 3 | Integer to Roman | Medium |
| 4 | Zigzag Conversion | Medium |
| 5 | Count and Say | Medium |
| 6 | Multiply Strings | Medium |
| 7 | Add Binary | Easy |
| 8 | Compare Version Numbers | Medium |

---

## 8. String Building / Parsing

| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Decode String (e.g. 3[a2[bc]]) | Medium |
| 2 | Evaluate Reverse Polish Notation | Medium |
| 3 | Basic Calculator | Hard |
| 4 | Simplify Path | Medium |
| 5 | Encode and Decode Strings | Medium |

---

## Quick Summary

| Pattern | Count | Focus |
|---------|-------|-------|
| Sliding Window | 5 | variable/fixed window on string |
| Two Pointers | 5 | opposite ends, subsequence check |
| Hashing Based | 5 | frequency map, char count |
| Palindrome | 5 | expand around center, DP |
| Anagram | 4 | sort or frequency map |
| Pattern Matching | 6 | KMP, recursion, DP |
| String Manipulation | 8 | simulate, parse, build |
| String Building / Parsing | 5 | stack based parsing |

---

## Suggested Order

```
1. Hashing Based      → already know from arrays, easiest transition
2. Sliding Window     → already know from arrays
3. Two Pointers       → already know from arrays
4. Anagram            → extension of hashing
5. Palindrome         → new concept, expand around center
6. String Manipulation → simulate problems, good for practice
7. String Building    → stack based, medium complexity
8. Pattern Matching   → KMP and regex are hardest, do last
```
