n = int(input())
nums = list(map(int, input().split()))

for i in range(1, n):
  insert_point = i
  insert_value = nums[i]
  for j in range(i-1, -1, -1):
    if nums[j] < nums[i]:
      insert_point = j+1
      break
    if j == 0:
      insert_point = 0
  for j in range(i, insert_point, -1):
    nums[j] = nums[j-1]
  nums[insert_point] = insert_value

total = 0
personal_total = 0

for num in nums:
  personal_total += num
  total += personal_total

print(total)