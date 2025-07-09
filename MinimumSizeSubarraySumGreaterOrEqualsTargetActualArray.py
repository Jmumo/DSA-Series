def maxSumOfArray(nums , k):
    maxSum = float('-inf')
    countSum = 0
    lower = 0
    
    for i in range(len(nums)):
        countSum += nums[i]
        if i >= k - 1 :
            if countSum > maxSum:
                maxSum = countSum
                maxSubArray = nums[i -k + 1: i + 1]
            countSum -= nums[i - k + 1]
                 
            
    return maxSum , maxSubArray 
        
if __name__ == "__main__":
    nums = [2, 1, 5, 1, 3, 2]
    k = 3
    result, subarray = maxSumOfArray(nums, k)
    print("Maximum sum of subarray of size", k, "is:", result)
    print("Maximum sum of subarray of size", k, "is:", subarray)
