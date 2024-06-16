def bubble_sort(array):
  for i in range(len(array)):
    for j in range(0, len(array) - i - 1):
      if array[j] > array[j+1]:
        array[j], array[j+1] = array[j+1], array[j]

array = [5, 3, 8, 6, 2]
bubble_sort(array)
print("Sorted Array: ", array)
