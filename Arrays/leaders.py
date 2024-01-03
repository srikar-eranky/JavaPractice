"""
Given an array of positive integers.
Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
Also, the rightmost element is always a leader.
"""

def find_leaders(arr):
    #would return array of integers
    # iterate through the array
    # check if each element is greater than everything to its right by
    # iterating through all the elements to the right and comparing
    # if it is a leader, add it to the list of leaders
    result_arr = []
    for i in range(0, len(arr)-1):
        is_leader = True
        for j in range(i+1, len(arr)):
            if arr[i] < arr[j] or arr[i] in result_arr:
                is_leader = False
        
        if is_leader:
            result_arr.append(arr[i])
            
    if arr[len(arr)-1] not in result_arr:
        result_arr.append(arr[len(arr)-1])   
    return result_arr

def test_cases():
    #test 1 - sorted in ascending order
    print(find_leaders([1,2,3,4,5])) # [5]
    #test 2 - sorted in descending order
    print(find_leaders([5,4,3,2,1])) # [5,4,3,2,1]
    #test 3 - 2 leaders other than last element
    print(find_leaders([6,2,1,4,3])) # [6,4,3]
    #test 4 - duplicates in array
    print(find_leaders([6,2,6,3,4])) # [6,4]
    #test 5 - all numbers are equal to each other
    print(find_leaders([5,5,5,5,5])) # [5]

test_cases()