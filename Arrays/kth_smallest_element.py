"""
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
It is giveExpected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
note that all array elements are distinct.
"""

def kth_smallest_element(arr, k):
    arr.sort()
    print(arr[k-1])

def test_cases():
    kth_smallest_element([1,4,3,2], 3) #3
    kth_smallest_element([6,3,9,5], 2) #5

test_cases()