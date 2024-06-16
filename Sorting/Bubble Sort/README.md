# Bubble Sort Algorithm

The Bubble Sort algorithm is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

## Algorithm Steps

1. Start with the first element in the list.
2. Compare the current element with the next element.
3. If the current element is greater than the next element, swap them.
4. Move to the next pair of elements and repeat steps 2 and 3.
5. Continue this process until the end of the list is reached.
6. Repeat steps 1-5 for the remaining unsorted portion of the list.
7. The list is now sorted.

## Pseudocode

```
procedure bubbleSort(list)
  n = length(list)
  for i from 0 to n-1
    for j from 0 to n-i-1
      if list[j] > list[j+1]
        swap(list[j], list[j+1])
  return list
```

## Complexity Analysis

- Time Complexity: Bubble Sort has a worst-case and average-case time complexity of O(n^2), where n is the number of elements in the list.
- Space Complexity: Bubble Sort has a space complexity of O(1) as it only requires a constant amount of additional space.

Bubble Sort is a simple and intuitive sorting algorithm, but it is not efficient for large lists. Other sorting algorithms like Quick Sort or Merge Sort are generally preferred for better performance.
