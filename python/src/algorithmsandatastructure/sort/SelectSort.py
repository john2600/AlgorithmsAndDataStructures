def bubbleSort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(0, n - i):
            largest = 0
            if arr[j] > arr[largest]:
                largest = j
        arr[largest], arr[i] = arr[i], arr[largest]


# Driver code to test above
arr = [64, 34, 25, 12, 22, 11, 90]

bubbleSort(arr)

print("Sorted array is:")
for i in range(len(arr)):
    print("%d" % arr[i]),