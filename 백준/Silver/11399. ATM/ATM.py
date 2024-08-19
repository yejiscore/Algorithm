n = int(input())
nums = list(map(int, input().split()))

nums.sort()

total = 0
personal_total = 0

for num in nums:
  personal_total += num
  total += personal_total

print(total)