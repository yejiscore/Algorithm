nums = []

for _ in range(9):
  num = int(input())
  nums.append(num)

print(max(nums))
print(nums.index(max(nums))+1)