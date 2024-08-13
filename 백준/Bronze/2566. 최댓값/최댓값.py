max_num = -1
max_row = 0
max_col = 0

for i in range(9):
  nums = list((map(int, input().split())))
  x = max(nums)
  if max_num < x:
    max_num = x
    max_row = i + 1
    max_col = nums.index(x) + 1

print(max_num)
print(max_row, max_col)