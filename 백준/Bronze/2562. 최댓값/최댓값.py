nums = [int(input()) for _ in range(9)]

max_value = max(nums)
print(max_value)
print(nums.index(max_value)+1)