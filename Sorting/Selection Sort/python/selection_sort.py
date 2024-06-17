def sort(array):
  for i in range(len(array) - 1):
    for j in range(i+1, len(array)):
      min = i
      if array[min]>array[j]:
        min = j
    
    array[i], array[min] = array[min], array[i]


array = [5, 3, 8, 6, 2]
sort(array)
print("Sorted Array: ", array)
