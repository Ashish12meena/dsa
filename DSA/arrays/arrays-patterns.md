# Arrays - Pattern Guide

A reference for every pattern used in `01-arrays/`. For each pattern: what it is, when to spot it, core idea, and time/space complexity.

---

## 1. Prefix Sum

### What it is
Precompute a running sum so any subarray sum `[i..j]` can be answered in O(1) without re-scanning.

### When to spot it
- "Find subarray with sum equal to K"
- "Count subarrays with sum equal to K"
- "Longest subarray with given sum"
- Any query asking about a range sum multiple times

### Core idea
```
prefixSum[i] = arr[0] + arr[1] + ... + arr[i]
sum(i, j)    = prefixSum[j] - prefixSum[i-1]
```
For "count subarrays with sum K" combine with a HashMap:
```
needed = currentSum - K
if map contains needed → those many subarrays end here
```

### Complexity
- Time  : O(n)
- Space : O(n) for prefix array, or O(n) for HashMap

### Your files
- `LongestSubArrrayWithSumK.java` — brute force O(n²)
- `LongestSubArrayWithSumKTryOptimal.java` — sliding window approach
- `_17_countSubarrayEqualsK.java` — sliding window attempt
- `_17_countSubarrayEqualsKOptimal.java` — HashMap + prefix sum O(n)

---

## 2. Kadane's Algorithm

### What it is
Find the maximum sum contiguous subarray in O(n) by deciding at each element: extend the current subarray or start fresh.

### When to spot it
- "Maximum sum subarray"
- "Maximum product subarray"
- "Subarray with largest sum"

### Core idea
```
At each index i, ask:
  Is it better to extend the previous subarray (sum + arr[i])
  or start a new one from here (arr[i])?

sum = max(arr[i], sum + arr[i])
max = max(max, sum)
```
Key insight: if current sum goes negative, drop it — starting fresh is always better.

### Complexity
- Time  : O(n)
- Space : O(1)

### Your files
- `MaxImumSubArray.java` — brute force O(n²), tracks start/end indices
- `MaxImumSubArrayOptimal.java` — Kadane's O(n), tracks start/end indices

---

## 3. Sorting-Based

### What it is
Sort the array first so the problem becomes simpler — duplicates become adjacent, two pointers work, merge/intersect becomes linear.

### When to spot it
- "Union/intersection of two arrays"
- "Sort array of 0s, 1s, 2s"
- "3Sum, 4Sum" (after sorting, use two pointers)
- Problem becomes trivial if elements are in order

### Core idea
After sorting:
- Duplicates sit next to each other → easy to skip
- Two pointer from both ends works for target sum
- Merge two sorted arrays like merge sort step

Dutch Flag Algorithm (sort 0s, 1s, 2s in one pass):
```
low=0, mid=0, high=n-1
arr[mid]==0 → swap(low,mid), low++, mid++
arr[mid]==1 → mid++
arr[mid]==2 → swap(mid,high), high--
```

### Complexity
- Time  : O(n log n) for sort + O(n) for processing = O(n log n)
- Space : O(1) if in-place sort

### Your files
- `SortArrayOfZeroOnesAndTwos.java` — count approach O(n)
- `SortArrayOfZerosOnesAndTwoOptimalDuctchFlagAlgorithm.java` — Dutch Flag O(n) one pass
- `IntersectionOfSortedArray.java` — two pointer merge O(n+m)
- `UnionOfSortedArray.java` — two pointer merge O(n+m)

---

## 4. Hashing-Based

### What it is
Use a HashMap or HashSet to get O(1) lookup instead of O(n) scanning — trades space for time.

### When to spot it
- "Find if element exists / count frequency"
- "Two numbers that sum to target"
- "Find duplicate / unique elements"
- "Longest consecutive sequence"
- "Majority element"

### Core idea
Store what you've seen so far in a map/set. For each new element, check if what you need is already in the map.

Two Sum example:
```
For each arr[i]:
  needed = target - arr[i]
  if map contains needed → found pair
  else → map.put(arr[i])
```

Majority Element (Moore Voting — O(1) space):
```
candidate = arr[0], count = 0
For each element:
  if count == 0 → candidate = element
  if element == candidate → count++
  else → count--
Result: candidate (verify if needed)
```

### Complexity
- Time  : O(n)
- Space : O(n) for the map/set

### Your files
- `FindUniqueArray.java` — manual O(n²), no set used
- `TwoSumArray.java` — brute force O(n²)
- `TwoSumArrayHashMap.java` — HashMap O(n)
- `MajorityElementFromArray.java` — HashMap frequency count O(n)
- `MajorityElementOptimal.java` — Moore Voting O(n) time O(1) space
- `_19_MajorityElementNbyThree.java` — extended Moore Voting
- `_13_LongestConsecutiveSequence.java` — brute force O(n²)
- `_13_LongestConsectiveSequenceOptima.java` — HashSet O(n)

---

## 5. In-Place Manipulation

### What it is
Rearrange or modify the array without using extra space. Usually involves pointer tricks, swaps, or reverse operations.

### When to spot it
- "Remove duplicates in-place"
- "Move zeros to end"
- "Rotate array by K places"
- "Next permutation"
- "Rearrange positives and negatives"

### Core idea
Use one or two pointers to overwrite positions directly:

Move zeros example:
```
j = 0  (points to where next non-zero goes)
For each i:
  if arr[i] != 0 → arr[j] = arr[i], j++
Fill arr[j..n] with 0
```

Rotate by K (reverse trick) — most elegant:
```
reverse(0, k-1)
reverse(k, n-1)
reverse(0, n-1)
```

### Complexity
- Time  : O(n)
- Space : O(1)

### Your files
- `RemoveDuplicateFromSortedArray.java` — two pointer O(n)
- `MoveAllZerosToEnd.java` — two pointer O(n)
- `LeftRotateArray.java` — single step O(n)
- `LeftRotateArrayByNPlaces.java` — repeat single step O(n*k)
- `LeftRotateArray2ndApproachh.java` — formula-based O(n)
- `LeftRotateArrayByReverse.java` — reverse trick O(n) optimal
- `RightRotateArraay2ndApprroach.java` — formula-based O(n)
- `NextPermutation.java` — find pivot + swap + reverse O(n)
- `RearrangeElementBySign.java` — (to be implemented)

---

## 6. Matrix

### What it is
Problems on 2D arrays. Patterns include layer-by-layer traversal, marking rows/columns, transpose + reverse for rotation.

### When to spot it
- "Rotate matrix 90 degrees"
- "Set row/column to zero if cell is zero"
- "Spiral order traversal"
- "Pascal's triangle"

### Core idea
Rotate 90° clockwise (optimal in-place):
```
Step 1: Transpose  → swap arr[i][j] with arr[j][i]
Step 2: Reverse each row
```

Set Matrix Zeros (optimal):
```
Use first row and first column as markers
Scan matrix → mark arr[0][j] and arr[i][0] for zeros found
Apply zeros based on markers
```

Spiral traversal:
```
Maintain 4 boundaries: top, bottom, left, right
Traverse → right, down, left, up
Shrink boundaries after each direction
```

### Complexity
- Time  : O(n²) for most matrix problems (have to visit every cell)
- Space : O(1) for in-place approaches

### Your files
- `SetMatrixZeros.java` — mark with -1 O(n²) time O(1) space
- `SetMatrixZerosOptimal.java` — separate marker arrays O(n²) time O(n) space
- `_14_SetMatrixZerosOptimalWithSpaceComplexity.java` — first row/col as marker O(1) space
- `_15_RotateMatrix90.java` — extra array O(n²) space
- `_15_RotateMatrix90Optimal.java` — transpose + reverse O(1) space
- `_16_SpiralTraverslOfMatrix.java` — boundary shrink approach
- `_18_DrawPascalTriangle.java` — build row from previous row
- `_18_FindPascalValueByRowColumn.java` — combinatorics formula nCr
- `_18_PrintEntireRowOfPascalOptimal.java` — single row O(n)

---

## 7. Subarray Problems

### What it is
Problems where you scan from each index to find a result — leaders, max/min in ranges, buy-sell stock type problems.

### When to spot it
- "Find all leaders in array" (greater than all elements to its right)
- "Stock buy and sell"
- Any problem that asks about relationship of an element with elements to its right/left

### Core idea
Leaders — scan from right, track running max:
```
max = arr[n-1]  (last element is always a leader)
scan right to left:
  if arr[i] > max → it's a leader, update max
```

Stock buy and sell:
```
Track minimum price seen so far
At each price: profit = price - minSoFar
Track maximum profit
```

### Complexity
- Time  : O(n) for right-to-left scan approach
- Space : O(1) or O(k) for result list

### Your files
- `_12_leaderOfArray.java` — brute force O(n²)
- `_12_LeaderOfArrayOptimal.java` — right scan O(n)

---

## 8. Common (No Specific Pattern)

### What it is
Basic array problems that use simple traversal logic — no named pattern, just iterate and track something.

### When to spot it
- "Find max/second max element"
- "Find missing number"
- "Find element appearing once"
- "Maximum consecutive ones"

### Core idea
Most are single-pass with a few tracking variables.

Missing number — math trick:
```
expected sum = n*(n+1)/2
missing = expectedSum - actualSum
```

Find element appearing once — XOR trick:
```
XOR all elements → duplicates cancel out (a^a = 0)
Result = the single element
```
(This technically belongs in `10-bit-manipulation/` — move it there when you create that folder.)

### Your files
- `LargestElementInArrray.java` — single pass O(n)
- `SecondLargestElementInArray.java` — single pass O(n)
- `FindMissingNumberInArray.java` — sum formula O(n)
- `FindTheNumberOnceAndOtherTwice.java` — XOR trick O(n)
- `MaximumConsecutiveOnes.java` — single pass counter O(n)
- `BuyAndSellStock.java` — single pass min tracking O(n)
- `TwoSumForSortedArray.java` — two pointers (move to `09-two-pointers/` later)

---

## Quick Pattern Recognition Cheatsheet

| If the problem says...                        | Pattern to try          |
|-----------------------------------------------|-------------------------|
| Subarray sum equals K / count subarrays       | Prefix Sum + HashMap    |
| Maximum sum subarray                          | Kadane                  |
| Union / intersection / sort 0s 1s 2s          | Sorting-Based           |
| Two sum / duplicates / frequency / consecutive| Hashing                 |
| Remove duplicates / rotate / move zeros       | In-Place Manipulation   |
| Rotate matrix / spiral / set zeros            | Matrix                  |
| Leaders / stock prices                        | Subarray Problems       |
| Find max, missing number, single element      | Common / Single Pass    |
