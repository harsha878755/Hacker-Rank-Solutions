# **HackerRank - Count Elements Greater Than Previous Average**

## **Problem**

**Given a list of response times, count the number of elements that are strictly greater than the average of all previous elements.**

**The first element is skipped because there are no previous elements to calculate an average.**

## **Approach**

**1. Store the first response time in `sum`.**

**2. Start traversing the list from index `1`.**

**3. Calculate the average of all previous response times using `sum / i`.**

**4. Compare the current response time with the previous average.**

**5. If the current response time is strictly greater than the average, increment `count`.**

**6. Add the current response time to `sum` so it can be included in the average for the next element.**

**7. Return `count`.**

## **Example 1**

### **Input**

responseTimes = [100, 200, 150, 300]

### **Output**

2

### **Explanation**

**Day 0: `100` is skipped because there are no previous elements.**

**Day 1: `200 > average(100) = 100`, so count = 1.**

**Day 2: `150 > average(100, 200) = 150` is false because they are equal.**

**Day 3: `300 > average(100, 200, 150) = 150`, so count = 2.**

**Therefore, the answer is `2`.**

## **Example 2**

### **Input**

responseTimes = [100, 90, 80, 70]

### **Output**

0

### **Explanation**

**None of the elements are strictly greater than the average of all previous elements.**

**Therefore, the answer is `0`.**

Complexity

## **Time Complexity: O(n)**

**We traverse the list only once, so the time complexity is `O(n)`.**

## **Space Complexity: O(1)**

**We use only a few variables, so the extra space complexity is `O(1)`.**

## **Topics**

**Array**

**List**

**Average**

**Prefix Sum**

**HackerRank**

## **Problem Name: Count Elements Greater Than Previous Average**

## **Platform: HackerRank**

## **HackerRank Problem Link**

**https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-elements-greater-than-previous-average/problem**
