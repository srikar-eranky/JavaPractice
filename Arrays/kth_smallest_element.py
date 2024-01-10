"""
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
note that all array elements are distinct.
"""

def kth_smallest_element(arr, k):
    if k > 0:
        arr.sort()
        print(arr[k-1])
    else:
        print(-1)
    

def test_cases():
    # expected case
    kth_smallest_element([1,4,3,2], 3) #3
    # expected case
    kth_smallest_element([6,3,9,5], 2) #5
    # k = 0
    kth_smallest_element([6,3,9,5], 0) #-1

test_cases()