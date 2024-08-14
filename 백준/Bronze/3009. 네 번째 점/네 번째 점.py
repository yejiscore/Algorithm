nums = [list(map(int, input().split())) for _ in range(3)]
x = 0
y = 0

if nums[0][0] == nums[1][0]:
  x = nums[2][0]
elif nums[1][0] == nums[2][0]:
  x = nums[0][0]
else:
  x = nums[1][0]

if nums[0][1] == nums[1][1]:
  y = nums[2][1]
elif nums[1][1] == nums[2][1]:
  y = nums[0][1]
else:
  y = nums[1][1]

print(x, y)