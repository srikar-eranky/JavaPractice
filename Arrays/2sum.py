def twoSum(nums, target):
    result = []
    j = len(nums)-1
    i = 0
    for i in range(len(nums)):
        for j in range(len(nums)-1,i,-1):
            if nums[i] + nums[j] == target:
                result.append(i)
                result.append(j)
                return result

def test_cases():
    print(twoSum([2,7,11,15],9))
    print(twoSum([3,2,4],6))
    print(twoSum([3,3],6))

test_cases()