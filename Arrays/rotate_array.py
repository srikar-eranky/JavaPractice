def rotate_array(arr, d):
    # given an unsorted array arr[] of size N, rotate it by D elements (counter clockwise).
    """
    store first element in variable
    shift each element in the array by one position to the left
    place the first element at the end
    do this D times
    """
    if d < 0:
        return "Enter a valid input"
    else:
        for j in range(0,d):
            first_element = arr[0]
            for i in range(1,len(arr)):
                arr[i-1] = arr[i]
            arr[len(arr)-1] = first_element
    
    return arr

def test_cases():
    #test 1: working case - should be [3,5,6,1,2,4]
    result = rotate_array([1,2,4,3,5,6], 3)
    print(result)
    #test 2: 2 elements - result should be [3,5]
    print(rotate_array([5,3],1))
    #test 3:  d = number of elements in array - should be initial array
    print(rotate_array([1,3,4,7,2,5], 6))
    #test 4: d = 0
    print(rotate_array([1,3,4,7,2,5], 0))
    #test 5: d < 0
    print(rotate_array([1,3,4,7,2,5], -1))

test_cases()