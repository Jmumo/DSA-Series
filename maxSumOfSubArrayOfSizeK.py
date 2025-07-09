def maxSumOfArray(nums , k):
    maxSum = 0
    countSum = 0
    lower = 0
    
    for i in range(len(nums)):
        countSum += nums[i]
        if i >= k -1 :
            maxSum = max(countSum,maxSum )
            countSum -= nums[i -k + 1]
            
    return maxSum
        
if __name__ == "__main__":
    nums = [2, 1, 5, 1, 3, 2]
    k = 3
    result = maxSumOfArray(nums, k)
    print("Maximum sum of subarray of size", k, "is:", result)


# Given:
# 	•	An array of integers nums
# 	•	A positive integer k

# Goal:
# Find the maximum sum of any contiguous subarray of length exactly k.
