"""
Given an array of integers, write a function that returns true if there is a triplet (a, b, c)
that satisfies a2 + b2 = c2.
"""

def is_triplet(arr):
    # place the squares of the elements in an array
    # sort the squares
    # have one pointer at the end of the array
    # have one pointer at the beginning
    # check if the sum of the elements at each pointer is equal to,
    # less than, or greater than an element at the third pointer
    # repeat until the pointers meet

    # if length of the array is less than 3 return false
    if len(arr) < 3:
        return False
    
    # sort array of squares
    arr = [x**2 for x in arr]
    arr.sort()

    for i in reversed(range(2,len(arr))):
        j = 0
        k = i-1
        while(j<k):
            if arr[j] + arr[k] == arr[i]:
                return True
            elif arr[j] + arr[k] < arr[i]:
                j += 1
            else:
                k -= 1
    
    return False

def test_cases():
    # repeats
    print(is_triplet([3,3,1,4,4,5,1,2])) # return True
    # no repeats, one triplet, worst case
    print(is_triplet([3,4,5,1,2])) # return True
    # worst case, one triplet, no repeats
    print(is_triplet([1,2,3,4,5])) # return True
    # best case, multiple triplets, repeats
    print(is_triplet([1,2,3,4,5,5,12,13])) # return True
    # not working case
    print(is_triplet([1,2,3,4,7,2])) # return False
    # has 0
    print(is_triplet([3,0,4,5])) # return true
    # has 0, but false
    print(is_triplet([1,0,7,4])) #return false
    # less than 3 elements
    print(is_triplet([1,2])) # returns false


test_cases()