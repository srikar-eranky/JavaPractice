"""
Given an array arr[] of positive integers of size N.
Reverse every sub-array of K group elements.
"""

def reverse_array(arr):
    # method for reversing one singular array
    # store the last element in a variable
    # shift all other elements in the array to the right
    # place the last element at the front of the array
    # repeat len(arr) times
    for i in range(0,len(arr)):
        last_elem = arr[len(arr)-1]
        for j in range(len(arr)-2,i-1,-1):
            arr[j+1]= arr[j]
        arr[i] = last_elem
    return arr

def reverse_sub_arrays(arr, k):
    #method for reversing every sub array
    # find each subarray in the array
    # call the reverse array method on each subarray
    # k has to be less than or equal to the length of the array, and greater than 1
    if k > len(arr):
        k = len(arr)
    count = 0
    while count + k <= len(arr):
        sub = arr[count:count+k]
        count = count + 1
        reversed_sub = reverse_array(sub)
        for number in reversed_sub:
            print(number, end='')
        print()
        


def test_cases():
    # test cases for reverse_array()
    #test case 1: length of list is multiple of k
    reverse_sub_arrays([1,2,3,4,5,6], 2)

    #test 2: length of list is not a multiple of k
    reverse_sub_arrays([1,2,3,4], 3)

    #test 3: another working case
    reverse_sub_arrays([1,2,3,4,5,6], 3)

    #test 4: k > length of array
    reverse_sub_arrays([1,2,3,4],7)

test_cases()


