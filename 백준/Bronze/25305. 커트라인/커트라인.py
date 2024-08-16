n, k = map(int, input().split())
nums = [int(x) for x in input().split()]

nums.sort(reverse=True)

print(nums[k-1])